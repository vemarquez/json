package com.mvit.json.ejemplo1;
import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;


public class JsonStreaming {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//import org.json.simple.JSONObject;
		  
		  JSONObject obj=new JSONObject();
		  obj.put("Cliente","foo");
		  obj.put("Número Cliente",new Integer(100));
		  obj.put("Balance",new Double(51000.21));
		  obj.put("Cliente VIP",new Boolean(true));
		  obj.put("Nombre Corporativo",null);
		  StringWriter out = new StringWriter();
		  
		  try {
			obj.writeJSONString(out);
		} catch (IOException e) {			
			e.printStackTrace();
		}
		  String jsonText = out.toString();
		  System.out.print(jsonText);

	}

}
