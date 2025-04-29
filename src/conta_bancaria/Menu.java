package conta_bancaria;

import java.io.IOException;
import java.util.Scanner;

import conta_bancaria.util.Cores;
import conta_model.util.Conta;
import conta_model.util.ContaCorrente;
import conta_model.util.ContaPoupanca;

public class Menu {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao;

     // Criar (instanciar) um Objeto da Classe Conta
     		Conta c1 = new Conta(1, 123, 1, "Junior", 500000);
     		c1.visualizar();
     		
     		// Sacar
     		c1.sacar(100);
     		c1.visualizar();

     		// Depositar
     		c1.depositar(1000);
     		c1.visualizar();
     		
     		// Alterar a propriedade titular
     		c1.setTitular("Junior Reis");
     		c1.visualizar();
     		
     		ContaCorrente cc1 = new ContaCorrente(2,456,1,"Renata Negrini",60000,6000);
     		cc1.visualizar();
     		
     		cc1.sacar(661000);
     		cc1.visualizar();
     		
     		ContaPoupanca cp1 = new ContaPoupanca(3,252,1,"Junior nunes",60000,15);
     		cp1.visualizar();
        
        while (true) {
            System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND);
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            BANCO DO BRAZIL COM Z                    ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Criar Conta                          ");
            System.out.println("            2 - Listar todas as Contas               ");
            System.out.println("            3 - Buscar Conta por Número              ");
            System.out.println("            4 - Atualizar Dados da Conta             ");
            System.out.println("            5 - Apagar Conta                         ");
            System.out.println("            6 - Sacar                                ");
            System.out.println("            7 - Depositar                            ");
            System.out.println("            8 - Transferir valores entre Contas      ");
            System.out.println("            9 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.print("Entre com a opção desejada:                          ");
            System.out.println(Cores.TEXT_RESET);

            opcao = leia.nextInt();

            if (opcao == 9) {
                System.out.println("\nBanco do Brazil com Z - Até mais!");
                leia.close();
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Criar Conta\n");
                    break;
                case 2:
                    System.out.println("Listar todas as Contas\n");
                    break;
                case 3:
                    System.out.println("Buscar Conta por Número\n");
                    break;
                case 4:
                    System.out.println("Atualizar Dados da Conta\n");
                    break;
                case 5:
                    System.out.println("Apagar Conta\n");
                    break;
                case 6:
                    System.out.println("Sacar\n");
                    break;
                case 7:
                    System.out.println("Depositar\n");
                    break;
                case 8:
                    System.out.println("Transferir valores entre Contas\n");
                    break;
                default:
                    System.out.println("Opção Inválida!\n");
                    break;
            }
        }
    }
    
    public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
	}
    
    public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}

