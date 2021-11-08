package br.com.banco.bytebank.teste;

import br.com.banco.bytebank.modelo.*;

public class TesteImposto {
  public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente(1111, 1111);
    cc.deposita(3000);

    SeguroDeVida segVida = new SeguroDeVida();

    CalculadorImposto calculador = new CalculadorImposto();

    calculador.registra(cc);
    calculador.registra(segVida);

    System.out.println(calculador.getTotalImposto());
  }
}
