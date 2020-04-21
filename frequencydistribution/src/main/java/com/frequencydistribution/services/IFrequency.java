package com.frequencydistribution.services;

import java.util.List;

import com.frequencydistribution.model.DistributionTable;

public interface IFrequency {
	int GetRange(String sample);
	int GetIntervals(int logarithm);
	double GetAmplitude(float range, float intervals);
	List<DistributionTable> FrequencyDistribution(String[] sample, double interval, int range);
}
