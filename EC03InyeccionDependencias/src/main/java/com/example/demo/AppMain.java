package com.example.demo;

import java.util.Dictionary;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;



import lombok.RequiredArgsConstructor;


@Component
@RequiredArgsConstructor
public class AppMain {
	
	
	
	private final EnglishTranslator englishTranslator;
		
	
	@PostConstruct
	public void init() {
		
		String hola =englishTranslator.translate("Hola");
		System.out.println("Hola ->" + hola);
	}
	
	

}
