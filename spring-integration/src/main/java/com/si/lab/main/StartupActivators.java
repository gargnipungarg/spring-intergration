package com.si.lab.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
public class StartupActivators {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("/META-INF/spring/si-components-activators.xml");
		System.out.println("Activators testing.");
	}
}
