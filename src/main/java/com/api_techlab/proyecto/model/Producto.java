package com.api_techlab.proyecto.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idproducto;
	@Column(name = "nombre", nullable = false)
	String nombre;
	@Column(name ="precio")
	double precio;
	@Column(name="cantstock")
	int cantStock;
	
	public Producto() {};
		
public String toString() {
	return "Producto --" + "ID: "+ this.idproducto + " Nombre: "+ this.nombre + " Precio: " + this.precio + "  Cantidad en Stock: " +this.cantStock;
};
	public int getId() {
		return idproducto;
	}
	public void setId(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantStock() {
		return cantStock;
	}
	public void setCantStock(int cantStock) {
		this.cantStock = cantStock;
	}
	

}
