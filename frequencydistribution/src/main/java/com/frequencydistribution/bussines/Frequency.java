package com.frequencydistribution.bussines;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frequencydistribution.model.DistributionTable;
import com.frequencydistribution.services.IFrequency;
import com.frequencydistribution.services.IUtilities;

@Service
public class Frequency implements IFrequency {

	@Autowired
	IUtilities utils;
	private DecimalFormat df2;
	
	public Frequency() {
		df2 = new DecimalFormat("#.##");
	}
	
	@Override
	public int GetRange(String sample) {
		//formule: R = Xmax - Xmin
		int max = utils.FindMaxValue(sample.split(","));
		int min = utils.FindMinValue(sample.split(","));
		int R = (max - min);
		return R;
	}

	@Override
	public int GetIntervals(int logarithm) {
		//formule: K = 1+3.322Logn
		int K = 0;
		double log = Math.log10(logarithm);
		double result = (1+3.32) * log;
		
		if (result%2 == 0) {
			K = (int) Math.floor(result);
		}
		else {
			K = (int) result;
		}
		
		return K;
	}

	@Override
	public double GetAmplitude(float range, float intervals) {
		//formule: A = R / K
		df2.setRoundingMode(RoundingMode.UP);
		double A = Math.round(range / intervals);
		return A;
	}

	@Override
	public List<DistributionTable> FrequencyDistribution(String[] sample, double interval, int range) {
		List<DistributionTable> DistributionList = new ArrayList<DistributionTable>();
		
		int value = utils.FindMinValue(sample);
		int fa = 0;
		int samplelength = sample.length;
		float fr;
		
		for(int i = 0; i < range; i++) {
			//Amplitude
			int oldVal = value;
			value += interval;
			String amplitude = ""+ oldVal +" - " + "" + value;
			
			//Clase (x)
			int x = (int) ((oldVal + value)  / interval);
			
			//Frequency Absolute (F)
			int f = 0;
			for (String item: sample) {
				int digit = Integer.parseInt(item);
				if (digit >= oldVal && digit < value) {
					f++;
				}
			}
			
			//Frequency Relative (Fr)
			fr = ((float) f / (float) samplelength);
			
			//Frequency Absolute Accumulate (F)
			fa += f;
			
			//Add new value
			DistributionList.add(new DistributionTable(amplitude,x ,f ,String.format("%.2f", fr) , fa));
		}
		
		return DistributionList;
	}

}
