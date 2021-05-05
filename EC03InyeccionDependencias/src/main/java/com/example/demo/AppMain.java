package com.example.demo;

import java.util.Dictionary;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;



import lombok.RequiredArgsConstructor;



@Controller
@RequiredArgsConstructor
public class AppMain {
	
	String word;
	
	Scanner sc = new Scanner(System.in);
	
	
	
	@Autowired
	private ITranslator translator;
	
	@PostConstruct
	public void init() {
		
		System.out.println("Escribe una palabra \n");
		word = sc.nextLine();
		System.out.println(translator.translate());
		System.out.println(translator.translate(word));
		
	}
	

}
