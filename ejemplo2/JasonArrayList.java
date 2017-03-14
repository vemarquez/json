package com.mvit.json.ejemplo2;

import java.util.LinkedList;

import org.json.simple.JSONValue;

public class JasonArrayList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//import org.json.simple.JSONValue;
		  
		  @SuppressWarnings("rawtypes")
		LinkedList list = new LinkedList();
		  list.add("foo");
		  list.add(new Integer(100));
		  list.add(new Double(1000.21));
		  list.add(new Boolean(true));
		  list.add(null);
		  String jsonText = JSONValue.toJSONString(list);
		  System.out.print(jsonText);

	}

}
