package com.lambdaschool.javazoos.services;

import com.lambdaschool.javazoos.models.Animal;
import com.lambdaschool.javazoos.views.AnimalCount;

import java.util.List;

public interface AnimalService {


    List<AnimalCount> countAnimals();
}
