package com.spring.rest.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
//    @Temporal(TemporalType.TIMESTAMP)
    private Date last_update ;
    
    @JsonIgnore
  	@OneToMany(fetch = FetchType.EAGER,mappedBy="actor")
  	private List<FilmActor> filmActors; 	

  	
}
