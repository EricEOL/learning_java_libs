public class ContaCorrente extends Conta implements Tributavel {

  public ContaCorrente(int agencia, int numero) {
    super(agencia, numero);
  }

  @Override
<<<<<<< HEAD
  public void saca(double valor) {
    double valorASacar = valor + 0.20;
    super.saca(valorASacar);
  } 
=======
  public void deposita(double valor) {
    if (valor <= 0)
      return;
    super.saldo += valor;
  }

  @Override
  public boolean saca(double valor) {
    double valorASacar = valor + 0.20;
    return super.saca(valorASacar);
  }

  @Override
  public double getValorImposto() {
    return super.getSaldo() * 0.10;
  }

>>>>>>> 825e020f322ad2d6dfd920131fcf249adf6ece5e
}
