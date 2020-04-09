package com.webdriver.automation.tests;


import java.net.MalformedURLException;

import ru.GoogleSearchOperations;

public class SeleniumStandaloneServerTest1 extends GoogleSearchOperations {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		
		String keyword="";
		
		if (args.length>0) {
			keyword=args[0];
		} else {
			keyword="Test Selenium";
		}
		
		System.out.println("argument:::"+keyword);
		GoogleSearchOperations opeartion= new GoogleSearchOperations();
		String result = opeartion.performSearch(keyword);
		System.out.println(" result statistics ::: "+result);
	}
	
}
