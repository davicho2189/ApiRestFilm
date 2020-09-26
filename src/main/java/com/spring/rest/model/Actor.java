package com.spring.rest.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "actor")
public class Actor implements Serializable
{ 
	
	private static final long serialVersionUID = 1L;
	
	 
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long actor_id;
    private String first_name;
    private String last_name;    
    @Default
    private Date last_update = new Date(System.currentTimeMillis());
    
  
//  	@OneToMany(fetch = FetchType.EAGER,mappedBy="actor")
//  	private List<FilmActor> filmActors; 	

  	
}
