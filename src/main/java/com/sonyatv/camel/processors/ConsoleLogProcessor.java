package com.sonyatv.camel.processors;

import org.apache.camel.Exchange;

public class ConsoleLogProcessor{

	public void process(Exchange exchange) throws Exception {
		System.out.println("Moved:" + exchange.getIn().getHeader("CamelFileName") + " from ftp server to jms queue");
		
	}

}
