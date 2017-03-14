package com.mvit.json.ejemplo2;

import org.json.simple.JSONArray;

public class JsonArray {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {				  
		  JSONArray list = new JSONArray();
		  list.add("foo");
		  list.add(new Integer(100));
		  list.add(new Double(1000.21));
		  list.add(new Boolean(true));
		  list.add(null);
		  System.out.print(list);

	}

}
