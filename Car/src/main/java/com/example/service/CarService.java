package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.CarDao;
import com.example.entities.Car;

@Service
public class CarService {
	
	@Autowired
	CarDao dao;
	public void addCar(Car c)
	{
		dao.save(c);
	}

}
