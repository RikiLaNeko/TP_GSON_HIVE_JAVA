package org.example.pogo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DecodedPayload{

	@SerializedName("numberOfReadings")
	private int numberOfReadings;

	@SerializedName("msgType")
	private String msgType;

	@SerializedName("readings")
	private List<ReadingsItem> readings;

	@SerializedName("backlogMsgCount")
	private int backlogMsgCount;

	@SerializedName("options")
	private List<String> options;

	@SerializedName("alarmMsgCount")
	private int alarmMsgCount;

	@SerializedName("batteryCapacity")
	private String batteryCapacity;

	@SerializedName("timestamp")
	private Timestamp timestamp;

	public int getNumberOfReadings(){
		return numberOfReadings;
	}

	public String getMsgType(){
		return msgType;
	}

	public List<ReadingsItem> getReadings(){
		return readings;
	}

	public int getBacklogMsgCount(){
		return backlogMsgCount;
	}

	public List<String> getOptions(){
		return options;
	}

	public int getAlarmMsgCount(){
		return alarmMsgCount;
	}

	public String getBatteryCapacity(){
		return batteryCapacity;
	}

	public Timestamp getTimestamp(){
		return timestamp;
	}
}