package com.spring.rest.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class FilmActorKey implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "actor_id", nullable = false)
	private Actor actor;

	@ManyToOne
	@JoinColumn(name = "film_id", nullable = false)
	private Film film;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FilmActorKey that = (FilmActorKey) o;
		return Objects.equals(actor, that.actor) && Objects.equals(film, that.film);
	}

	@Override
	public int hashCode() {
		return Objects.hash(actor, film);
	}

}
