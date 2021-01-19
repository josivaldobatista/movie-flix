package com.jfb.movieflix.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @OneToMany(mappedBy = "genre")
  private List<Movie> movies = new ArrayList<>();

  public Genre() {
  }

  public Genre(Long id, String name) {
    this.id = id;
    this.name = name;
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

  public List<Movie> getMovies() {
    return this.movies;
  }

  public void setMovies(List<Movie> movies) {
    this.movies = movies;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Genre)) {
      return false;
    }
    Genre genre = (Genre) o;
    return Objects.equals(id, genre.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }

}
