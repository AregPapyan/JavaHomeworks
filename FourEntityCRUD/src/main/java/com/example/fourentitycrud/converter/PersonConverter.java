package com.example.fourentitycrud.converter;

import com.example.fourentitycrud.controller.model.PersonOrderRequestModel;
import com.example.fourentitycrud.controller.model.PersonRequestModel;
import com.example.fourentitycrud.controller.model.PersonResponseModel;
import com.example.fourentitycrud.persistence.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonConverter {
    public static Person requestModelIntoPerson(PersonRequestModel request){
        Person person = new Person();
        person.setFirstName(request.getFirstName());
        person.setLastName(request.getLastName());
        person.setAge(request.getAge());
        person.setUsername(request.getUsername());
        person.setPassword(request.getPassword());
        person.setAddress(AddressConverter.addressModelIntoAddress(request.getAddressModel()));
        return person;
    }
    public static Person orderRequestModelIntoPerson(PersonOrderRequestModel request){
        Person person = new Person();
        person.setId(request.getId());
        person.setFirstName(request.getFirstName());
        person.setLastName(request.getLastName());
        person.setAge(request.getAge());
        person.setUsername(request.getUsername());
        person.setPassword(request.getPassword());
        person.setAddress(AddressConverter.addressModelIntoAddress(request.getAddressModel()));
        return person;
    }
    public static PersonResponseModel personIntoResponseModel(Person person) {
        PersonResponseModel response = new PersonResponseModel();
        response.setId(person.getId());
        response.setFirstName(person.getFirstName());
        response.setLastName(person.getLastName());
        response.setAge(person.getAge());
        response.setUsername(person.getUsername());
        response.setAddressModel(AddressConverter.addressIntoAddressModel(person.getAddress()));
        return response;
    }
    public static List<PersonResponseModel> personListIntoResponseModelList(List<Person> people){
        List<PersonResponseModel> responses = new ArrayList<>();
        for(Person person:people){
            PersonResponseModel response = new PersonResponseModel();
            response.setId(person.getId());
            response.setFirstName(person.getFirstName());
            response.setLastName(person.getLastName());
            response.setAge(person.getAge());
            response.setUsername(person.getUsername());
            response.setAddressModel(AddressConverter.addressIntoAddressModel(person.getAddress()));
            responses.add(response);
        }
        return responses;
    }
}
