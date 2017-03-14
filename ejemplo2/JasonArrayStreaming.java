package com.mvit.json.ejemplo2;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONArray;

public class JasonArrayStreaming {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		  
		  JSONArray list = new JSONArray();
		  list.add("foo");
		  list.add(new Integer(100));
		  list.add(new Double(1000.21));
		  list.add(new Boolean(true));
		  list.add(null);
		  StringWriter out = new StringWriter();
		  try {
			list.writeJSONString(out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  String jsonText = out.toString();
		  System.out.print(jsonText);

	}

}
