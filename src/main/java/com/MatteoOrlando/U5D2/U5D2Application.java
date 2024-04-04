package com.MatteoOrlando.U5D2;


import com.MatteoOrlando.U5D2.entities.*;
import com.MatteoOrlando.U5D2.entities.config.ApplicationProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.List;

@SpringBootApplication
@Slf4j
public class U5D2Application implements CommandLineRunner {

	@Autowired
	private ApplicationProperties applicationProperties;

    public static void main(String[] args) {
		SpringApplication.run(U5D2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Inizializzazione
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5D2Application.class);
		Menu menu = (Menu) ctx.getBean("menu");

		// Creazione di un ordine
		Order order = new Order();
		order.setOrderNumber(1);
		order.setStatus(OrderStatus.IN_PROGRESS);
		order.setNumberOfGuests(4);
		order.setAcquisitionTime(LocalTime.now());
		order.setItems(menu.getPizzaList());

		// Calcolo dell'importo totale dell'ordine
		double totalAmount = calculateTotalAmount(order);

		// Stampa dell'ordine
		log.info("Order Number: {}", order.getOrderNumber());
		log.info("Status: {}", order.getStatus());
		log.info("Number of Guests: {}", order.getNumberOfGuests());
		log.info("Acquisition Time: {}", order.getAcquisitionTime());
		log.info("Total Amount: {}", totalAmount);

		ctx.close();
	}

	private double calculateTotalAmount(Order order) {
		double total = 0;
		for (Pizza item : order.getItems()) {
			total += item.getPrice();
		}
		total += order.getNumberOfGuests() * applicationProperties.getCoverCharge();
		return total;
	}
}