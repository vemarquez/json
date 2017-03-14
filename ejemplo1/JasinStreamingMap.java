package com.mvit.json.ejemplo1;


import java.io.IOException;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONValue;


public class JasinStreamingMap {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		 @SuppressWarnings("rawtypes")
		Map obj=new LinkedHashMap();
		   obj.put("name","foo");
		   obj.put("num",new Integer(100));
		   obj.put("balance",new Double(1000.21));
		   obj.put("is_vip",new Boolean(true));
		   obj.put("nickname",null);
		   StringWriter out = new StringWriter();
		   try {
			JSONValue.writeJSONString(obj, out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   String jsonText = out.toString();
		   System.out.print(jsonText);

	}

}
