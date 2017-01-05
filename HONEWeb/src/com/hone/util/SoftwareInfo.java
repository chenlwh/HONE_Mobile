/**
 * @author: chenlwh
 * @date: Jan 4, 2017 3:44:18 PM
 * @description:All Right Reserved for Party Service.
 */
package com.hone.util;

/**
 * 
 */
public class SoftwareInfo extends HardwareInfo{
	public String url = "http://114.55.224.29/blacksheepservice/prefervideo";
	public String sort = "software";
	public String countryName;
	public String programNum;
	public String programCode;
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
	public String getProgramNum() {
		return programNum;
	}
	public void setProgramNum(String programNum) {
		this.programNum = programNum;
	}
	public String getProgramCode() {
		return programCode;
	}
	public void setProgramCode(String programCode) {
		this.programCode = programCode;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer(url);
		buffer.append("?name=software");
		if(countryName!=null){
			buffer.append("&countryName=" + countryName);
		}
		if(programNum!=null){
			buffer.append("&programNum=" + programNum);
		}
		if(programCode!=null){
			buffer.append("&programCode=" + programCode);
		}
		// TODO Auto-generated method stub
		return buffer.toString();
	}
	

}
