package conta_bancaria.controller;

import java.util.ArrayList;
import java.util.Optional;

import conta_bancaria.repository.ContaRepository;
import conta_model.util.Conta;

public class Contacontroller implements ContaRepository {

	private ArrayList <Conta> listaConta = new ArrayList <Conta>();

	int numero = 0;
	
	@Override
	public void procuraPorNumero(int numero) {
		Optional<Conta> conta = buscarNaCollection(numero);
		
		if (conta.isPresent()) 
			conta.get().visualizar();
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
		Optional<Conta> buscaConta = buscarNaCollection(conta.getNumero());

		if (buscaConta.isPresent()) {
			listaConta.set(listaConta.indexOf(buscaConta.get()), conta);
			System.out.println("Dados Anteriores");
			buscaConta.get().visualizar();
			System.out.println("Dados Atualizados");
			procuraPorNumero(buscaConta.get().getNumero());
			System.out.printf("\nA Conta número %d foi atualizada com sucesso!", conta.getNumero());
		}else
			System.out.printf("\nA Conta número %d não foi encontrada", conta.getNumero());

	}

	@Override
	public void deletar(int numero) {
		Optional<Conta> conta = buscarNaCollection(numero);
		
		if (conta.isPresent()) {
			if (listaConta.remove(conta.get())== true) {
				System.out.printf("\n a conta %d foi excluida com sucesso",numero);}}
		else {
			System.out.printf("\nA conta numero %d Não foi encontrada!",numero);
		}
		
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
	
	public  Optional <Conta> buscarNaCollection(int numero) {
		for(var conta : listaConta) {
			if(conta.getNumero() == numero)
				return Optional.of(conta);
		}
		return Optional.empty();
	}
}
