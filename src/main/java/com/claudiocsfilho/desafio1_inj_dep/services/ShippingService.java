package com.claudiocsfilho.desafio1_inj_dep.services;

import org.springframework.stereotype.Service;

import com.claudiocsfilho.desafio1_inj_dep.entities.Order;

@Service
public class ShippingService {
	
	public Double shipment(Order order) {
		Double shipValue;
		if(order.getBasic() < 100.00) {
			shipValue = 20.00;
		} else if (order.getBasic() >= 100.00 && order.getBasic() < 200.00) {
			shipValue = 12.00;
		} else {
			shipValue = 0.0;
		}
		return shipValue;
	}
}
