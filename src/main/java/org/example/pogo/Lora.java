package org.example.pogo;

import com.google.gson.annotations.SerializedName;

public class Lora{

	@SerializedName("bandwidth")
	private int bandwidth;

	@SerializedName("spreading_factor")
	private int spreadingFactor;

	public int getBandwidth(){
		return bandwidth;
	}

	public int getSpreadingFactor(){
		return spreadingFactor;
	}
}