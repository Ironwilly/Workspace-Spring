package com.example.demo;

import java.util.Dictionary;
import java.util.HashMap;

import lombok.Data;

@Data
public class EnglishTranslator implements ITranslator{
	
	private HashMap dictionary;
	
	
	
	
	
	
	
	
	public EnglishTranslator() {
		super();
		this.dictionary = new HashMap<String,String>();
		
		dictionary.put("one", "uno");
		dictionary.put("bird", "pajaro");
		dictionary.put("red", "rojo");
		dictionary.put("cat", "gato");
		dictionary.put("house", "casa");
		dictionary.put("flower", "flor");
		dictionary.put("rocket", "cohete");
	}

	
	
	
	
	
	@Override
	public String translate() {
		// TODO Auto-generated method stub
		return translate();
	}

	@Override
	public String translate(String word) {
		// TODO Auto-generated method stub
		return translate(word);
	}
	
	
	

}
