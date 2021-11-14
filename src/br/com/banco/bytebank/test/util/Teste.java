package br.com.banco.bytebank.test.util;

import java.util.ArrayList;

import br.com.banco.bytebank.modelo.Conta;
import br.com.banco.bytebank.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {

		ArrayList lista = new ArrayList();
		
		Conta cc = new ContaCorrente(11, 111);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 222);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = (Conta) lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(33, 333);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(44, 444);
		lista.add(cc4);
		System.out.println("Tamanho: " + lista.size());

		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("---------------");
		
		for(Object oRef : lista) {
			System.out.println(oRef);
		}
	}

}
