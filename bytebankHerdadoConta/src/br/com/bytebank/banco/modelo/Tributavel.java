package br.com.bytebank.banco.modelo;

//CONTRATO TRIBUTAVEL
//QUEM ASSINA ESSE CONTRATO, PRECISA IMPLEMENTAR
//METODO GET VALOR IMPOSTO
public  interface Tributavel { // INTERFACE É UMA CLASSE ABSTRACT COM TODOS OS METODO ABSTRACT E NAO PODE TER NADA CONCRETO
	public abstract double getValorImposto();

}
