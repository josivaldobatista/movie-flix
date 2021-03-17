package com.jfb.movieflix.services;

import java.util.List;
import java.util.stream.Collectors;

import com.jfb.movieflix.dto.GenreDTO;
import com.jfb.movieflix.entities.Genre;
import com.jfb.movieflix.repositories.GenreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreService {

  @Autowired
  private GenreRepository repository;

  public List<GenreDTO> findAll() {
    List<Genre> list = repository.findAll();
    return list.stream().map(x -> new GenreDTO(x)).collect(Collectors.toList());
  }

}
