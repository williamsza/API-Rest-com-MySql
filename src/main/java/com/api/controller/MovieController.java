package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.api.model.MovieModel;
import com.api.repository.database.MovieRepository;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @PostMapping("/api")
    public MovieModel cadastrar(@RequestBody MovieModel filmes){
        return movieRepository.save(filmes);

    }

    @GetMapping
    public  List<MovieModel> selecionar(){
        return movieRepository.findAll();

    }


    
    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String name){
        return "Seja bem vindo(a)! "+name;
    }
    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Seja bem vindo(a)! ";
    }
    
    @PostMapping("/movie")
    public MovieModel movie(@RequestBody MovieModel movie){
        return movie;
        
    }
    @GetMapping("")
    public String mensagem(){
        return "Hello world";

    }
    
}
