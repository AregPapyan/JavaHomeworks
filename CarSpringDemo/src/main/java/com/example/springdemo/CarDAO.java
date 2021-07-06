package com.example.springdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarDAO {
    private static final String URL = "jdbc:mariadb://localhost:3306/vehicle";
    private static final String USER = "root";
    private static final String PASS = "bestmariadb112";
    public List<Car> getCars(){
        List<Car> cars = new ArrayList<>();
        try(Connection connection = DriverManager.getConnection(URL,USER,PASS)){
            String sql = "SELECT * FROM car";
            try(Statement statement = connection.createStatement()){
                ResultSet resultSet = statement.executeQuery(sql);
                while (resultSet.next()){
                    Car car = Converter.recordToCar(resultSet);
                    cars.add(car);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return cars;
    }
    public Car getCarById(int id){
        Car car=null;
        try(Connection connection = DriverManager.getConnection(URL,USER,PASS)){
            String sql = "SELECT * FROM car WHERE id=?";
            try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                preparedStatement.setInt(1,id);
                ResultSet resultSet = preparedStatement.executeQuery();
                if(resultSet.next()){
                    car=Converter.recordToCar(resultSet);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return car;
    }
    public void deleteCar(int id){
        try(Connection connection = DriverManager.getConnection(URL,USER,PASS)){
            String sql = "DELETE FROM car WHERE id=?";
            try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                preparedStatement.setInt(1,id);
                preparedStatement.execute();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void addCar(Car car){
        try(Connection connection = DriverManager.getConnection(URL,USER,PASS)){
            String sql = "INSERT INTO car (brand,model,year_of_issue,mileage_in_km,body_type,colour)" +
                    "VALUES(?,?,?,?,?,?)";
            try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                preparedStatement.setString(1,car.getBrand());
                preparedStatement.setString(2,car.getModel());
                preparedStatement.setInt(3,car.getYear_of_issue());
                preparedStatement.setInt(4,car.getMileage_in_km());
                preparedStatement.setString(5,car.getBody_type().toString());
                preparedStatement.setString(6,car.getColour());
                preparedStatement.execute();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void updateCar(int id, Car car){
        try(Connection connection = DriverManager.getConnection(URL,USER,PASS)){
            String sql = "UPDATE car " +
                    "SET brand = ?, model = ?, year_of_issue = ?, mileage_in_km = ?, body_type = ?, colour = ?" +
                    "WHERE id = ?";
            try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                preparedStatement.setString(1,car.getBrand());
                preparedStatement.setString(2,car.getModel());
                preparedStatement.setInt(3,car.getYear_of_issue());
                preparedStatement.setInt(4,car.getMileage_in_km());
                preparedStatement.setString(5,car.getBody_type().toString());
                preparedStatement.setString(6,car.getColour());
                preparedStatement.setInt(7,id);
                preparedStatement.execute();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
