package br.com.cruz.vita.livraria.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.cruz.vita.livraria.enums.StatusPedido;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "pedidos")
@Entity(name = "Pedido")
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id_pedido")
public class PedidoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedido")
	private Long id_pedido;
	
	
	@JoinColumn(name = "id_cliente")
	private Long id_cliente;
	
	@JoinColumn(name = "id_livro")
	private Long id_livro;
	
	@Column(name = "data_do_pedido")
	private LocalDate data_do_pedido;
	
	@Column(name = "data_de_entrega")
	private LocalDate data_de_entrega;
	
	@Column(name = "valor")
	private BigDecimal valor;
	
	@Enumerated(EnumType.STRING)
	private StatusPedido status;
	
	
	private LivroModel livroModel;
	
	
	private ClienteModel clienteModel;
	
	

}
