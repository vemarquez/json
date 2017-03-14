package com.mvit.json.ejemplo6;

import org.json.simple.JSONArray;
import org.json.simple.JSONAware;
import org.json.simple.JSONObject;

class User implements JSONAware{
    private int id;
    private String name;
    @SuppressWarnings("unused")
	private String password;
    
    public User(int id, String name, String password){
            this.id = id;
            this.name = name;
            this.password = password;
    }
    
    public String toJSONString(){
            StringBuffer sb = new StringBuffer();
            
            sb.append("{");
            
            sb.append(JSONObject.escape("userName"));
            sb.append(":");
            sb.append("\"" + JSONObject.escape(name) + "\"");
            
            sb.append(",");
            
            sb.append(JSONObject.escape("ID"));
            sb.append(":");
            sb.append(id);
            
            sb.append("}");
            
            return sb.toString();
    }
}


public class Salida {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		 JSONArray users = new JSONArray();
		  users.add(new User(123,"foo1", "secret1"));
		  users.add(new User(124,"foo2", "secret2"));
		  users.add(new User(125,"\"foo2\"", "secret2"));
		  System.out.println(users);

	}

}
