	package com.api_techlab.proyecto.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api_techlab.proyecto.model.Producto;
import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto , Integer> {
	
	 // Buscar artículos por nombre exacto
    List<Producto> findByNombre(String nombre);

    // Buscar artículos cuyo nombre contenga una palabra (LIKE '%texto%')
    List<Producto> findByNombreContaining(String texto);

    // Buscar artículos con precio mayor a un valor dado
    List<Producto> findByPrecioGreaterThan(Double precio);

    // Buscar artículos con precio entre dos valores
    List<Producto> findByPrecioBetween(Double min, Double max);

    // Buscar por nombre ignorando mayúsculas y minúsculas
    List<Producto> findByNombreIgnoreCase(String nombre);

    // Buscar artículos ordenados por precio ascendente
    List<Producto> findAllByOrderByPrecioAsc();

    // Buscar artículos por nombre y precio mayor a cierto valor
    List<Producto> findByNombreAndPrecioGreaterThan(String nombre, Double precio);

}
