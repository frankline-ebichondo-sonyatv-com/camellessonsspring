package com.sonyatv.camel.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddHelloWorldProcessor implements Processor{

	
	
	public void process(Exchange exchange) throws Exception {
		Logger logger = LoggerFactory.getLogger(AddHelloWorldProcessor.class);
		String simple = exchange.getIn().getBody(String.class);
		System.out.println("Withins add helloworld processor");
		logger.info("simple: " + simple);
		
	}

}
