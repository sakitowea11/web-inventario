package com.inventario.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.inventario.backend.models.entities.categoria;

public interface Icategoria extends CrudRepository<categoria, Integer> {

}
