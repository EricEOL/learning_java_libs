package br.com.banco.bytebank.modelo;

public class SaldoInsuficienteException extends RuntimeException {
  public SaldoInsuficienteException(String message) {
    super(message);
  }
}
