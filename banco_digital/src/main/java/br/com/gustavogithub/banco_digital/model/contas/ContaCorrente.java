package br.com.gustavogithub.banco_digital.model.contas;

import br.com.gustavogithub.banco_digital.model.Cliente;
import br.com.gustavogithub.banco_digital.model.Conta;

public class ContaCorrente extends Conta  {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("--- Extrato Conta Corrente ---");
		super.imprimirInfoComun();
	}

}
