package com.api_techlab.proyecto.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api_techlab.proyecto.model.Producto;
import com.api_techlab.proyecto.service.ProductoService;
import java.util.List;


@RestController 
@RequestMapping("/productos")
public class ProductoController {
	

	private final ProductoService prod;
	
	@Autowired
	public ProductoController(ProductoService prod) {
		this.prod=prod;
	}
		
	@GetMapping ("/lista")
	public List<Producto> listarProductos() { 
	return prod.listarTodos(); 
	}
	
	@GetMapping("/{id}") 
	public Producto obtenerPorId(@PathVariable("id") int idproducto) { 
	return prod.obtenerPorId(idproducto); 
	}
	
	@PostMapping("/crear")
	public Producto crearNuevoProd(@RequestBody Producto nuevoProducto) {
		System.out.println("testigo1");
		return prod.guardar(nuevoProducto);
	}
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") int idproducto){
		  prod.eliminarProducto(idproducto);
	        return ResponseEntity.noContent().build();
		
}
}
