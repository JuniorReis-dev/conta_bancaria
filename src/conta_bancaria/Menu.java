package conta_bancaria;

import java.io.IOException;
import java.util.Scanner;

import conta_bancaria.controller.Contacontroller;
import conta_bancaria.util.Cores;
import conta_model.util.Conta;
import conta_model.util.ContaCorrente;
import conta_model.util.ContaPoupanca;


public class Menu {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Contacontroller contas = new Contacontroller();
        int opcao, numero, agencia, tipo = 0,aniversario;
        String titular;
        float saldo,limite;
        
        ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, "João da Silva", 1000.00f, 100.00f);
		contas.cadastrar(cc1);
		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 123, 2, "Maria da Silva", 1000.00f, 12);
		contas.cadastrar(cp1);
        
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
                	System.out.println("digite o numero da agencia");
                	agencia = leia.nextInt();
                	System.out.println("digite o nome do titular");
                	leia.skip("\\R");
                	titular = leia.nextLine();
                	System.out.println("digite o tipo da conta (1 - CC | 2 - CP )");
                	agencia = leia.nextInt();
                	System.out.println("digite o saldo");
                	saldo = leia.nextFloat();
                	
                	switch (tipo) {
                		case 1-> {
                			System.out.println("digite o limite da conta");
                			limite = leia.nextFloat();
                			contas.cadastrar(new ContaCorrente(contas.gerarNumero(),agencia,tipo,titular,limite,saldo));
                		} 
                		case 2-> {
                			System.out.println("digite o aniversario da conta");
                			aniversario = leia.nextInt();
                			contas.cadastrar(new ContaCorrente(contas.gerarNumero(),agencia,tipo,titular,aniversario,saldo));
                		} 
                	}
                	
                	
                	
                    keyPress();
                    break;
                case 2:
                    System.out.println("Listar todas as Contas\n");
                    contas.listarTodas();
                    keyPress();
                    break;
                case 3:
                    System.out.println("Buscar Conta por Número\n");
                    System.out.println("Digite o numero da conta");
                    numero = leia.nextInt();
                    contas.procuraPorNumero(numero);
                    keyPress();
                    break;
                case 4:
                	keyPress();
                    System.out.println("Atualizar Dados da Conta\n");
                    break;
                case 5:
                	keyPress();
                    System.out.println("Apagar Conta\n");
                    break;
                case 6:
                	keyPress();
                    System.out.println("Sacar\n");
                    break;
                case 7:
                	keyPress();
                    System.out.println("Depositar\n");
                    break;
                case 8:
                	keyPress();
                    System.out.println("Transferir valores entre Contas\n");
                    break;
                default:
                	keyPress();
                    System.out.println("Opção Inválida!\n");
                    break;
            }
        }
    }
    
    public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("By Junior Reis");
		System.out.println("*********************************************************");
	}
    
    public static void keyPress() {
    	 
		try {
 
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
 
		} catch (IOException e) {
 
			System.err.println("Ocorreu um erro ao tentar ler o teclado");
 
		}
	}
}

