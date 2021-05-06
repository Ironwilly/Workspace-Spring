package com.example.demo;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import lombok.Data;

@Service
public class EnglishTranslator implements ITranslator {

	private Map<String, String> words;

	public EnglishTranslator() {
		// TODO Auto-generated constructor stub

		words = new HashMap<>();
		words.put("Hola", "Hello");

	}

	@Override
	public String translate() {
		// TODO Auto-generated method stub
		return translate();
	}

	@Override
	public String translate(String word) {
		// TODO Auto-generated method stub
		return words.get(word);
	}

}
