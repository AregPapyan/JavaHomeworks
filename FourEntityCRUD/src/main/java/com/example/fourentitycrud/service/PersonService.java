package com.example.fourentitycrud.service;

import com.example.fourentitycrud.persistence.PersonRepository;
import com.example.fourentitycrud.persistence.model.Address;
import com.example.fourentitycrud.persistence.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private PersonRepository personRepository;

    //Constructor
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAll(){
        return personRepository.findAll();
    }
    public Person getById(Long id){
        return personRepository.getById(id);
    }
    public Person create(Person person){
        return personRepository.save(person);
    }
    public Person update(Long id, Person person){
        Person byId = personRepository.getById(id);

        Address byIdAddress = byId.getAddress();
        Address personAddress = person.getAddress();

        byIdAddress.setCountry(personAddress.getCountry());
        byIdAddress.setCity(personAddress.getCity());
        byIdAddress.setStreet(personAddress.getStreet());
        byIdAddress.setHouseNumber(personAddress.getHouseNumber());

        byId.setFirstName(person.getFirstName());
        byId.setLastName(person.getLastName());
        byId.setAge(person.getAge());
        byId.setUsername(person.getUsername());
        byId.setPassword(person.getPassword());

        return personRepository.save(byId);
    }
    public Person delete(Long id){
        Person byId = personRepository.getById(id);
        personRepository.deleteById(id);
        return byId;
    }
}
