package com.spring.rest.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@IdClass(FilmActorKey.class)
@Entity
@Table(name = "film_actor")
public class FilmActor implements Serializable {

	private static final long serialVersionUID = 1L;	
	
	@Id
    private Actor actor;
	@Id
    private Film film;
	
    @Temporal(TemporalType.TIMESTAMP)
	private Date last_update ;
    
  
    
   
  
}
