package com.jfb.movieflix.dto;

import java.io.Serializable;

import com.jfb.movieflix.entities.Genre;

public class GenreDTO implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long id;
  private String name;

  public GenreDTO() {
  }

  public GenreDTO(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public GenreDTO(Genre entity) {
    id = entity.getId();
    name = entity.getName();
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
