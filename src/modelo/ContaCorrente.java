package modelo;

public class ContaCorrente extends Conta implements Tributavel {

  public ContaCorrente(int agencia, int numero) {
    super(agencia, numero);
  }

  @Override
  public void saca(double valor) {
    double valorASacar = valor + 0.20;
    super.saca(valorASacar);
  } 

  public void deposita(double valor) {
    if (valor <= 0)
      return;
    super.saldo += valor;
  }

  @Override
  public double getValorImposto() {
    return super.getSaldo() * 0.10;
  }
}
