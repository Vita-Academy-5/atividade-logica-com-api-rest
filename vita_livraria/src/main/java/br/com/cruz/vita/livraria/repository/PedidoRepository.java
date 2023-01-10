package br.com.cruz.vita.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cruz.vita.livraria.model.PedidoModel;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoModel, Long>{

}
