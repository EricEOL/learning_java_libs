public class ContaCorrente extends Conta {

  public ContaCorrente(Conta conta) {
    super(conta.getAgencia(), conta.getNumero());
  }
  
}
