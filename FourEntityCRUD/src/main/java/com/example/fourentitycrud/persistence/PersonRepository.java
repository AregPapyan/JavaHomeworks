package com.example.fourentitycrud.persistence;

import com.example.fourentitycrud.persistence.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
