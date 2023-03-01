package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.api.model.MovieModel;
import com.api.repository.database.MovieRepository;



@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @PostMapping("/cadastrar")
    @ResponseStatus(HttpStatus.CREATED)
    public MovieModel cadastrar(@RequestBody MovieModel filmes){
        return movieRepository.save(filmes);

    }
    @GetMapping
    public List<MovieModel> Listar(){
        return movieRepository.findAll();

    }
    
    @DeleteMapping
    public void deleteById(@PathVariable("id")String id){
        
    }

}

