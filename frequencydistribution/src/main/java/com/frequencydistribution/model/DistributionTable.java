package com.frequencydistribution.model;

public class DistributionTable {
	
	private String Intervals;
	private int FrequencyAbsolute;
	private int FrequencyAbsoluteAccumulate;
	private float FrequencyRelative;
	private float FrequencyRelativeAccumulate;
	
	public DistributionTable() {}

	public void SetIntervals(String Intervals) {
		this.Intervals = Intervals;
	}
	
	public String GetIntervals() {
		return this.Intervals;
	}

	public void SetFrequencyAbsolute(int FrequencyAbsolute) {
		this.FrequencyAbsolute = FrequencyAbsolute;
	}
	
	public int GetFrequencyAbsolute() {
		return this.FrequencyAbsolute;
	}
	
	public void SetFrequencyAbsoluteAccumulate(int FrequencyAbsoluteAccumulate) {
		this.FrequencyAbsoluteAccumulate = FrequencyAbsoluteAccumulate;
	}
	
	public int GetFrequencyAbsoluteAccumulate() {
		return this.FrequencyAbsoluteAccumulate;
	}

	public void SetFrequencyRelative(float FrequencyRelative) {
		this.FrequencyRelative = FrequencyRelative;
	}
	
	public float GetFrequencyRelative() {
		return this.FrequencyRelative;
	}

	public void SetFrequencyRelativeAccumulate(float FrequencyRelativeAccumulate) {
		this.FrequencyRelativeAccumulate = FrequencyRelativeAccumulate;
	}
	
	public float GetFrequencyRelativeAccumulate() {
		return this.FrequencyRelativeAccumulate;
	}
	
}
