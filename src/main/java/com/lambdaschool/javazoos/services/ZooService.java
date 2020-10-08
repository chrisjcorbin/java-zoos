package com.lambdaschool.javazoos.services;

import com.lambdaschool.javazoos.models.Zoo;

import java.util.List;

public interface ZooService {
    Zoo findById(long id);

    List<Zoo> findAllZoos();
}
