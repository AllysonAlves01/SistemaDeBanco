package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteExeption extends Exception { // CRIANDO NOSSA PROPRIA EXEÇÃO
	

	public SaldoInsuficienteExeption(String msg) {
		super(msg);
	}

}
