package com.spring.rest.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "film_actor")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FilmActor implements Serializable {
	
	private static final long serialVersionUID = 1L;
//	private long actor_id;	
//
//	private long film_id;
	
	@EmbeddedId
	private FilmActorId filmActorId;		
    		
	@Default
    private LocalDateTime last_update = LocalDateTime.now();
	
//	@ManyToOne
//    @JoinColumn(name = "actor_id", nullable = false, insertable = false, updatable = false)
//	private Actor actor;
//
//	
//	@ManyToOne
//	@JoinColumn(name = "film_id", nullable = false, insertable = false, updatable = false)
//	private Film film;
}
