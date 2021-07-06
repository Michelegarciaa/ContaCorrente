class Teste {
  public static void main(String[] args) {
    
  ContaCorrente c1 = new ContaCorrente(073, "Bradesco", "Michele");
  System.out.println("Criando uma conta...");
  System.out.println("Conta de " + c1.getNomeCliente());
  System.out.println("Obtendo saldo da conta..." + c1.getSaldo());
  System.out.println("Depositando na conta 1000");
  c1.setDeposito(1000);
  c1.depositar(c1.getDeposito());
  System.out.println("Obtendo saldo da conta..." + c1.getSaldo());
  System.out.println("Sacando da conta...");
  c1.setSaque(500);
  c1.sacar(c1.getSaque());
  System.out.println("Obtendo saldo da conta..." + c1.getSaldo());
    
    
  }
}