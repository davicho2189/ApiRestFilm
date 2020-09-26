package com.spring.rest.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "film_actor")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class FilmActor implements Serializable {

	private static final long serialVersionUID = 1L;
//	private long actor_id;	
//
//	private long film_id;

	@EmbeddedId
	private FilmActorKey filmActorKey;

	@Default
	private Date last_update = new Date(System.currentTimeMillis());

	@ManyToOne
	@JoinColumn(name = "actor_id", nullable = false, insertable = false, updatable = false)
	private Actor actor;

	@ManyToOne
	@JoinColumn(name = "film_id", nullable = false, insertable = false, updatable = false)
	private Film film;



}
