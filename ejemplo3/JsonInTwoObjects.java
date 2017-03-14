package com.mvit.json.ejemplo3;

import org.json.simple.JSONObject;

public class JsonInTwoObjects {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		 JSONObject obj1 = new JSONObject();
		  obj1.put("name","foo");
		  obj1.put("num",new Integer(100));
		  obj1.put("balance",new Double(1000.21));
		                
		  JSONObject obj2 = new JSONObject();
		  obj2.put("is_vip",new Boolean(true));
		  obj2.put("nickname",null);
		  obj2.putAll(obj1);
		  System.out.print(obj2);

	}

}
