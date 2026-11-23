package com.estoque.domain.entity;

public record ProdutoId (Long id) {

	public ProdutoId {
		if(id == null || id <= 0) {
			throw new IllegalArgumentException("ID null");
		}
	}
	
}
