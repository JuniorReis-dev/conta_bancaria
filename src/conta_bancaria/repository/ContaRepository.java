package conta_bancaria.repository;

import conta_model.util.Conta;

public interface ContaRepository {
	// metodos do Crud (Create,Read,Update e delete)
	public void procuraPorNumero (int numero);
	public void listarTodas ();
	public void cadastrar(Conta conta);
	public void atualizar(Conta conta);
	public void deletar(int numero);
	
	// metodos bancarios 
	public void sacar(int numero, float valor);
	public void depositar(int numero, float valor);
	public void transferir(int numeroOrigem, int numeroDestino, float valor);
	
}