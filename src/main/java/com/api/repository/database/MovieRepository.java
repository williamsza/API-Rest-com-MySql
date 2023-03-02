package com.api.repository.database;
import com.api.model.MovieModel;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository
 extends JpaRepository<MovieModel, Long> {


   List<MovieModel>findAll();
   Optional<MovieModel> findById(Long id);

}
