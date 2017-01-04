/**
 * @author: chenlwh
 * @date: Jan 4, 2017 3:45:01 PM
 * @description:All Right Reserved.
 */
package com.hone.util;

/**
 * 
 */
public class HardwareInfo {
	public String url = "http://114.55.224.29/blacksheepservice/prefervideo";
	public String sort = "hardware";
	public String countryName;
	public String machineType;
	public String model;
	public String featureCode;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getMachineType() {
		return machineType;
	}
	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFeatureCode() {
		return featureCode;
	}
	public void setFeatureCode(String featureCode) {
		this.featureCode = featureCode;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer(url);
		buffer.append("?name=hardware");
		if(countryName!=null){
			buffer.append("&countryName=" + countryName);
		}
		if(machineType!=null){
			buffer.append("&machineType=" + machineType);
		}
		if(model!=null){
			buffer.append("&model=" + model);
		}
		if(featureCode!=null){
			buffer.append("&featureCode=" + featureCode);
		}
		// TODO Auto-generated method stub
		return buffer.toString();
	}
	
}
