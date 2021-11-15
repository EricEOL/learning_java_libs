package br.com.banco.bytebank.teste;

import java.util.ArrayList;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;
import br.com.banco.bytebank.modelo.GuardadorDeContas;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(11, 111);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(22, 222);
		lista.add(cc2);
		
		for(Conta conta : lista) {
			System.out.println(conta.getNumero());
		}

	}

}
