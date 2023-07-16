package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {

	public static void main(String[] args) {

		// int[] idades = new int[5];
		Object[] referencias = new Object[5];

		ContaCorrente cc1 = new ContaCorrente(303, 333);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(30+3, 333);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		
		System.out.println(((Conta) referencias[1]).getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias [1]; // type cast
		
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());

	}

}
