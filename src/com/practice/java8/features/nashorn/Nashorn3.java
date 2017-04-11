package com.practice.java8.features.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Working with java types from javascript.
 *
 * @author sahays
 */
public class Nashorn3 {

	public static void main(String args[]){
	      ScriptEngineManager scriptEngineManager = new ScriptEngineManager(); 
	      ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn"); 
	      
	      String name = "Sahays"; 

	      Integer result = null;
	      try {
	         nashorn.eval("print('" + name + "')");
	         result = (Integer) nashorn.eval("10 + 2");
	         System.out.println(nashorn.getFactory().getLanguageName());
	         System.out.println(nashorn.getFactory().getEngineName());
	         System.out.println(nashorn.getFactory().getLanguageVersion());
	         System.out.println(nashorn.getFactory().getEngineVersion());
	      }catch(ScriptException e){
	         System.out.println("Error executing script: "+ e.getMessage());
	      }
	      System.out.println(result.toString());
	   } 
}
