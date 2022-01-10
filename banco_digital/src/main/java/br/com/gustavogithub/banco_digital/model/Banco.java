package br.com.gustavogithub.banco_digital.model;

import java.util.List;

import lombok.Data;

@Data
public class Banco {

	private String name;
	private List<Conta> conta;
	
	
	
}
