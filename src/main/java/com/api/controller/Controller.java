package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.api.model.Movie;
import com.api.produto.database.RepositoryCategories;

@RestController
public class Controller {

    @Autowired
    private RepositoryCategories filmes;

    @PostMapping("/api")
    public Movie cadastrar(@RequestBody Movie obj){
        return movie.save(obj);

    }
    @GetMapping
    public  List<filmes> selecionar(){
        return filme.findAll();

    }


    @GetMapping("")
    public String mensagem(){
        return "Hello world";

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
    public Movie movie(@RequestBody Movie movie){
        return movie;

    }
    
}
