package com.spring.rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.model.FilmActor;
import com.spring.rest.service.FilmActorService;

@RestController
public class FilmActorController {
	
	
	@Autowired
	private FilmActorService filmActorService;
	
	
	  @GetMapping("allFilmActor")
	    public ResponseEntity<?> getAll() {
	        try {
	        	List<FilmActor> lista = filmActorService.findAll();     
	            return ResponseEntity.status(HttpStatus.OK).body(lista);
	           
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde lista.\"}");
	        }
	    }
	  
	  
}
