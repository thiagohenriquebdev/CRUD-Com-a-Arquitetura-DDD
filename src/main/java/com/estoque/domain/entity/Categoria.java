package com.estoque.domain.entity;

import com.estoque.domain.exception.CategoriaException;

public class Categoria {

	private CategoriaId id;
	
	private String nome;

	public Categoria(String nome) {
		if (nome == null || nome.isBlank()) {
			throw new CategoriaException("Categoria Nao Pode Ser Null");
		}
		this.id = new CategoriaId();
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
