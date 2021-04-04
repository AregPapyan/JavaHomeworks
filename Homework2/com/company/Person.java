package com.company;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String nationality;

    public Person(String name, int age, String nationality) {
        this.setName(name);
        this.setAge(age);
        this.setNationality(nationality);
    }
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


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
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if(this.getAge()>o.getAge())
            return 1;
        else if(this.getAge()<o.getAge())
            return -1;
        return 0;
    }
}
