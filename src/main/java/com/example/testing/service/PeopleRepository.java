package com.example.testing.service;

import com.example.testing.People;
import org.springframework.data.repository.CrudRepository;

public interface PeopleRepository extends CrudRepository<People, Integer> {

}
