package com.estoque.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.estoque.domain.entity.Categoria;
import com.estoque.domain.entity.CategoriaId;
import com.estoque.domain.exception.CategoriaException;
import com.estoque.domain.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	private final CategoriaRepository repository;

	public CategoriaService(CategoriaRepository repository) {
		this.repository = repository;
	}
	
	public List<Categoria> buscarTodasCategorias() {
		return repository.findAll();
	}
	
	public Categoria buscarPorId(CategoriaId id) {
		return repository.findById(id).orElseThrow(()-> new CategoriaException("ID Null"));
	}
	
	public Categoria salvar(Categoria categoria) {
		return repository.insert(categoria);
	}
	
	public Categoria update (CategoriaId id , Categoria categoria) {
		Categoria obj = repository.findById(id).orElseThrow(() -> new CategoriaException("ID Null"));
		
		obj.setNome(categoria.getNome());
		
		return repository.insert(obj);
		
	}
	
	public void  remover(CategoriaId id) {
		repository.remove(id);
	}

}
