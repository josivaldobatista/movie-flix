package com.jfb.movieflix.dto;

import com.jfb.movieflix.entities.Review;

public class ReviewDTO {

  private Long id;
  private String text;
  private Long movieId;

  public ReviewDTO() {
  }

  public ReviewDTO(Long id, String text, Long movieId) {
    this.id = id;
    this.text = text;
    this.movieId = movieId;
  }

  public ReviewDTO(Review entity) {
    id = entity.getId();
    text = entity.getText();
    movieId = entity.getMovie().getId();
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getText() {
    return this.text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Long getMovieId() {
    return this.movieId;
  }

  public void setMovieId(Long movieId) {
    this.movieId = movieId;
  }

}
