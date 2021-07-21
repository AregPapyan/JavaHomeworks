package com.example.fourentitycrud.facade;

import com.example.fourentitycrud.controller.model.PersonRequestModel;
import com.example.fourentitycrud.controller.model.PersonResponseModel;
import com.example.fourentitycrud.converter.PersonConverter;
import com.example.fourentitycrud.persistence.model.Person;
import com.example.fourentitycrud.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonFacade {
    private PersonService personService;

    //Constructor
    public PersonFacade(PersonService personService) {
        this.personService = personService;
    }

    public List<PersonResponseModel> getAll(){
        List<Person> people = personService.getAll();
        return PersonConverter.personListIntoResponseModelList(people);
    }
    public PersonResponseModel getById(Long id){
        Person person = personService.getById(id);
        return PersonConverter.personIntoResponseModel(person);
    }
    public PersonResponseModel create(PersonRequestModel request){
        Person person = personService.create(PersonConverter.requestModelIntoPerson(request));
        return PersonConverter.personIntoResponseModel(person);
    }
    public PersonResponseModel update(Long id, PersonRequestModel request){
        Person person = personService.update(id, PersonConverter.requestModelIntoPerson(request));
        return PersonConverter.personIntoResponseModel(person);
    }
    public PersonResponseModel delete(Long id){
        return PersonConverter.personIntoResponseModel(personService.delete(id));
    }
}
