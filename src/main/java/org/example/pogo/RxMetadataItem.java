package org.example.pogo;

import com.google.gson.annotations.SerializedName;

public class RxMetadataItem{

	@SerializedName("rssi")
	private int rssi;

	@SerializedName("uplink_token")
	private String uplinkToken;

	@SerializedName("channel_index")
	private int channelIndex;

	@SerializedName("snr")
	private double snr;

	@SerializedName("channel_rssi")
	private int channelRssi;

	@SerializedName("location")
	private Location location;

	@SerializedName("gateway_ids")
	private GatewayIds gatewayIds;

	@SerializedName("timestamp")
	private long timestamp;

	@SerializedName("time")
	private String time;

	public int getRssi(){
		return rssi;
	}

	public String getUplinkToken(){
		return uplinkToken;
	}

	public int getChannelIndex(){
		return channelIndex;
	}

	public double getSnr(){
		return snr;
	}

	public int getChannelRssi(){
		return channelRssi;
	}

	public Location getLocation(){
		return location;
	}

	public GatewayIds getGatewayIds(){
		return gatewayIds;
	}

	public long getTimestamp(){
		return timestamp;
	}

	public String getTime(){
		return time;
	}
}