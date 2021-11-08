package modelo;

public class SaldoInsuficienteException extends RuntimeException {
  public SaldoInsuficienteException(String message) {
    super(message);
  }
}
