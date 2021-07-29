package com.inventario.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.inventario.backend.models.entities.administrador; //modelo entidad al que se quiere vincular la gestion

public interface Iadministrador extends CrudRepository<administrador, Integer> {

	//Tambien es conocido como el Data Access Object - DAO
	
}
