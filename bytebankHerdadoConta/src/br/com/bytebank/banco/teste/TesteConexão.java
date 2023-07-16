package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conexao;

public class TesteConexão {
	public static void main(String[] args) throws Exception {
		
		
		try(Conexao conexao = new Conexao() ){
			conexao.leDados();
		}catch(IllegalStateException ex){
		    System.out.println("Deu erro na conexão");
		}

	}
}
		
		
		
		
		
//		Conexao con = null;
//		try {
//			 con = new Conexao();
//			con.leDados();
//			
//		} catch (IllegalStateException ex ) {  // ATRAVES DO CATCH CAPTURAMOS A EXECEAO E TRATAMOS ELA
//			System.out.println("Deu erro na conexao");
//		} finally {
//			con.fecha();
//		}
//
//	}
//}
