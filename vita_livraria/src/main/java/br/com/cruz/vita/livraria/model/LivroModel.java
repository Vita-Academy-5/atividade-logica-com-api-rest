package br.com.cruz.vita.livraria.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
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

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "livros")
@Entity(name = "Livro")
public class LivroModel {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_livro")
	private Long id_livro;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private ClienteModel cliente;
	
	private String nome_livro;
	
	private LocalDate data_publicacao;
	
	private String autoria;
	
	private String editora;
	
	private String categoria;
	
	private BigDecimal preco;

}
