package com.spring.rest.service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.model.Actor;
import com.spring.rest.repository.ActorRepository;


@Service
public class ActorService implements BaseService<Actor>{

	@Autowired
	private ActorRepository actorRepository ;
	
	
	@Transactional
	@Override
	public List<Actor> findAll() throws Exception {
		try{
            List<Actor> actores = actorRepository.findAll();
            return actores;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
	}

	@Override
	//@Transactional(readOnly = true)
	public Actor findById(Long id) throws Exception {
		Actor actor = actorRepository.findById(id).orElse(null);
		return actor;
	}

	@Transactional
	@Override
	public Actor save(Actor entity) throws Exception {
		return  actorRepository.save(entity);
	}

	@Transactional
	@Override
	public Actor update(Long id, Actor actor) throws Exception {
		try{
	
			Optional<Actor> entityOptional = actorRepository.findById(id);
			Actor _actor = entityOptional.get();
			_actor.setFirst_name(actor.getFirst_name());
			_actor.setLast_name(actor.getLast_name());		
			_actor.setLast_update(new Date(System.currentTimeMillis()));
			actorRepository.save(_actor);
			return _actor;
			  
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
	}

	@Override
	public boolean delete(Long id) throws Exception {
		try{
			
			Optional<Actor> entityOptional = actorRepository.findById(id);
			Actor _actor = entityOptional.get();			
			actorRepository.delete(_actor);
			return true;
			  
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
	}

}
