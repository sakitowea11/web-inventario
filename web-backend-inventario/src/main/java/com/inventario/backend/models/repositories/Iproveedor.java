package com.inventario.backend.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.inventario.backend.models.entities.proveedor;

public interface Iproveedor extends CrudRepository<proveedor, Integer> {

}
