package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		for (Conta conta : lista) {
			System.out.println(conta);
		}

//		TitularDaContaComparator titularComparator = new TitularDaContaComparator();

		lista.sort(new TitularDaContaComparator()); // metodo sort para organizar lista -- e fazendo o mesmo que a linha
													// de cima

//		Collections.sort(lista, new NumeroDaContaComparator()); // ORGANIZANDO ATRAVES DO NUMERO
		lista.sort(null); // forçando atraveés do null a ordem natural

		Collections.sort(lista); // organizando saldo. mas primeiro precisamos inclementar o metodo compareTo
									// extend da classe comparable
//		Collections.reverse(lista); // revertendo

//		Collections.shuffle(lista); // metodo para embaralhar
//		Collections.rotate(lista, 5); //rotacionar 5 posicoesCOPIAR CÓ

		System.out.println("------------------------------------------------------");

		for (Conta conta : lista) {
			System.out.println(conta + " , " + conta.getTitular().getNome());
		}
	}

}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) { // comparando

		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome(); // ACESSANDO O NOME DO TITULAR

		return nomeC1.compareTo(nomeC2);
	}

}

class NumeroDaContaComparator implements Comparator<Conta> { // CRIANDO CLASSE IMPLEMENTANDO COMPARATOR E ASSINANDO SEU
																// CONTRATO --PARA REALIZAR A VERIFICAÇÃO E ORGANIZXAÇÃO
																// DO NUMERO

	@Override
	public int compare(Conta c1, Conta c2) {

		return Integer.compare(c1.getNumero(), c2.getNumero()); // Comparando se a conta 1 e 2 é igual utilizando
																// heranca do integer

//		return c1.getNumero() - c2.getNumero(); // Comparando se a conta 1 e 2 é igual

//		if (c1.getNumero() < c2.getNumero()) { // // Comparando se a conta 1 e 2 é igual
//			return -1;
//		}
//
//		if (c1.getNumero() > c2.getNumero()) {
//
//			return 1;
//		}
//
//		return 0;
		
		
	}
}
