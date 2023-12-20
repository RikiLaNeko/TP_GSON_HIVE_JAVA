package org.example.pogo;

import com.google.gson.annotations.SerializedName;

public class Timestamp{

	@SerializedName("hours")
	private int hours;

	@SerializedName("seconds")
	private int seconds;

	@SerializedName("month")
	private String month;

	@SerializedName("year")
	private int year;

	@SerializedName("minutes")
	private int minutes;

	@SerializedName("day")
	private int day;

	public int getHours(){
		return hours;
	}

	public int getSeconds(){
		return seconds;
	}

	public String getMonth(){
		return month;
	}

	public int getYear(){
		return year;
	}

	public int getMinutes(){
		return minutes;
	}

	public int getDay(){
		return day;
	}
}