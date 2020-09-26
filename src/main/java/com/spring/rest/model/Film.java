package com.spring.rest.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "film")
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {
	
    @Id	
	private long filmId;
    
	private String title;

	private String description;
	
	private byte languageId;
	
	private Date  lastUpdate;

	private int length;
	
	@Column(nullable = true)	
	private int originalLanguageId;

	private String rating;

	private int releaseYear;

	
	private int rentalDuration;

	
	private double rentalRate;

	
	private double replacementCost;

	
	private String specialFeatures;
	
//	@OneToMany(mappedBy="film")
//	private List<FilmActor> filmActors;
	

}
