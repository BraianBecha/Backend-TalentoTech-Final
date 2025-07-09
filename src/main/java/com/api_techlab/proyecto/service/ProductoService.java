package com.api_techlab.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api_techlab.proyecto.model.Producto;
import com.api_techlab.proyecto.repository.ProductoRepository;

//import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService implements ProductoServiceInterf {
	private final ProductoRepository repo; 
	//private List<producto> productosLista = new ArrayList<>();
	
	@Autowired 
	public ProductoService(ProductoRepository repo) { 
		this.repo = repo; 	}
	
	public List<Producto> listarTodos() { 
		System.out.println("llamada a listarTodos()");
		System.out.println(repo.findAll());
		return repo.findAll(); 		
		} 
	
	public Producto obtenerPorId(int idproducto) { 
		return repo.findById(idproducto).orElse(null); 
		} 
	public Producto guardar(Producto p) { 
		
		return repo.save(p); 
		}
	}
