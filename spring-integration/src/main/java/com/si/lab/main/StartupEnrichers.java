package com.si.lab.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
public class StartupEnrichers {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("/META-INF/spring/si-components-enrichers.xml");
		System.out.println("Enrichers testing.");
	}
}
