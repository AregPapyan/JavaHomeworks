package com.company.package1;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=0)
            this.age = age;
        else
            System.out.println("Incorrect age!!");
    }
    public Person(String name, int age)
    {
        this.setName(name);
        this.setAge(age);
    }
    public String compareAge(Person person)
    {
        if(this.getAge() > person.getAge())
            return person.getName() + " is younger than me";
        else if(this.getAge() < person.getAge())
            return person.getName() + " is older than me";
        else
            return person.getName() + " is the same age as me";
    }
}
