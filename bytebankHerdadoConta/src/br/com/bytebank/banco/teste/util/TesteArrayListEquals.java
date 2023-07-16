package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		// GENERICS

		List<Conta> lista = new ArrayList<Conta>(); /// DEFININDO DE ARRAYLISTA SÓ PODE CRIAR CONTAS. E NADA MAIS

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc); // ADICIONANDO NA LISTA A CONTA

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(22, 22);
		boolean existe = lista.contains(cc3); // contains = perguntando se ja existe , devolvendo true ou false caso
												// negativo

		System.out.println(" Já existe? " + existe);

	

		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
