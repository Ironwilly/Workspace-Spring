package com.example.demo;

import org.springframework.stereotype.Controller;


public interface ITranslator {
	
	public String translate ();
	public String translate (String word);

}
