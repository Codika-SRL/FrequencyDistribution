package com.frequencydistribution.bussines;

import java.util.Arrays;
import java.util.Collections;
import org.springframework.stereotype.Service;

import com.frequencydistribution.services.IUtilities;

@Service
public class Utilities implements IUtilities {

	@Override
	public int FindMinValue(String[] sample) {
		String min = Collections.min(Arrays.asList(sample));
		return Integer.parseInt(min);
	}

	@Override
	public int FindMaxValue(String[] sample) {
		String max = Collections.max(Arrays.asList(sample));
		return Integer.parseInt(max);
	}	
}
