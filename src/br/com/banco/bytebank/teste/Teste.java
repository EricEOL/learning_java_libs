package br.com.banco.bytebank.teste;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(11, 111);
		
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22, 222);
		
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(1);
		System.out.println(ref.getNumero());

	}

}
