package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.api.model.MovieModel;
import com.api.repository.database.MovieRepository;


@RestController
@RequestMapping("api")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;
   
    @GetMapping("/movie")
    @ResponseStatus(HttpStatus.OK)
    public List<MovieModel> selecionarFilme(){
       return movieRepository.findAll();
    }

    @PostMapping("/movie")// "/id"
    @ResponseStatus(HttpStatus.CREATED)
    public MovieModel cadastrar(@RequestBody MovieModel filmes){
        return movieRepository.save(filmes);
    }

    @GetMapping("/movie/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MovieModel GetFilmeById(@PathVariable("id") Long id){
        return movieRepository.findById(id)
        .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Filme não existe"));
    }
    @PutMapping("/movie")
    public MovieModel editar(@RequestBody MovieModel filmes){
        movieRepository.findById(filmes).get();
        return movieRepository.save(filmes);

            
    }
    @DeleteMapping("/movie/{id}")
    public void remover(@PathVariable("id") Long id){
       // MovieModel filmes = GetFilmeById(id);
        movieRepository.deleteById(id);
    }

     }
     
  



