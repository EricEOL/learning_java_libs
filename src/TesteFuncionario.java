public class TesteFuncionario {
  public static void main(String[] args) {
    Funcionario eric = new Funcionario();
    
    eric.setNome("Eric Lopes");
    eric.setCpf("123.456.789-00");
    eric.setSalario(12500);

    Gerente thamiris = new Gerente();
    thamiris.setSalario(5000);
    System.out.println(thamiris.getBonificacao());
  }
}
