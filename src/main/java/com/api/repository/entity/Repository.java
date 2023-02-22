package com.api.repository;

import com.api.model.Movie;
import com.api.repository.entity.Categories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


//@Repository
public interface Repository
 extends JpaRepository<Categories, String> {

    Movie save(Movie obj);
    List<Categories> findAll();


    List<Categories> save();


}
