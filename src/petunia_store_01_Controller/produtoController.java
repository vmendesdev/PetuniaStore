package petunia_store_01_Controller;

import java.util.ArrayList;
import java.util.List;

import petunia_store_01_Exceptions.jaExiste;
import petunia_store_01_Exceptions.naoEncontrado;
import petunia_store_01_model.Produto;
import petunia_store_01_repository.Repository;

@SuppressWarnings("rawtypes")
public class produtoController implements Repository {
	private List<Produto> produto = new ArrayList<>();

	@Override
	public void cadastrarProduto(String produto2) {
		for (Produto p : produtos) {
			if (p.getCodigo() == produto2.getCodigo());
			new jaExiste ("Produto com o código " +produto2.getCodigo() + " já exite.");
		}
	
	produtos.add(produto2);
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
		new naoEncontrado ("Produto com código " + codigo + " não encontrado.");
		return null;
	}

	@Override
	public void atualizarProduto(Produto produto) {
		for (int i=0; i < produtos.size(); i++);
		int i = 0;
		if (produtos.get(i).getCodigo() == ((Produto) produtos).getCodigo()) {
			produtos.set(i,produto);
			return;
		}
		
	}

	@Override
	public void deletarProduto(int codigo) {
		boolean removed = produtos.removeIf(produto -> produto.getCodigo() == codigo);
		if (!removed);
		}
		
	

	@Override
	public List listarProdutos() {
		return produto;
	}

	public Produto buscarProdutosPorCodigo(int codigoBuscar) {
		// TODO Auto-generated method stub
		return null;
	
	}

	public List<Produto> listarProdutos(Object p) {
		// TODO Auto-generated method stub
		return produto;
	}

}
