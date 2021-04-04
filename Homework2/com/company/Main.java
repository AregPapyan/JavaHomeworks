package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    //#1
    public static List<String> convertToUpperCase(List<String> list)
    {
        return  list.stream().map(each->each.toUpperCase()).collect(Collectors.toList());
    }
    //#2
    public static List<String> getLessThanFourCharacterOnes(List<String> list)
    {
        return list.stream().filter(each->each.length()<4).collect(Collectors.toList());
    }
    //#3
    public static List<String> flattenCollection(List<List<String>> multiList)
    {
        return multiList.stream().flatMap(each -> each.stream()).collect(Collectors.toList());
    }
    //#4
    public static Person getOldestPerson(List<Person> people)
    {
        List<Person> sortedPeople = people.stream().sorted().collect(Collectors.toList());
        return sortedPeople.get(sortedPeople.size()-1);
    }
    //#5
    public static Double getSum(List<Double> numbers)
    {
        return numbers.stream().mapToDouble(each->each).sum();
    }
    //#6
    public static List<Person> getAllKids(List<Person> people)
    {
        return people.stream().filter(each -> each.getAge() < 18).collect(Collectors.toList());
    }
    //#7
    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people)
    {
        return people.stream().collect(Collectors.partitioningBy(each -> each.getAge() > 18));
    }
    //#8
    public static Map<String,List<Person>> groupingByNationality(List<Person> people)
    {
        return people.stream().collect(Collectors.groupingBy(each -> each.getNationality()));
    }
    //#9
    public static String peopleToString(List<Person> people)
    {
        return people.stream().map(each -> each.getName()).collect(Collectors.joining(","));
    }
}
