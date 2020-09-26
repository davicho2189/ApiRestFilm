package com.spring.rest.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Embeddable
@Data
public class FilmActorId  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Column(insertable=false, updatable=false)
	private long actor_id;	
	@Column(insertable=false, updatable=false)
	private long film_id;
	
	
	
}
