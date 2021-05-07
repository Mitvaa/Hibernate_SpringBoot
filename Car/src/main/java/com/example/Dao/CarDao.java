package com.example.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Car;

@Repository
public interface CarDao extends CrudRepository<Car, Integer>{

}
