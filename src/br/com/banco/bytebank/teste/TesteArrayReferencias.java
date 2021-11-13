package br.com.banco.bytebank.teste;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Object[] referencias = new Object[5];
		System.out.println(referencias[0]);
		
		ContaCorrente cc1 = new ContaCorrente(333, 111);
		referencias[0] = cc1;
		
		ContaPoupanca cp1 = new ContaPoupanca(000, 1283);
		referencias[2] = cp1;
				
		System.out.println(referencias[2]);
	}

}
