package com.claudiocsfilho.desafio1_inj_dep.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claudiocsfilho.desafio1_inj_dep.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public Double total(Order order) {
		return order.getBasic() - (order.getBasic()*(order.getDiscount()/100)) + shippingService.shipment(order);
	}

}
