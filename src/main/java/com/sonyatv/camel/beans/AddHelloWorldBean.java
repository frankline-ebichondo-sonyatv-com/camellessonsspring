package com.sonyatv.camel.beans;

public class AddHelloWorldBean {

	public String simple(String message){
		System.out.println("Message: " + message);
		return "Most Hello: " + message;
	}
}
