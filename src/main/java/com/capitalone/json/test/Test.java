package com.capitalone.json.test;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		List<Object> list = new ArrayList<Object>();
		
		  JSONParser parser = new JSONParser();
		  Gson gson = new Gson();
		  Object obj = parser.parse(new FileReader("/home/amitprasad/MyFolder/eclipseWKSP_Lubuntu/json/src/main/resources/employee.json"));

          JSONArray jsonObject = (JSONArray) obj;
         Employee emp[]  = new Employee[jsonObject.size()]; 
          
          
          for(int i=0 ; i<jsonObject.size()-1; i++)
          {
        	  //System.out.println(jsonObject.get(i));
        	  emp[i] = gson.fromJson(jsonObject.get(i).toString(), Employee.class);
        	  list.add(emp[i]);
          }
          
          for(Object O : list)
          {
        	  Employee emp1 = (Employee) O;
        	  if(Integer.parseInt(emp1.getAge()) > 23)
        	  {
        		  System.out.println(emp1.toString()); 
        	  }
        	  
          }
          

	}
	
	
	
}
