package com.api.repository.entity;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.api.model.MovieModel;
import com.api.repository.database.MovieRepository;


public class CategoriesRest {

   @Autowired
    private MovieRepository repository;


     public List<MovieModel> listar() {
      return  repository.findAll();

    }

}