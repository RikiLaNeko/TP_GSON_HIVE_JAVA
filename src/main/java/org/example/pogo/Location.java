package org.example.pogo;

import com.google.gson.annotations.SerializedName;

public class Location{

	@SerializedName("altitude")
	private int altitude;

	@SerializedName("latitude")
	private double latitude;

	@SerializedName("source")
	private String source;

	@SerializedName("longitude")
	private double longitude;

	public int getAltitude(){
		return altitude;
	}

	public double getLatitude(){
		return latitude;
	}

	public String getSource(){
		return source;
	}

	public double getLongitude(){
		return longitude;
	}
}