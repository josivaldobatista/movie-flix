package com.jfb.movieflix.controllers;

import java.util.List;

import com.jfb.movieflix.dto.GenreDTO;
import com.jfb.movieflix.services.GenreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/genres")
public class GenreController {

  @Autowired
  private GenreService service;

  @GetMapping
  public ResponseEntity<List<GenreDTO>> findAll() {
    List<GenreDTO> list = service.findAll();
    return ResponseEntity.ok().body(list);
  }

}
