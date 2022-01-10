package br.com.gustavogithub.banco_digital.model;

import lombok.Data;

@Data
public abstract class Conta implements ContaInterface{

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;


	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		if (saldo < valor) {
			System.out.println("saldo insuficiente");
			throw new RuntimeException();
		}
		saldo = saldo - valor;		
	}
	@Override
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	@Override
	public void transferir(double valor, ContaInterface contaDestino) {
		if (valor > this.saldo) {
			System.out.println("não foi possível realizar trnasferência");
			throw new RuntimeException();
		}
		this.sacar(valor);
		contaDestino.depositar(valor);
		} 
	
	
	protected void imprimirInfoComun() {
		System.out.println(String.format("Titular: %s", cliente.getName()));
		System.out.println(String.format("Agencia: %d", agencia));
		System.out.println(String.format("Numero: %d", numero));
		System.out.println(String.format("Saldo: %.2f", saldo));
	}
	
	
}
