package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel { // EXTENDS HERDA SOMENTE ATRIBUTOR E METODO. NÃO HERDA CONSTRUTORES

	public ContaCorrente(int agencia, int numero) { // CRIANDO CONSTRUTOR
		super(agencia, numero); // CHAMANDO CONSTRUTOR DA CLASSE MÃE )

	}

	@Override // INFORMANDO AO COMPILADOR QUE QUEREMOS REESCREVER O METODO JA INICIADO NA
				// CLASSE MAE E NAO QUERENDO CRIAR UM NOVO METODO
	
	public void saca(double valor) throws SaldoInsuficienteExeption {
		double valorASacar = valor + 0.2;

		 super.saca(valorASacar); // UTILIZANDO O SUPER PARA CHAMAR O METODO SACA DA CLASSE MÃE E CONSEGUIR ALTERAR O VALOR A SER SACADO
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor; // UTILIZANDO O SUPER. CHAMANDO O ATRIBUTO DA CLASSE MAE
	
		
	}

	@Override
	public double getValorImposto() {
		
		return super.saldo * 0.01;
	}
	
	@Override
		public String toString() {
			
			return "ContaCorrente: " + super.toString();
		}
}