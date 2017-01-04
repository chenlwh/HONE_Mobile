/**
 * @author: chenlwh
 * @date: Jan 4, 2017 3:31:28 PM
 * @description:All Right Reserved for Price Service.
 */
package com.hone.util;

import org.json.JSONObject;

/**
 * 
 */
public class HWPriceService {
	
	public JSONObject fetchSoftwareData(SoftwareInfo info) throws Exception{		
		return JSONUtil.getJSONObject(info.toString());
	}
	
	public JSONObject fetchHardwareData(HardwareInfo info) throws Exception{
		return JSONUtil.getJSONObject(info.toString());
	}

}
