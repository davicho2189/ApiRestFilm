package com.spring.rest.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Embeddable
public class FilmActorKey  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	//@Column(insertable=false, updatable=false)
	 @Column(name = "actor_id")
	private long actor_id;	
	//@Column(insertable=false, updatable=false)
	@Column(name = "film_id")
	private long film_id;
	

	
}
