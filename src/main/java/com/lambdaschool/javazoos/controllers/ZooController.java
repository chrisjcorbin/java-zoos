package com.lambdaschool.javazoos.controllers;


import com.lambdaschool.javazoos.models.Zoo;
import com.lambdaschool.javazoos.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/zoos")
public class ZooController {

    @Autowired
    ZooService zooService;

    // GET /zoos/zoos - returns all zoos with their phone numbers and animals
    // http://localhost:2019/zoos/zoos
    @GetMapping(value = "/zoos", produces = "application/json")
    public ResponseEntity<?> getAllZoos()
    {
        List<Zoo> zoos = zooService.findAllZoos();
        return new ResponseEntity<>(zoos, HttpStatus.OK);
    }


    // GET /zoos/zoo/{id} - returns all information related to a zoo based on its id
    // http://localhost:2019/zoos/zoo/5
    @GetMapping(value = "/zoo/{id}", produces = "application/json")
    public ResponseEntity<?> getZooById(@PathVariable long id)
    {
        Zoo zoo = zooService.findById(id);
        return new ResponseEntity<>(zoo, HttpStatus.OK);
    }
}
