package br.com.banco.bytebank.teste;

import br.com.banco.bytebank.modelo.*;

/**
 * Classe que representa um cliente no ByteBank
 * @author Eric Lopes
 * @version 1.0
 */

public class TesteContas {
  public static void main(String[] args) {

    ContaCorrente cc = new ContaCorrente(1111, 2222);
    ContaPoupanca cp = new ContaPoupanca(3333, 4444);

    try {
      cc.deposita(1000);
      cc.saca(999.80);
      cc.saca(800);

      cp.deposita(3000);

      cp.transfere(1000, cc);

      System.out.println("Corrente: " + cc.getSaldo());
      System.out.println("Poupança: " + cp.getSaldo());
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }
}
