public class CriarConta {
  public static void main(String[] args) {
    Conta contaDoLuiz = new Conta(1336, 9421);
  
    contaDoLuiz.deposita(3500.00);

    System.out.println("Saldo atual: " + contaDoLuiz.saldo());
    
    contaDoLuiz.deposita(3500.00);

    System.out.println("Saldo atual: " + contaDoLuiz.saldo());

    contaDoLuiz.saca(4700.00);

    System.out.println("Saldo atual: " + contaDoLuiz.saldo());
    
    
    Conta contaDaBrunna = new Conta(1337, 9422);
    
    contaDaBrunna.deposita(7000.00);

    System.out.println("Saldo do Luiz atual: " + contaDoLuiz.saldo());
    System.out.println("Saldo da Brunna atual: " + contaDaBrunna.saldo());

    contaDaBrunna.transfere(500, contaDoLuiz);

  
    System.out.println("Saldo do Luiz atual: " + contaDoLuiz.saldo());
    System.out.println("Saldo da Brunna atual: " + contaDaBrunna.saldo());

    Cliente luiz = new Cliente();
    luiz.setNome("Luiz");
    luiz.setCpf("222.222.222-44");;
    luiz.setProfissao("programador");

    contaDoLuiz.setTitular(luiz);

    System.out.println("Conta do " +contaDoLuiz.getTitular().getNome() + " profissão: " + contaDoLuiz.getTitular().getProfissao());

    contaDoLuiz.getTitular().setProfissao("Pedreiro de software");

    System.out.println("Conta do " +contaDoLuiz.getTitular().getNome() + " profissão: " + contaDoLuiz.getTitular().getProfissao());

    System.out.println("Total de contas aberta: " + Conta.getTotal());
  }
}
