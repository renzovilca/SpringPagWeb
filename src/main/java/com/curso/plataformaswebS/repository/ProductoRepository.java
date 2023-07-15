package com.curso.plataformaswebS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.plataformaswebS.model.Producto;

public class ProductoRepository {
	
	@Repository
	public interface IProductoRepository extends JpaRepository<Producto, Integer> {

	}


}

