package com.spring.rest.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "film_actor")
public class FilmActor implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FilmActorKey filmActorKey;

//    @Temporal(TemporalType.TIMESTAMP)
	private Date last_update ;

	@ManyToOne
	@MapsId("actor_id")
	@JoinColumn(name = "actor_id")
	private Actor actor;

	@ManyToOne
	@MapsId("film_id")
    @JoinColumn(name = "film_id")
	private Film film;



}
