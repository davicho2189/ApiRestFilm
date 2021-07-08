package com.spring.rest.Controller;
// test tag 2.00
import java.util.List;

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

import com.spring.rest.model.Actor;
import com.spring.rest.service.ActorService;
import com.spring.rest.service.FilmActorService;

@RestController
public class ActorController {
  
	@Autowired
	private ActorService ActorService;
	
	@Autowired
	private FilmActorService filmActorService;
	
	
	  @GetMapping("all")
	    public ResponseEntity<?> getAll() {
	        try {
	        	List<Actor> lista = ActorService.findAll();     
	            return ResponseEntity.status(HttpStatus.OK).body(lista);
	           
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde lista.\"}");
	        }
	    }
	  
	  @PostMapping("addActor")
	  @ResponseBody
	    public ResponseEntity<?> addActor(@RequestBody Actor actor) {
	        try {
	            return ResponseEntity.status(HttpStatus.OK).body(ActorService.save(actor));
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. no se pudo insertar.\"}");
	        }
	    }
	  
	  	@PutMapping("updActor/{id}")	
	    public ResponseEntity<?> addActor(@PathVariable long  id,@RequestBody Actor actor ) 
	  	{
	  		
	        try {
	        
	            return ResponseEntity.status(HttpStatus.OK).body(ActorService.update(id, actor));
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. no se pudo actualizar.\"}");
	        }
	    }
	  	
		@DeleteMapping("deleteActor/{id}")	
	    public ResponseEntity<?> addActor(@PathVariable long  id) 
	  	{
	  		
	        try {
	        
	            return ResponseEntity.status(HttpStatus.OK).body(ActorService.delete(id));
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. no se pudo eliminar.\"}");
	        }
	    }
	  	
		@GetMapping("FilmActor")	
	    public ResponseEntity<?> GetFilActor() 
	  	{
	  		
	        try {
	        
	            return ResponseEntity.status(HttpStatus.OK).body(filmActorService.findAll());
	            
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. no se pudo listar film actor.\"}");
	        }
	    }
	  	
	  
}
