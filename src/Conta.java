public abstract class Conta {
  protected double saldo;
  private int agencia;
  private int numero;
  private Cliente titular;

  private static int total = 0;

  public Conta(int agencia, int numero) {
    Conta.total++;
    this.agencia = agencia;
    this.numero = numero;
  }

  public abstract void deposita(double valor);

  public boolean saca(double valor) {
    if (valor <= this.saldo) {
      this.saldo -= valor;
      return true;
    } else {
      return false;
    }
  }

  public boolean transfere(double valor, Conta destino) {
    if (valor <= this.saldo) {
      this.saca(valor);
      destino.deposita(valor);
      return true;
    }
    return false;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    if (numero <= 0)
      return;
    this.numero = numero;
  }

  public int getAgencia() {
    return this.agencia;
  }

  public void setAgencia(int agencia) {
    if (numero <= 0)
      return;
    this.agencia = agencia;
  }

  public Cliente getTitular() {
    return this.titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public static int getTotal() {
    return Conta.total;
  }
}