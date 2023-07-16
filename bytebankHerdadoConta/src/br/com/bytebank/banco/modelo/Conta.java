package br.com.bytebank.banco.modelo;


/**
 * Classe representa a moldura de uma conta
 * @author Allyson
 *
 */
public abstract class Conta extends Object implements Comparable <Conta> { // ABASTRACT = NINGUEM MAIS PODE INSTACIAR OU CRIAR UM OBJETO DO MODO CONTA
	
	protected double saldo; // UTLIZANDO O PROTECTED = VISIVEL SOMENTE PARA OS FILHOS
	private int agencia;
	private int numero;
	private Cliente titular; // TITULAR PASSOU A TER UMA REFERENCIA. NESSE CASO TODO TITULAR É UM CLIENTE E
	// POSSUI TUDO OQUE HA NA CLASSE CLIENTE
	
	private static int total; //STATIC DETERMINA O ATRIBUTO QUE SEJA DA CLASSE CONTA E NAO DE CADA OBJETO

	
	
/**
 * Construtor para inicializar o objeto conta a partir da agencia e numero
 * @param agencia
 * @param numero
 */
		
	public Conta(int agencia, int numero) { // CRIANDO CONSTRUTOR 
		Conta.total++;
		if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inválida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inválido");
        }
		//System.out.println(" O total de contas é " + total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		//System.out.println("Estou criando uma conta " + this.numero);
	}
	
	public abstract void deposita(double valor); // UTILIZANDO O ABSTRACT. NÃO HÁ IMPLEMENTAÇÃO, SENDO ASSIM OBRIGA OS FILHOS A FAZER A IMPLENTAÇÃO DO METODO
		
								

	/**
	 * Valor precisa ser maior ou igual do que o saldo.
	 * @paramvalor
	 * @throws SaldoInsuficienteExeption
	 */
	public void saca(double valor) throws SaldoInsuficienteExeption {
		
		if (this.saldo < valor) { 
			throw new SaldoInsuficienteExeption("Saldo: " + this.saldo + ", Valor: " + valor);
					
		}
		this.saldo -= valor; 	
		
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteExeption {
        this.saca(valor);
        destino.deposita(valor);
       
    }


	public double getSaldo() { // METODO PARA DEVOLVER O SALDO, CASO ALGUEM PRECISE VERIFICAR CHAMADNO O MOTEDO
								// GETSALDO
		return this.saldo;
	}

	public int getNumero() { // METODO PARA DEVOLVER O NUMERO DA CONTA CASO ALGUEM SOLICITE CHAMANDO O METODO
								// GETNUMERO
		return this.numero;
	}

	public void setNumero(int numero) { // METODO UTILIZANDO O SET . PARA DEIXAR POSSIVEL FAZER A ALTERAÇÃO DO NUMERO
		if(numero <=0) {
			System.out.println("Não pode valor <= 0");
			return;
		}
		this.numero = numero; 
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <=0 ) { // DETERMINANDO QUE AGENCIA NAO PODE SER NEGATIVO
			System.out.println("Não pode valor menor igual a 0");
			return; // COMANDO PARA PARAR A EXECUÇÃO
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public boolean equals(Object ref) { // METODO EQUALS PARA VERIFICAR SE AGENCIA E NUMERO É IGUAL A CONTA A SER CRIADA // HERDANDO DA CLASSE MAE OBJECT
		
		Conta outra = (Conta) ref; // FAZENDO O CAST - DETERNIMANDO QUE REF É AGORA UMA CONTA
		
		if (this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
		public int compareTo(Conta outra) { // metodo para comparar uma conta com outra
		
		
			
			return Double.compare(this.saldo, outra.saldo);
		}
	
	@Override
	public String toString() {
		
		return "Agencia: " + this.agencia + " , Numero: " + this.numero + ", Saldo: " + this.saldo;
	}
}