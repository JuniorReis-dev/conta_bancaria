package conta_bancaria.controller;

import java.util.ArrayList;

import conta_bancaria.repository.ContaRepository;
import conta_model.util.Conta;

public class Contacontroller implements ContaRepository {

	private ArrayList <Conta> listaConta = new ArrayList <Conta>();

	int numero = 0;
	
	@Override
	public void procuraPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null ) {
			conta.visualizar();
		}
		else {
			System.out.printf("\nA conta numero %d Não foi encontrada!",numero);
		}
		
	}

	@Override
	public void listarTodas() {
		for (var conta : listaConta) {
			conta.visualizar();
			}
	}

	@Override
	public void cadastrar(Conta conta) {
		listaConta.add(conta);
		System.out.println("A Conta foi criado com sucesso!");
	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}
	
	// metodos auxiliares
	public int gerarNumero() {
		return ++ numero;
	}
	
	public Conta buscarNaCollection(int numero) {
		for(var conta : listaConta) {
			if(conta.getNumero() == numero)
				return conta;
		}
		return null;
	}
}
