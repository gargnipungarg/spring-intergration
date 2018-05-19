package com.si.lab.main;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.si.lab.beans.service.PigLatinService;
public class StartupServiceGateways {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("/META-INF/spring/si-components-svc-gtw.xml");
		System.out.println("Service Gateways testing.");
		PigLatinService service = context.getBean("latinService", PigLatinService.class);
		Future<String> future = service.translate("Hello world");
		String serviceOutput = "";
		try {
			serviceOutput = future.get(5000, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
		System.out.println(serviceOutput);
		context.close();
	}
}
