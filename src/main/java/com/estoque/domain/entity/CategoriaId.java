package com.estoque.domain.entity;

import java.util.UUID;

public record CategoriaId(UUID id) {
	
	public CategoriaId () {
		this(UUID.randomUUID());
	}
}
