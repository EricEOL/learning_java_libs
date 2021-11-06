public class ContaCorrente extends Conta {

  public ContaCorrente(int agencia, int numero) {
    super(agencia, numero);
  }

  @Override
  public void saca(double valor) {
    double valorASacar = valor + 0.20;
    super.saca(valorASacar);
  } 
}
