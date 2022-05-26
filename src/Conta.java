public class Conta {
  private double saldo = 0;
  private int agencia;
  private int numero;
  private Cliente titular;

  private static int total;

  public Conta(int agencia, int numero) {
    total++;
    if(agencia<=0 || numero <=0) return;
    this.agencia = agencia;
    this.numero = numero;
  }

  public double saldo() {
    return this.saldo;
  }

  public void deposita(double valor) {
    if(valor > 0) {
      this.saldo += valor;
    } else {
      System.out.println("Error: Valor inválido para deposito " + valor);
    }
  }

  public void saca(double valor) {
    if(valor > saldo && valor > 0) {
      System.out.println("Error: Saldo inválid, seu saldo atual " + this.saldo);
    } else {
      this.saldo -= valor;
    }
  }

  public boolean transfere(double valor, Conta destino) {
    if(valor > 0 && this.saldo > valor) {
      this.saldo -= valor;
      destino.deposita(valor);
      return true;
    }
    return false;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getAgencia() {
    return this.agencia;
  }

  public void setAgencia(int agencia) {
    this.agencia = agencia;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public Cliente getTitular() {
    return titular;
  }

  public static int getTotal() {
    return total;
  }
}