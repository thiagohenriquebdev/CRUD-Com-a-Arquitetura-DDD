package com.estoque.domain.repository;

import java.util.List;
import java.util.Optional;

import com.estoque.domain.entity.Categoria;
import com.estoque.domain.entity.CategoriaId;

public interface CategoriaRepository {
	
	List<Categoria> findAll();
	
	Optional<Categoria> findById(CategoriaId id);
	
	Categoria insert(Categoria categoria);
	
	Categoria update(Categoria categoria);

	void remove(CategoriaId id);
	

}
