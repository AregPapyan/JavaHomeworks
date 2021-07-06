package com.example.springdemo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;

public class Converter {
    public static Car recordToCar(ResultSet resultSet) throws SQLException {
        String brand = resultSet.getString("brand");
        String model = resultSet.getString("model");
        int year_of_issue = resultSet.getInt("year_of_issue");
        int mileage_in_km = resultSet.getInt("mileage_in_km");
        BodyType body_type = BodyType.valueOf(resultSet.getString("body_type").toUpperCase());
        String colour = resultSet.getString("colour");
        return new Car(brand,model,year_of_issue,mileage_in_km,body_type,colour);
    }
}
