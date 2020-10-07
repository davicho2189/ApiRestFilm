package com.spring.rest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Table(name = "film")
public class Film 
{
	
    @Id	
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long film_id;
    
	private String title;

	private String description;
	
	private int languageId;
	
   @Temporal(TemporalType.TIMESTAMP)
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

}
