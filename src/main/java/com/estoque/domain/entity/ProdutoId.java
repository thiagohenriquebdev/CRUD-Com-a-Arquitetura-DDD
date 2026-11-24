package com.estoque.domain.entity;

import java.util.UUID;

public record ProdutoId (UUID id) {
	
	public ProdutoId () {
		this(UUID.randomUUID());
	}
	
}
