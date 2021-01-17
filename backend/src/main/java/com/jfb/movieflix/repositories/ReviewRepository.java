package com.jfb.movieflix.repositories;

import com.jfb.movieflix.entities.Review;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
