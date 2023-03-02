package com.api.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.api.model.MovieModel;
import com.api.repository.database.MovieRepository;

@Service
public class MovieService {

    private MovieRepository repository;
    public List<MovieModel> findAll;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public MovieModel save(MovieModel movie) {
        return repository.save(movie);

    }

    public List<MovieModel> ListaFilme() {
        return repository.findAll();

    }

    public Optional<MovieModel> buscarPorId(Long id) {
        return repository.findById(id);

    }

    public void removerPorId(Long id) {
        repository.deleteById(id);
    }
}
