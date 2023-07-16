package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		//GENERICS

		List<Conta> lista = new ArrayList<Conta>();   /// DEFININDO DE ARRAYLISTA SÓ PODE CRIAR CONTAS. E NADA MAIS 

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc); //adicionando

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2); //adicionando

		System.out.println("TAMANHO PRIMEIRO É  "   + lista.size()); // size = QUAL O SEU TAMANHO ? LISTA ?

		Conta ref = lista.get(1); 

		System.out.println(ref.getNumero());

		lista.remove(0); // removendo

		System.out.println("Tamanho: " + lista.size());

		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc3); // adicionando

		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);

		for (int i = 0; i < lista.size(); i++) { // MODELO ANTIGO
			Object oRef = lista.get(i);

			System.out.println(oRef);
		}

		System.out.println("----------");

		for (Conta oRef : lista) {
			System.out.println(oRef);
		}

	}

}
