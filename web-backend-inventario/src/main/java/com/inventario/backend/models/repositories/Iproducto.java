package com.inventario.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.inventario.backend.models.entities.producto;

public interface Iproducto extends CrudRepository<producto, Integer> {

}
