package br.alura.com.livraria.controller;


import java.util.List;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.alura.com.livraria.dto.AutorDto;
import br.alura.com.livraria.dto.AutorFormDto;

import br.alura.com.livraria.service.AutorService;


@RestController
@RequestMapping("/autores")
public class AutorController {

	@Autowired
	private AutorService service;	
	
	
	@GetMapping
	public List<AutorDto> listar() {

		return service.listar();

	}

	@PostMapping
	public void cadastrar(@RequestBody @Valid AutorFormDto dto) {

		service.cadastrar(dto);

	}
}
