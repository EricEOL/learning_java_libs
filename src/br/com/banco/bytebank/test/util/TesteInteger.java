package br.com.banco.bytebank.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteInteger {

	public static void main(String[] args) {

		int idade = 26;
		
		List numeros = new ArrayList();
		numeros.add(idade);
		
		Integer idadeRef = Integer.valueOf(26);
		
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int valor = idadeRef.intValue();
		
		String s = args[0];
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		
		System.out.println(numero);
		
		//System.out.println(valor);
	}

}
