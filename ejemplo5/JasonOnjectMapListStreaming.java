package com.mvit.json.ejemplo5;

import java.io.IOException;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import org.json.simple.JSONObject;

public class JasonOnjectMapListStreaming {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		StringWriter out = new StringWriter();
        
		  JSONObject obj = new JSONObject();
		  LinkedHashMap m1 = new LinkedHashMap();
		  LinkedList l1 = new LinkedList();
		  obj.put("k1", "v1");
		  obj.put("k2", m1);
		  obj.put("k3", l1);
		  m1.put("mk1", "mv1");
		  l1.add("lv1");
		  l1.add("lv2");
		  m1.put("mk2", l1);
		        
		  try {
			obj.writeJSONString(out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("jsonString:");
		  System.out.println(out.toString());
		  String jsonString = obj.toJSONString();
		  System.out.println(jsonString);

	}

}
