package com.jfb.movieflix.dto;

import java.io.Serializable;

import com.jfb.movieflix.entities.Movie;

public class MovieDTO implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long id;
  private String title;
  private String subtitle;
  private Integer year;
  private String imgUrl;
  private String synopsis;
  private Long genreId;

  public MovieDTO() {
  }

  public MovieDTO(Long id, String title, String subtitle, Integer year, 
    String imgUrl, String synopsis, Long genreId) {
    this.id = id;
    this.title = title;
    this.subtitle = subtitle;
    this.year = year;
    this.imgUrl = imgUrl;
    this.synopsis = synopsis;
    this.genreId = genreId;
  }

  public MovieDTO(Movie entity) {
    id = entity.getId();
    title = entity.getTitle();
    subtitle = entity.getSubtitle();
    year = entity.getYear();
    imgUrl = entity.getImgUrl();
    synopsis = entity.getSynopsis();
    genreId = entity.getGenre().getId();
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSubtitle() {
    return this.subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public Integer getYear() {
    return this.year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public String getImgUrl() {
    return this.imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public String getSynopsis() {
    return this.synopsis;
  }

  public void setSynopsis(String synopsis) {
    this.synopsis = synopsis;
  }

  public Long getGenreId() {
    return this.genreId;
  }

  public void setGenreId(Long genreId) {
    this.genreId = genreId;
  }


}
