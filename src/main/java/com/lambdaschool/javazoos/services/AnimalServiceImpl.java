package com.lambdaschool.javazoos.services;


import com.lambdaschool.javazoos.models.Animal;
import com.lambdaschool.javazoos.repositories.AnimalRepository;
import com.lambdaschool.javazoos.views.AnimalCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    AnimalRepository animalrepos;

    @Override
    public List<AnimalCount> countAnimals() {
        List<AnimalCount> animals = animalrepos.countAnimals();
        return animals;
    }


}
