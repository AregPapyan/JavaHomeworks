package com.company.package2;

public class CurrencyConverter {
    public double convert(Dram from, Ruble to){
        return from.getValue()*0.15;
    }
    public double convert(Dram from, Dollar to){
        return from.getValue()*0.0021;
    }
    public double convert(Dollar from, Ruble to){
        return from.getValue()*73.26;
    }
    public double convert(Dollar from, Dram to){
        return from.getValue()*526.63;
    }
    public double convert(Ruble from, Dram to){
        return from.getValue()*7.19;
    }
    public double convert(Ruble from, Dollar to){
        return from.getValue()*0.014;
    }
}
