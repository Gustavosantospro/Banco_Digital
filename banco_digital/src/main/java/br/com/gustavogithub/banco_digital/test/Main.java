package br.com.gustavogithub.banco_digital.test;

import br.com.gustavogithub.banco_digital.model.Cliente;
import br.com.gustavogithub.banco_digital.model.Conta;
import br.com.gustavogithub.banco_digital.model.contas.ContaCorrente;
import br.com.gustavogithub.banco_digital.model.contas.Poupanca;

public class Main {

	public static void main(String[] args) {
		
		Cliente gustavo = new Cliente();
		gustavo.setName("Gustavo");
		
		Conta cc = new ContaCorrente(gustavo);
		cc.depositar(100);
	
		Conta poupanca = new Poupanca(gustavo);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
