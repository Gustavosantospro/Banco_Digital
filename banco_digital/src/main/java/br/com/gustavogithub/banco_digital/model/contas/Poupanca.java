package br.com.gustavogithub.banco_digital.model.contas;

import br.com.gustavogithub.banco_digital.model.Cliente;
import br.com.gustavogithub.banco_digital.model.Conta;

public class Poupanca extends Conta  {

	public Poupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("--- Extrato Conta Poupanca ---");
		super.imprimirInfoComun();
	}

	
	

}
