package com.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.model.FilmActor;

@Repository
public interface FilmActorRepository extends JpaRepository<FilmActor, Long> {

	
}