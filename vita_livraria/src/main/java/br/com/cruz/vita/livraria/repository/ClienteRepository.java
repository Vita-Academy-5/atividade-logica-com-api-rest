package br.com.cruz.vita.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cruz.vita.livraria.model.ClienteModel;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long>{

}
