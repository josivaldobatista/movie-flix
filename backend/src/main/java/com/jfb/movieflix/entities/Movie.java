package com.jfb.movieflix.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private String title;
  private String subTitle;
  private Integer year;
  private String imgUrl;
  private String synopsis;

  public Movie() {
  }

  public Movie(Long id, String title, String subTitle, Integer year, String imgUrl, String synopsis) {
    this.id = id;
    this.title = title;
    this.subTitle = subTitle;
    this.year = year;
    this.imgUrl = imgUrl;
    this.synopsis = synopsis;
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

  public String getSubTitle() {
    return this.subTitle;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
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

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Movie)) {
      return false;
    }
    Movie movie = (Movie) o;
    return Objects.equals(id, movie.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }

}
