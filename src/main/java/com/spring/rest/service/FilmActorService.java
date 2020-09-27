package com.spring.rest.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.model.FilmActor;
import com.spring.rest.repository.FilmActorRepository;


@Service
public class FilmActorService implements BaseService<FilmActor>{

	@Autowired
	private FilmActorRepository filmActorRepository ;
	
	
	@Transactional
	@Override
	public List<FilmActor> findAll() throws Exception {
		try{
            List<FilmActor> actores = filmActorRepository.findAll();
//            actores.forEach(System.out::println);
            return actores;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
	}

	@Override
	//@Transactional(readOnly = true)
	public FilmActor findById(Long id) throws Exception {
		FilmActor FilmActor = filmActorRepository.findById(id).orElse(null);
		return FilmActor;
	}

	@Transactional
	@Override
	public FilmActor save(FilmActor entity) throws Exception {
		return  filmActorRepository.save(entity);
	}

	@Transactional
	@Override
	public FilmActor update(Long id, FilmActor FilmActor) throws Exception {
		try{
	
//			Optional<FilmActor> entityOptional = filmActorRepository.findById(id);
//			FilmActor _actor = entityOptional.get();
//			_actor.setFirst_name(FilmActor.getFirst_name());
//			_actor.setLast_name(FilmActor.getLast_name());		
//			_actor.setLast_update(new Date(System.currentTimeMillis()));
//			filmActorRepository.save(_actor);
//			return _actor;
			return null;
			  
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
	}

	@Override
	public boolean delete(Long id) throws Exception {
		try{
			
			Optional<FilmActor> entityOptional = filmActorRepository.findById(id);
			FilmActor _actor = entityOptional.get();			
			filmActorRepository.delete(_actor);
			return true;
			  
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
	}

}
