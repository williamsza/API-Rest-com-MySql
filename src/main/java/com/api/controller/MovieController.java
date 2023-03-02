package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.api.model.MovieModel;
import com.api.repository.database.MovieRepository;
import com.api.service.MovieService;

@RestController
@RequestMapping("api")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;
    private MovieService movieService;

    @PostMapping("/api")// "/id"
    @ResponseStatus(HttpStatus.CREATED)
    public MovieModel cadastrar(@RequestBody MovieModel filmes){
        return movieRepository.save(filmes);
      

    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<MovieModel> selecionarFilme(){
       return movieRepository.findAll();
       

    }

    @GetMapping("/api/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MovieModel buscarFilmePorId(@PathVariable("id") Long id){
        return movieRepository.findById(id)
        .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Filme não existe"));

    }
    @PutMapping("/api")
    public MovieModel editar(@RequestBody MovieModel filmes){
        return movieRepository.save(filmes);

    }
    @DeleteMapping("/api/{id}")
    public void remover(@PathVariable("id") Long id){
        MovieModel filmes = buscarFilmePorId(id);
        movieRepository.delete(filmes);


    }

     }
     
  



