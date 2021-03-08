package com.cristianduarte.seguridadlaboral.app.dao;

import java.util.List;

import com.cristianduarte.seguridadlaboral.app.models.entity.Persona;

public interface IPersonaDao {

	public List<Persona> findAll();
}
