package com.mvit.json.ejemplo1;
import org.json.simple.JSONObject;


public class JasonObjectBasico {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject obj=new JSONObject();
		  obj.put("Cliente","Mc. Donalds");
		  obj.put("Numero Cliente",new Integer(1030));
		  obj.put("balance",new Double(45000.21));
		  obj.put("cliente VIP",new Boolean(true));
		  obj.put("nombre comercial",null);
		  System.out.print(obj);
		

	}

}
