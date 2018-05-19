package com.si.lab.activators;

import org.springframework.messaging.Message;

import com.si.lab.beans.enrichment.Shiporder;
import com.si.lab.beans.enrichment.Shiporder.Item;



public class ShipOrderEnricher {

	public double computeTotal(Message<Shiporder> order) {
		System.out.println("Adding content in payload");
		double sum = 0;
		for (Item item : order.getPayload().getItem()) {
			sum = sum
					+ (item.getPrice().doubleValue() * item.getQuantity()
							.intValue());
		}
		System.out.println("Content added"+sum);
		return sum;
	}

}
