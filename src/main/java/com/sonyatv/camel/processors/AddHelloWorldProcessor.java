package com.sonyatv.camel.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddHelloWorldProcessor implements Processor{

	static Logger logger = LoggerFactory.getLogger(AddHelloWorldProcessor.class);
	public void process(Exchange exchange) throws Exception {
		String simple = exchange.getIn().getBody(String.class);
		logger.info("simple: " + simple);
		
	}

}
