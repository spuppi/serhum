package br.com.spuppi.processo.serhum.services;

public class DoisEmUm implements EstoqueInterface{

	@Override
	public int calcular(int valor) {
		return valor * 2;
	}

}
