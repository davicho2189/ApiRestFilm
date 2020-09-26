package com.spring.rest.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.spring.rest.model.Film;
import com.spring.rest.repository.FilmRepository;


@Service
public class FilmService implements BaseService<Film>{

	@Autowired
	private FilmRepository filmRepository ;
	
	
	@Transactional
	@Override
	public List<Film> findAll() throws Exception {
		
		try{
			
            List<Film> films = filmRepository.findAll();
            return films;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
	}

	@Override
	//@Transactional(readOnly = true)
	public Film findById(Long id) throws Exception {
		Film film = filmRepository.findById(id).orElse(null);
		return film;
	}
		
	
	public List<Film> findByrentalDuration(int id) throws Exception {
		List<Film> films = filmRepository.findAll();
		return films.stream().filter(e->e.getRentalDuration()==id).collect(Collectors.toList());
//		.stream()
//        .filter(e -> unavailableItems.contains(e))
//        .collect(Collectors.toList());
	}
	
	public List<Film> findByReleaseYear(int year) throws Exception {
		List<Film> films = filmRepository.findAll();
		return films.stream().filter(e->e.getReleaseYear()==year).collect(Collectors.toList());
//		.stream()
//        .filter(e -> unavailableItems.contains(e))
//        .collect(Collectors.toList());
	}
	
	@Transactional
	@Override
	public Film save(Film entity) throws Exception {
		return  filmRepository.save(entity);
	}

	@Transactional
	@Override
	public Film update(Long id, Film oldfilm) throws Exception {
		try{
	
			Optional<Film> entityOptional = filmRepository.findById(id);
			Film _film = entityOptional.get();
			_film.setTitle(oldfilm.getTitle());
			_film.setDescription(oldfilm.getDescription());
			_film.setLastUpdate(new Date(System.currentTimeMillis()));
			filmRepository.save(_film);
			return _film;
			  
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
	}

	@Override
	public boolean delete(Long id) throws Exception {
		try{
			
			Optional<Film> entityOptional = filmRepository.findById(id);
			Film _film = entityOptional.get();			
			filmRepository.delete(_film);
			return true;
			  
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
	}

}
