package petunia_store_01_Controller;

import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;

import petunia_store_01_Exceptions.jaExiste;
import petunia_store_01_Exceptions.naoEncontrado;
import petunia_store_01_model.Produto;
import petunia_store_01_repository.Repository;

public class produtoController implements Repository {
	private List<Produto> produto = new ArrayList<>();

	@Override
	public void cadastrarProduto(Produto produto) throws jaExiste {
		for (Produto p : produtos) {
			if (p.getCodigo() == produto.getCodigo());
			throw new jaExiste ("Produto com o código " +produto.getCodigo() + " já exite.");
		}
	
	produtos.add(produto);
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	@Override
	public Produto buscarProdutoPorCodigo(int codigo) {
		for (Produto produto : produtos) {
			if (produto.getCodigo() ==  codigo) {
				return produto;
			}
		}
		throw new naoEncontrado ("Produto com código " + codigo + " não encontrado.");
	}

	@Override
	public void atualizarProduto(Produto produto) {
		for (int i=0; i < produtos.size(); i++);
		if (produtos.get(i).getCodigo() == produtos.getCodigo()) {
			produtos.set(i,produto);
			return;
		}
		
	}

	@Override
	public void deletarProduto(int codigo) {
		boolean removed = produtos.removeIf(produto -> produto.getCodigo() == codigo);
		if (!removed) {
			throw new naoEncontrado("Produto com código " + codigo + " não encontrado.")
		}
		
	}

}
