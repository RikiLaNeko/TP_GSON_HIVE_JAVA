package org.example.pogo;

import com.google.gson.annotations.SerializedName;

public class NetworkIds{

	@SerializedName("tenant_id")
	private String tenantId;

	@SerializedName("cluster_id")
	private String clusterId;

	@SerializedName("net_id")
	private String netId;

	public String getTenantId(){
		return tenantId;
	}

	public String getClusterId(){
		return clusterId;
	}

	public String getNetId(){
		return netId;
	}
}