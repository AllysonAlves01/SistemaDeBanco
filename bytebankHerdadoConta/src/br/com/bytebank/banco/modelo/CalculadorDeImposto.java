package br.com.bytebank.banco.modelo;

//br.com.bytebank.banco.modelo.CaculadorDeImposto = FQN

public class CalculadorDeImposto {
	
	private double TotalImposto;
	
	public void registra(ContaCorrente cc) {
	double valor = cc.getValorImposto();
	this.TotalImposto += valor;
	}
	
	public double getTotalImposto() {
		return TotalImposto;
	}

	public void registra(SeguroDeVida seguro) {
		// TODO Auto-generated method stub
		
	}

}
