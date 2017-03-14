package com.mvit.json.ejemplo1;


import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONValue;


 
public class JsonUsingMap {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		 @SuppressWarnings("rawtypes")
		Map obj=new LinkedHashMap();
		  obj.put("name","foo");
		  obj.put("num",new Integer(100));
		  obj.put("balance",new Double(1000.21));
		  obj.put("is_vip",new Boolean(true));
		  obj.put("nickname",null);
		  String jsonText = JSONValue.toJSONString(obj);
		  System.out.print(jsonText);

	}

}
