package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.controller.controller;
import com.example.entities.Car;

@SpringBootApplication
public class CarApplication implements CommandLineRunner{

	@Autowired
	controller con;
	
	public static void main(String[] args) {
		SpringApplication.run(CarApplication.class, args);
	}

	public void run(String...args) throws Exception{
		Car c=getCar();
		con.addCar(c);
	}
	
	private Car getCar() {
		
		Car c=new Car();
		c.setCompany("Mercedes-Benz");
		c.setModel("EQS");
		c.setColor("Black");
		return c;
	}
}
