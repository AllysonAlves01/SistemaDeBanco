package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	// Array []
	public static void main(String[] args) {

		int[] idades = new int[5]; // CRIANDO ARRAY - INICIADO COM 0
		
		for( int i = 0; i < idades.length; i++) {
			idades [i] = i * i; // ACESSANDO 
		}

		for( int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
System.out.println("Posição trés é : " + idades[3]);
//		idades[0] = 29; // ATRIBUINDO VALOR PARA O ARRAY
//		idades[1] = 39;
//		idades[2] = 49;
//		idades[3] = 59;
//		idades[4] = 69;
//		
//	int idade1	= idades[3]; // ACESSANDO 
//	
//	
//	System.out.println(idade1);
//	
//	System.out.println(idades.length);
//	
	}

}
