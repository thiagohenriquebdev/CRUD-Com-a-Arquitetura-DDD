package com.estoque.domain.entity;

import com.estoque.domain.exception.CategoriaException;

public class Categoria {

	private CategoriaId id;
	
	private String nome;

	public Categoria(CategoriaId id, String nome) {
		if (nome == null || nome.isBlank()) {
			throw new CategoriaException("Categoria Null");
		}
		this.id = id;
		this.nome = nome;
	}

	public CategoriaId getId() {
		return id;
	}

	public void setId(CategoriaId id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
