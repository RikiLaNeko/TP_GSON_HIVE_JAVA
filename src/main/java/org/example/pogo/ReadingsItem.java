package org.example.pogo;

import com.google.gson.annotations.SerializedName;

public class ReadingsItem{

	@SerializedName("temperature")
	private double temperature;

	@SerializedName("humidity")
	private int humidity;

	public double getTemperature(){
		return temperature;
	}

	public int getHumidity(){
		return humidity;
	}
}