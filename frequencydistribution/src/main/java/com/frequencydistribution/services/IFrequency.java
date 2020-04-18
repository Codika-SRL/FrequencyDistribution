package com.frequencydistribution.services;

public interface IFrequency {
	float GetRange(float min, float max);
	float GetIntervals(float logarithm);
	float GetAmplitude(float range, float Intervals);
	void FrequencyDistribution(float range, float interval, float amplitude);
}
