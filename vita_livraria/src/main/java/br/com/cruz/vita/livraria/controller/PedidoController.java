package br.com.cruz.vita.livraria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cruz.vita.livraria.repository.PedidoRepository;

@RestController
@RequestMapping("pedidos")
public class PedidoController {
	
	@Autowired
	private PedidoRepository repository;
	
	
	
	

}
