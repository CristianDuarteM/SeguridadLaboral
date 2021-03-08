package com.cristianduarte.seguridadlaboral.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cristianduarte.seguridadlaboral.app.models.entity.Persona;

@Repository
public class PersonaImplement implements IPersonaDao{
	
	@PersistenceContext
	EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly=true)
	public List<Persona> findAll() {

		return em.createQuery("from Persona").getResultList();
	}

}
