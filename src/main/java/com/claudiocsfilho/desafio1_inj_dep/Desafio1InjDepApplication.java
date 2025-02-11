package com.claudiocsfilho.desafio1_inj_dep;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.claudiocsfilho.desafio1_inj_dep.entities.Order;
import com.claudiocsfilho.desafio1_inj_dep.services.OrderService;

@SpringBootApplication
public class Desafio1InjDepApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio1InjDepApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código: ");
		int code = sc.nextInt();
		System.out.print("Digite o valor básico: ");
		double basic = sc.nextDouble();
		System.out.print("Digite a porcentagem de desconto: ");
		double discount = sc.nextDouble();
		
		Order order = new Order(code, basic, discount);
		
		System.out.println("\n####\nPedido código: " + order.getCode());
		System.out.println("Valor total: R$" + orderService.total(order));
		
		sc.close();
	}

}
