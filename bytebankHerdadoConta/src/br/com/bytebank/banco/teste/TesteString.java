package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura"; //CRIANDO OBJETO, NAO É NECESSARIO USAR O NEW EN STRING.
		
		String outra = nome.replace("A", "a");
		//nome.toLowerCase();
		
		System.out.println(outra);
		
		//System = classe, java.lang, acesso publico
		// out = atributo , publico , static
		// println = meotodo , public, nao static, sobrecarga , nao joga excecoes do tipo checked
	}

}
