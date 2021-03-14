package com.company.package2;

public class TemperatureConverter {
    public double convertFahrenheitToCelsius(double fahrenheit)
    {
        return (fahrenheit-32)*5/9;
    }
    public double convertFahrenheitToKelvin(double fahrenheit)
    {
        return convertFahrenheitToCelsius(fahrenheit) + 273.15;
    }
    public double convertCelsiusToFahrenheit(double celsius)
    {
        return celsius*9/5 + 32;
    }
    public double convertCelsiusToKelvin(double celsius)
    {
        return celsius+273.15;
    }
    public double convertKelvinToFahrenheit(double kelvin)
    {
        return convertCelsiusToFahrenheit(kelvin-273.15);
    }
    public double convertKelvinToCelsius(double kelvin)
    {
        return kelvin-273.15;
    }
}
