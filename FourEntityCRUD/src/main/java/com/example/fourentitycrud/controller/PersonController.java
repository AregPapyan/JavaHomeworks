package com.example.fourentitycrud.controller;

import com.example.fourentitycrud.controller.model.PersonRequestModel;
import com.example.fourentitycrud.controller.model.PersonResponseModel;
import com.example.fourentitycrud.facade.PersonFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    private PersonFacade facade;

    //Constructor
    public PersonController(PersonFacade facade) {
        this.facade = facade;
    }

    @GetMapping(value = "/person")
    public ResponseEntity<List<PersonResponseModel>> getAll(){
        return ResponseEntity.ok(facade.getAll());
    }

    @GetMapping(value = "/person/{id}")
    public ResponseEntity<PersonResponseModel> getById(@PathVariable Long id){
        return ResponseEntity.ok(facade.getById(id));
    }

    @PostMapping(value = "/person")
    public ResponseEntity<PersonResponseModel> create(@RequestBody PersonRequestModel request){
        return ResponseEntity.ok(facade.create(request));
    }
    @PutMapping(value = "/person/{id}")
    public ResponseEntity<PersonResponseModel> update(@PathVariable Long id, @RequestBody PersonRequestModel request){
        return ResponseEntity.ok(facade.update(id, request));
    }
    @DeleteMapping(value = "/person/{id}")
    public ResponseEntity<PersonResponseModel> delete(@PathVariable Long id){
        return ResponseEntity.ok(facade.delete(id));
    }
}
