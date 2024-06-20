package petunia_store_01;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("************************************************************************");
		System.out.println("\n");
		System.out.println("                PETUNIA STORE - O MELHOR PREÇO É AQUI!                  ");
		System.out.println("\n");
		System.out.println("************************************************************************");
		System.out.println("\n1-  Cadastrar produtos");
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
			
			break;
		case 2:
			System.out.println("Listar todos os produtos");
			
			break;
		case 3:
			System.out.println("Buscar produtos por código");
			
			break;
		case 4:
			System.out.println("Atualizar informações do produto");
			
			break;
		case 5:
			System.out.println("Deletar produto");
			
			break;
		case 6:
			System.out.println("Deletar informações");
			
			break;
		case 7:
			System.out.println("Sair");
			
			break;
		default:
			System.out.println("\nOpção Inválida!\n");
			
			break;
		}
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
