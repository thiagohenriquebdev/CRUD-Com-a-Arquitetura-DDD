package com.estoque.domain.entity;

public record CategoriaId(Long id) {
	
	 public CategoriaId {
		if (id == null || id <= 0) {
			throw new IllegalArgumentException("ID null");
		}
	}
}
