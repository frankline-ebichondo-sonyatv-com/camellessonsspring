package com.sonyatv.camel.beans;

public class AddHelloWorldBean {

	public String simple(String message){
		System.out.println("Message: " + message);
		return "Most Hello: " + message;
	}
	
	/*
	 * Two methods within a class cannot work. Instead they act as input for each other thereby running the input into an endless loop
	 * 
	public String canItTwiceSimple(String message){
		System.out.println("Message: " + message);
		return "Most Hello: " + message;
	}
	*/
}
