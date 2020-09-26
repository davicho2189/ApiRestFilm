package com.spring.rest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "film")
@Entity
public class Film 
{
	
    @Id	
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
