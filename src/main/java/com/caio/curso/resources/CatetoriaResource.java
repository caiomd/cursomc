package com.caio.curso.resources;

import java.util.ArrayList;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.caio.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CatetoriaResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
	
		Categoria cat1 = new Categoria();
		Categoria cat2 = new Categoria();
		
		cat1.setId(1);
		cat1.setNome("Mouse");
		
		cat2.setId(2);
		cat2.setNome("Teclado");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
	
		
		return lista;
		
		
	}
}
