package br.com.cruz.vita.livraria.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cruz.vita.livraria.dto.PedidoDTO;
import br.com.cruz.vita.livraria.enums.StatusPedido;
import br.com.cruz.vita.livraria.model.ClienteModel;
import br.com.cruz.vita.livraria.model.LivroModel;
import br.com.cruz.vita.livraria.model.PedidoModel;
import br.com.cruz.vita.livraria.repository.ClienteRepository;
import br.com.cruz.vita.livraria.repository.LivroRepository;
import br.com.cruz.vita.livraria.repository.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repository;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private LivroRepository lRepository;

	@Autowired
	private ClienteRepository cRepository;

	public PedidoDTO criarPedido(PedidoDTO pedidoDTO) {
		PedidoModel pedido = modelMapper.map(pedidoDTO, PedidoModel.class);

		pedido.setStatus(StatusPedido.PEDIDO_ENTREGUE);
		List<LivroModel> busca = lRepository.findAll();

		for (LivroModel livroModel : busca) {
			pedido.getLivroModel().setId_livro(livroModel.getId_livro());
			pedido.getLivroModel().setPreco(livroModel.getPreco());
			pedido.getLivroModel().setNome_livro(livroModel.getNome_livro());
			pedido.getLivroModel().setAutoria(livroModel.getAutoria());
		}

		List<ClienteModel> buscaCliente = cRepository.findAll();
		for (ClienteModel clienteModel : buscaCliente) {
			pedido.getClienteModel().setId_cliente(clienteModel.getId_cliente());
			pedido.getClienteModel().setNome_cliente(clienteModel.getNome_cliente());
			pedido.getClienteModel().setCpf(clienteModel.getCpf());
		}

		repository.save(pedido);

		return pedidoDTO;
	}

}
