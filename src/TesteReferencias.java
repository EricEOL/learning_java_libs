public class TesteReferencias {
  public static void main(String[] args) {
    
    Gerente g1 = new Gerente();
    g1.setSalario(5000);

    Funcionario f1 = new Funcionario();
    f1.setSalario(2000);

    EditorVideo ev1 = new EditorVideo();
    ev1.setSalario(2500);

    ControleBonificacao controle = new ControleBonificacao();
    controle.registra(g1);
    controle.registra(f1);
    controle.registra(ev1);

    System.out.println(controle.getSoma());
  }
}
