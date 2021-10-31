public class TesteContas {
  public static void main(String[] args) {

    ContaCorrente cc = new ContaCorrente(1111, 2222);
    cc.deposita(1000);
    cc.saca(300);

    ContaPoupanca cp = new ContaPoupanca(3333, 4444);
    cp.deposita(3000);

    cp.transfere(1000, cc);

    System.out.println("Corrente: " + cc.getSaldo());
    System.out.println("Poupança: " + cp.getSaldo());

  }
}
