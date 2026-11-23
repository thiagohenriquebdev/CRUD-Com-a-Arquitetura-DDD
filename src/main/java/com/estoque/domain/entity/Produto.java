package com.estoque.domain.entity;

import com.estoque.domain.exception.ProdutoException;

public class Produto {
	
	private ProdutoId id;
	
	private String nome;
	
	private double valor;
	
	private Categoria categoria;

	public Produto(ProdutoId id, String nome, double valor,Categoria categoria) {
		
		if (nome == null || nome.isBlank()) {
			throw new ProdutoException("Nome Nao Pode Ser Null");
		}
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.categoria=categoria;
	}

	public ProdutoId getId() {
		return id;
	}

	public void setId(ProdutoId id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
