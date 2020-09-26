package com.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.model.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {

	
}