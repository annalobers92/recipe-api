package com.example.testing.rest;

import com.example.testing.People;
import com.example.testing.service.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/people")
public class PeopleEndpoint {

    @Autowired
    private PeopleRepository peopleRepository;

    //    @RequestMapping(value ="/save", method=RequestMethod.GET)
//    @PostMapping(path="/save")
    @PutMapping(path="/save")
    public void addPeople(@RequestBody String name){
        People people = new People();
        people.setName(name);
        peopleRepository.save(people);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<People> getAllUsers(){
        return peopleRepository.findAll();
    }
}
