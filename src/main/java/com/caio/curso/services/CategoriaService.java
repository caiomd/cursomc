package com.caio.curso.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caio.curso.repositories.CategoriaRepository;
import com.caio.curso.services.exception.ObjectNotFoundException;
import com.caio.domain.Categoria;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	//Busca uma categoria no banco de dados por id
	public Categoria buscar(Integer id) {
		
		Categoria obj = repo.findOne(id);
		
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! ID = " + id + ", Tipo " + Categoria.class.getName());
		}
		
		return obj;
		
	}
}
