package com.estoque.domain.repository;

import java.util.List;
import java.util.Optional;

import com.estoque.domain.entity.Produto;
import com.estoque.domain.entity.ProdutoId;

public interface ProdutoRepository {
	
	List<Produto> findAll();
	
	Optional<Produto> findById(ProdutoId id);
	
	Produto insert(Produto produto);
	
	Produto update(ProdutoId id , Produto obj);
	
	void remove(Long id);

}
