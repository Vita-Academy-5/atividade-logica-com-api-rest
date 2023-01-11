package br.com.cruz.vita.livraria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cruz.vita.livraria.dto.PedidoDTO;
import br.com.cruz.vita.livraria.repository.PedidoRepository;
import br.com.cruz.vita.livraria.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoRepository repository;
	
	@Autowired
	private PedidoService service;
	
	@PostMapping("/registrar")
	public ResponseEntity<PedidoDTO> cadastar(@RequestBody PedidoDTO pedido){
		return ResponseEntity.ok(service.criarPedido(pedido));
	}
	
	
	
	

}
