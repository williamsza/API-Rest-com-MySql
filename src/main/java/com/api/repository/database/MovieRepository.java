package com.api.repository.database;

import com.api.model.MovieModel;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieRepository
 extends JpaRepository<MovieModel, String> {

   
    List<MovieModel> findAll();


    
    


}
