public class ContaPoupanca extends Conta{
  
  public ContaPoupanca(Conta conta) {
    super(conta.getAgencia(), conta.getNumero());
  }
  
}
