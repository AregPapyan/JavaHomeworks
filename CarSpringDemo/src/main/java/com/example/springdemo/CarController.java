package com.example.springdemo;

import org.mariadb.jdbc.Driver;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CarController {

    private CarDAO carDAO = new CarDAO();
    @GetMapping(value = "/car")
    public ResponseEntity<List<Car>> getCars(){
        return ResponseEntity.ok(carDAO.getCars());
    }
    @GetMapping(value = "/car/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable int id){
        return ResponseEntity.ok(carDAO.getCarById(id));
    }
    @DeleteMapping(value = "/car/{id}")
    public void deleteCar(@PathVariable int id){
        carDAO.deleteCar(id);
    }
    @PostMapping(value="/car")
    public void addCar(@RequestBody Car car){
        carDAO.addCar(car);
    }
    @PutMapping(value = "/car/{id}")
    public void updateCar(@PathVariable int id, @RequestBody Car car){
        carDAO.updateCar(id,car);
    }
}
