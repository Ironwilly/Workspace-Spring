package com.example.demo;

import java.util.HashMap;

public class SpanishTranslator implements ITranslator {

	private HashMap dictionary2;
	
	
	 public SpanishTranslator() {
		// TODO Auto-generated constructor stub
	
		super();
		this.dictionary2 = new HashMap<String,String>();
		
		dictionary2.put("uno", "one");
		dictionary2.put("pajaro", "bird");
		dictionary2.put("rojo", "red");
		dictionary2.put("gato", "cat");
		dictionary2.put("casa", "house");
		dictionary2.put("flor", "flower");
		dictionary2.put("cohete", "rocket");
	}
	
	
	@Override
	public String translate() {
		
		
		return dictionary2.toString();
	}

	@Override
	public String translate(String word) {
		// TODO Auto-generated method stub
		return translate(word);
	}

	
}
