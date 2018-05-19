package com.si.lab.activators;

import org.springframework.messaging.Message;

import com.si.lab.beans.generated.Shiporder;
import com.si.lab.beans.generated.Shiporder.Item;

public class RevenueServiceActivator{

	private double revenue = 0.0;

	public Message<Shiporder> adjustRevenue(Message<Shiporder> order) { 
		System.out.println("Processing order"); 
		for (Item item : order.getPayload().getItem()) { 
			revenue = revenue + (item.getPrice().doubleValue() * item.getQuantity() .intValue());
			System.out.println("Revenue now up to: " + revenue); 
		} 
		System.out.println("Done processing order"); 
		return order; 
	}

}
