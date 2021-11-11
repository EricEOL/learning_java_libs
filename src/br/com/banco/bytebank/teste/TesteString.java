package br.com.banco.bytebank.teste;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Alura";
		//String outro = new String("Eric");
		
		String novoNome = nome.replace("a", "b");
		nome.toUpperCase();
		
		int position = nome.indexOf("k");
		System.out.println(position);
		
		System.out.println(novoNome.toUpperCase());
		
		String vazio = " ";
		
		System.out.println(vazio.trim().isEmpty());
	}

}
