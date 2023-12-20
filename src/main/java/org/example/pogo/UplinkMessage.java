package org.example.pogo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UplinkMessage{

	@SerializedName("settings")
	private Settings settings;

	@SerializedName("frm_payload")
	private String frmPayload;

	@SerializedName("session_key_id")
	private String sessionKeyId;

	@SerializedName("received_at")
	private String receivedAt;

	@SerializedName("version_ids")
	private VersionIds versionIds;

	@SerializedName("f_port")
	private int fPort;

	@SerializedName("f_cnt")
	private int fCnt;

	@SerializedName("decoded_payload")
	private DecodedPayload decodedPayload;

	@SerializedName("confirmed")
	private boolean confirmed;

	@SerializedName("network_ids")
	private NetworkIds networkIds;

	@SerializedName("rx_metadata")
	private List<RxMetadataItem> rxMetadata;

	@SerializedName("consumed_airtime")
	private String consumedAirtime;

	public Settings getSettings(){
		return settings;
	}

	public String getFrmPayload(){
		return frmPayload;
	}

	public String getSessionKeyId(){
		return sessionKeyId;
	}

	public String getReceivedAt(){
		return receivedAt;
	}

	public VersionIds getVersionIds(){
		return versionIds;
	}

	public int getFPort(){
		return fPort;
	}

	public int getFCnt(){
		return fCnt;
	}

	public DecodedPayload getDecodedPayload(){
		return decodedPayload;
	}

	public boolean isConfirmed(){
		return confirmed;
	}

	public NetworkIds getNetworkIds(){
		return networkIds;
	}

	public List<RxMetadataItem> getRxMetadata(){
		return rxMetadata;
	}

	public String getConsumedAirtime(){
		return consumedAirtime;
	}
}