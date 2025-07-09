package com.api_techlab.proyecto.service;

import java.util.List;

import com.api_techlab.proyecto.model.Producto;

public interface ProductoServiceInterf {

	List<Producto> listarTodos();
	Producto guardar(Producto p);
	
}
