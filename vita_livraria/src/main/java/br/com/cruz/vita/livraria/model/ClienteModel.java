package br.com.cruz.vita.livraria.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "clientes")
@Entity(name = "Cliente")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cliente;
	private String nome_cliente;
	private String cpf;
	private LocalDate data_nascimento;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private LivroModel lModel;
}
