package br.com.banco.bytebank.modelo;

/**
 * Classe representa a moldura de uma conta
 * @author Eric Lopes
 */

public abstract class Conta {
  protected double saldo;
  private int agencia;
  private int numero;
  private Cliente titular;

  private static int total = 0;

  /**
   * Construtor para inicializar o objeto conta a partir da agência e número
   * @param agencia
   * @param numero
   */
  public Conta(int agencia, int numero) {
    Conta.total++;
    this.agencia = agencia;
    this.numero = numero;
  }

  public abstract void deposita(double valor);

  public void saca(double valor) {
    if (valor > this.saldo) {
      throw new SaldoInsuficienteException("Insuficiente | Saldo: " + this.saldo + ", Valor: " + valor);
    }

    this.saldo -= valor;
  }

  public void transfere(double valor, Conta destino) {
    this.saca(valor);
    destino.deposita(valor);
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

  @Override
  public boolean equals(Object ref) {
	  
	Conta conta = (Conta) ref;
	  
	if(this.agencia != conta.agencia) {
		return false;
	}
	
	if(this.numero != conta.numero) {
		return false;
	}
	
	return true;
  };
  
  
  
  
  
  
  
}