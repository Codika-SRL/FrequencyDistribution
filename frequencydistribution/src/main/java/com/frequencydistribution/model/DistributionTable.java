package com.frequencydistribution.model;

public class DistributionTable {

	public String Intervals;
	public int Clases;
	public int FrequencyAbsolute;
	public String FrequencyRelative;
	public int FrequencyAbsoluteAccumulate;

	public DistributionTable(String Intervals, int Class, int FrequencyAbsolute, String FrequencyRelative,
			int FrequencyAbsoluteAccumulate) {

		this.Intervals = Intervals;
		this.Clases = Class;
		this.FrequencyAbsolute = FrequencyAbsolute;
		this.FrequencyRelative = FrequencyRelative;
		this.FrequencyAbsoluteAccumulate = FrequencyAbsoluteAccumulate;
	}
}
