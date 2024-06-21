package petunia_store_01_repository;

import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;

import petunia_store_01_model.Produto;

public interface Repository<produto> {

	public void cadastrarProduto (Produto produto) throws ProtocolException;
	List <Produto> listarProdutos();
	public Produto buscarProdutoPorCodigo(int codigo);
	public void atualizarProduto (Produto produto);
	public void deletarProduto (int codigo);
	
	List<Produto> produtos = new ArrayList<>();

	void cadastrarProduto(String produto2);
}
