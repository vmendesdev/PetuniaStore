package petunia_store_01;

import java.util.Scanner;

import petunia_store_01_Controller.produtoController;
import petunia_store_01_Exceptions.jaExiste;
import petunia_store_01_model.Estendida;
import petunia_store_01_model.Produto;
import petunia_store_01_repository.Repository;

public class Menu {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner(System.in);
	
		Repository produtoRepository = new Repository();
		produtoController produtoController = new produtoController();
		int opcao;
		String nome, marca, produto;
		Double preco;
		Float codigo;
	
		
		do {
		System.out.println("************************************************************************");
		System.out.println("\n");
		System.out.println("                PETUNIA STORE - O MELHOR PREÇO É AQUI!                  ");
		System.out.println("\n");
		System.out.println("************************************************************************");
		System.out.println("\n1- Cadastrar produtos");
		System.out.println("2- Listar todos os produtos");
		System.out.println("3- Buscar produtos por código");
		System.out.println("4- Atualizar informações do produto");
		System.out.println("5- Deletar produto");
		System.out.println("6- Deletar informações");
		System.out.println("7- Sair");
		System.out.println("\n");
		System.out.println("**************************************************************************");
		System.out.println("Entre com a opção desejada: ");
		System.out.println("\n");
		
		opcao = leia.nextInt();
		
		if (opcao == 7) {
			System.out.println("\nPetunia Store - o MELHOR preço você encontra aqui!");
			sobre();
			leia.close();
			System.exit(0);
		}
		
		switch (opcao) {
		case 1:
			System.out.println("Cadastrar produtos\n\n");
			try {
			
			System.out.println("Código: ");
			codigo = leia.nextFloat();
			System.out.println("Nome: ");
			nome = leia.nextLine();
			System.out.println("Preço: ");
			preco = leia.nextDouble();
			System.out.println("Marca: ");
			marca = leia.nextLine();
			
			Produto produto = new Produto(codigo, nome, preco, marca);
			produtoController.cadastrarProduto(produto);
			System.out.println("Produto Cadastrado com sucesso!");
			} catch (jaExiste e) {
				System.out.println("Produto já existe!");
			}
			break;
		case 2:
			System.out.println("Listar todos os produtos");
			for (Produto p: produtoController.listarProdutos()) {
				System.out.println(p);
			}
			break;
		case 3:
			System.out.println("Buscar produtos por código");
			try {
			System.out.print("Código: ");
			int codigoBuscar = leia.nextInt();
			Produto Encontrado = produtoController.buscarProdutosPorCodigo(codigoBusca);
			char[] produtoEncontrado;
			System.out.println(produtoEncontrado);
			if (Encontrado != null) {
				System.out.println("Produto Encontrado");
				
			}else {
				System.out.println("Produto não encontrado!");
			}
			break;
		case 4:
			System.out.println("Atualizar informações do produto");
			System.out.println("Código: ");
			int codigoAtualizar = leia.nextInt();
				Produto produtoAtualizar = produtoRepository.buscarProdutoPorCodigo(codigoAtualizar);
			
			if (produtoAtualizar != null) {
			System.out.println("Novo Código: ");
			float novoCodigo = leia.nextFloat();
			System.out.println("Novo Nome: ");
			String novoNome = leia.nextLine();
			System.out.println("Novo Preço: ");
			double novoPreco = leia.nextDouble();
			System.out.println("Novo Marca: ");
			String novoMarca = leia.nextLine();
			
			produtoAtualizar.setNome(novoNome);
			produtoAtualizar.setPreco(novoPreco);
			
			produtoRepository.atualizarProduto(produtoAtualizar);
			break;
		case 5:
			System.out.println("Deletar produto");
			System.out.println("");
			int codigoDeletar = leia.nextInt();
			produtoRepository.deletarProduto(codigoDeletar);
			System.out.println("Produto deletado com sucesso!");
			break;
		case 6:
			System.out.println("Deletar informações");
			System.out.println("Tem certeza que deseja deletar as informações? S/N");
			char confirma = leia.next().toUpperCase().charAt(0);
			if (confirma == 'S');
			produtoRepository = new Repository();
			System.out.println("Informações deletadas com sucesso!") }
			break;
		case 7:
			System.out.println("\nPetunia Store - o MELHOR preço você encontra aqui!");
			sobre();
			leia.close();
			System.exit(0);
			break;
		default:
			System.out.println("\nOpção Inválida!\n");
			
			break;
		}
		while (opcao != 7);
	}

	private static void sobre() {
		// TODO Auto-generated method stub
		System.out.println("\n*********************************************************************");
		System.out.println("Projeto Desenvolvido por: Vanessa Melo Mendes");
		System.out.println("Contato: vanessam.mendes@outlook.com.br");
		System.out.println("github.com/vmendesdev");
		System.out.println("*********************************************************************");
	}

}
