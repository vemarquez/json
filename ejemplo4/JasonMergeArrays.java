package com.mvit.json.ejemplo4;

import org.json.simple.JSONArray;

public class JasonMergeArrays {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONArray list1 = new JSONArray();
		  list1.add("foo");
		  list1.add(new Integer(100));
		  list1.add(new Double(1000.21));
		  
		  JSONArray list2 = new JSONArray();
		  list2.add(new Boolean(true));
		  list2.add(null);
		  list2.addAll(list1);
		  System.out.print(list2);

	}

}
