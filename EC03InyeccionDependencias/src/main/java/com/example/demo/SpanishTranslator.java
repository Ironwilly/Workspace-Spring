package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class SpanishTranslator implements ITranslator {

	
	
	private Map<String,String> words ;
	
	
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
