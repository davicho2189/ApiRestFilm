package com.spring.rest.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "film")
public class Film 
{
	
    @Id	
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long filmId;
    
	private String title;

	private String description;
	
	private int languageId;
	
//  @Temporal(TemporalType.TIMESTAMP)
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
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER,mappedBy="film")
	private List<FilmActor> filmActors;
	

}
