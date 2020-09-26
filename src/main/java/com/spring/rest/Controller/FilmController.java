package com.spring.rest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.model.Film;
import com.spring.rest.service.FilmService;

@RestController
public class FilmController {

	@Autowired
	private FilmService _FilmService;
	
	
	  @GetMapping("allFilm")
	    public ResponseEntity<?> getAllFilm() {
	        try {
	            return ResponseEntity.status(HttpStatus.OK).body(_FilmService.findAll());
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde lista.\"}");
	        }
	    }
	  
	  @GetMapping("findByrentalDuration/{dias}")
	    public ResponseEntity<?> findByrentalDuration(@PathVariable int  dias) {
	        try {
	            return ResponseEntity.status(HttpStatus.OK).body(_FilmService.findByrentalDuration(dias));
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde lista.\"}");
	        }
	    }
	  @GetMapping("findByReleaseYear/{year}")
	    public ResponseEntity<?> findByReleaseYear(@PathVariable int year) {
	        try {
	            return ResponseEntity.status(HttpStatus.OK).body(_FilmService.findByReleaseYear(year));
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde lista.\"}");
	        }
	    }  
	  
	
	  
	  @PostMapping("addFilm")
	  @ResponseBody
	    public ResponseEntity<?> addFilm(@RequestBody Film film) {
	        try {
	            return ResponseEntity.status(HttpStatus.OK).body(_FilmService.save(film));
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. no se pudo insertar.\"}");
	        }
	    }
	  
	  	@PutMapping("updFilm/{id}")	
	    public ResponseEntity<?> updateFilm(@PathVariable long  id,@RequestBody Film film ) 
	  	{
	  		
	        try {
	        
	            return ResponseEntity.status(HttpStatus.OK).body(_FilmService.update(id, film));
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. no se pudo actualizar.\"}");
	        }
	    }
	  	
		@DeleteMapping("deleteFilm/{id}")	
	    public ResponseEntity<?> deleteFilm(@PathVariable long  id) 
	  	{
	  		
	        try {
	        
	            return ResponseEntity.status(HttpStatus.OK).body(_FilmService.delete(id));
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. no se pudo eliminar.\"}");
	        }
	    }
}
