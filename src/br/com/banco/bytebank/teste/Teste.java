package br.com.banco.bytebank.teste;

import br.com.banco.bytebank.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {

		System.out.println("x");
		System.out.println(10);
		System.out.println(true);
		
		ContaCorrente cc = new ContaCorrente(22, 11);
		
		
		println(cc);
	}
	
	static void println() {
		System.out.println("Sem param");
	}
	
	static void println(int a) {	
		System.out.println("inteiro:" + a);
	}
	
	static void println(boolean value) {
		System.out.println("Boleano: " + value);
	}

	static void println(Object ref) {
		System.out.println("Ref: " + ref);
	}
	
}
