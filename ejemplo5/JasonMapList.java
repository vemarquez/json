package com.mvit.json.ejemplo5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONValue;

public class JasonMapList {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Map m1 = new LinkedHashMap();
		  Map m2 = new HashMap();
		  List  l1 = new LinkedList();

		  m1.put("k11","v11");
		  m1.put("k12","v12");
		  m1.put("k13", "v13");
		  m2.put("k21","v21");
		  m2.put("k22","v22");
		  m2.put("k23","v23");
		  l1.add(m1);
		  l1.add(m2);
		  
		  String jsonString = JSONValue.toJSONString(l1);
          
		  System.out.println(jsonString);


	}

}
