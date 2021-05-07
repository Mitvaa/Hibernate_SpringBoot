package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Car;
import com.example.service.CarService;

@RestController
public class controller {

	@Autowired
	CarService service;
	@RequestMapping(method =RequestMethod.POST,value = "/addCar")
	public void addCar(@RequestBody Car c) {
	
		service.addCar(c);
	}
}
