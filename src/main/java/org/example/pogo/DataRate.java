package org.example.pogo;

import com.google.gson.annotations.SerializedName;

public class DataRate{

	@SerializedName("lora")
	private Lora lora;

	public Lora getLora(){
		return lora;
	}
}