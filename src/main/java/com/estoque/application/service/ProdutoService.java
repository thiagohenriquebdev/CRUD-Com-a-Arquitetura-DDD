package com.estoque.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.estoque.domain.entity.Produto;
import com.estoque.domain.entity.ProdutoId;
import com.estoque.domain.exception.ProdutoException;
import com.estoque.domain.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	private final ProdutoRepository repository;

	public ProdutoService(ProdutoRepository repository) {
		this.repository = repository;
	}
	
	public List<Produto> buscarTodos() {
		return repository.findAll();
	}
	
	public Produto buscarPorId(ProdutoId id) {
		return repository.findById(id).orElseThrow(() -> new ProdutoException("ID Null"));
	}
	
	public Produto salvar(Produto produto) {
		return repository.insert(produto);
	}
	
	public Produto update(ProdutoId id,Produto produto) {
		Produto obj=repository.findById(id)
				.orElseThrow(() -> new ProdutoException("ID Null"));
		
		produto.setNome(obj.getNome());
		produto.setValor(obj.getValor());
		
		
		return repository.insert(produto);	
	}
	
	public void remove (Long id) {
		repository.remove(id);
	}
}
