package br.com.banco.bytebank.modelo;

public class ContaPoupanca extends Conta {

  public ContaPoupanca(int agencia, int numero) {
    super(agencia, numero);
  }

  @Override
  public void deposita(double valor) {
    if (valor <= 0)
      return;
    this.saldo += valor;
  }
}
