package ecommerce;

import java.util.Scanner;

import ecommerce.util.Cores;

public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND +
					           "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                   ECOMMERCE BRASIL                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Produto                        ");
			System.out.println("            2 - Listar todos os Produto              ");
			System.out.println("            3 - Buscar Produto por ID                ");
			System.out.println("            4 - Atualizar Dados do Produto           ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " +  Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println("\nEcommerce Brasil - O seu Futuro começa aqui!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
			
				case 1:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Produto\n\n");

					break;
					
				case 2:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todos os Produtos\n\n");

					break;
					
				case 3:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Buscar Produto por ID\n\n");

					break;
					
				case 4:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados do Produto\n\n");

					break;
					
				case 5:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar Produto\n\n");

					break;
					
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND +
				         "\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Letícia Pinheiro - leticiappv@gmail.com");
		System.out.println("https://github.com/leticiappv");
		System.out.println("*********************************************************" + Cores.TEXT_RESET);
	}
}