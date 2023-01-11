package br.com.cruz.vita.livraria.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.cruz.vita.livraria.enums.StatusPedido;
import br.com.cruz.vita.livraria.model.LivroModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDTO {
	
	private StatusPedido status;
	
	private Long id_cliente;
	
	private LivroModel lModel;
	
	private BigDecimal valor;
	
	private LocalDate data_de_entrega;
	
	private LocalDate data_do_pedido;

}
