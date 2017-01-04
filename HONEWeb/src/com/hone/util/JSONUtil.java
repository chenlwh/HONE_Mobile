/**
 * @author: chenlwh
 * @date: Dec 21, 2016 4:02:01 PM
 * @description:All Right Reserved
 */
package com.hone.util;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONUtil {

	public static JSONArray getJSONArray(String urlPath) throws Exception {
		byte[] data = readParse(urlPath);
		String dataString = new String(data);
		JSONArray array = new JSONArray(dataString);

		return array;

	}
	
	public static JSONObject getJSONObject(String urlPath) throws Exception {
		byte[] data = readParse(urlPath);
		String dataString = new String(data);
		JSONObject obj = new JSONObject(dataString);

		return obj;
	}

	public static byte[] readParse(String urlPath) throws Exception {
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		byte[] data = new byte[1024];
		int len = 0;

		URL url = new URL(urlPath);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		InputStream inStream = conn.getInputStream();
		while ((len = inStream.read(data)) != -1) {
			outStream.write(data, 0, len);
		}
		inStream.close();

		return outStream.toByteArray();

	}

}
