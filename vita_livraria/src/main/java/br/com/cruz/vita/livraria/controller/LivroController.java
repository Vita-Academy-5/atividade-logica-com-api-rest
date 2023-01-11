package br.com.cruz.vita.livraria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cruz.vita.livraria.repository.LivroRepository;
import br.com.cruz.vita.livraria.service.LivroService;

@RestController
@RequestMapping("/")
public class LivroController {
	
	@Autowired
	private LivroRepository repository;
	
	@Autowired
	private LivroService service;

}
