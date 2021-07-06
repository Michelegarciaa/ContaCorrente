public  class  ContaCorrente {
 private int numeroConta;
 private String nomeBanco;
 private String nomeCliente; 
 private float saldo;
 private float deposito;
 private float saque;
  
  public ContaCorrente(){
    
  }
  
  public ContaCorrente(int numeroConta, String nomeBanco, String nomeCliente){
   this.numeroConta = numeroConta;
   this.nomeBanco = nomeBanco;
   this.nomeCliente = nomeCliente;
  }
  
 public String getNomeCliente(){
   return nomeCliente;
 }
 
  public void setNomeCliente(String nomeCliente){
   this.nomeCliente = nomeCliente;
  }
  
  public String getNomeBanco(){
    return nomeBanco;
  }
  
  public void setNomeBanco(String nomeBanco){
   this.nomeBanco = nomeBanco;
  }
  
  public int getNumeroConta(){
    return numeroConta;
  }
  
  public void SetNumeroConta(int numeroConta){
   this.numeroConta = numeroConta;
  }
  
  public float getDeposito(){
    return deposito;
  }
  
  public void setDeposito(float deposito){
    this.deposito = deposito;
  }
  
  public float getSaque(){
    return saque;
  }
  public void setSaque(float saque){
    this.saque = saque;
  }

  public void depositar(float valor){
   if(valor>0){
    this.saldo = saldo + valor;
    }
  }
 
  public void sacar(float valor){
   if(saldo >= valor){
     saldo = saldo - valor;
   }
  }
  
  public float getSaldo(){
    return saldo;
  }
  
  public void setSaldo(float saldo){
    this.saldo = saldo;
  }
  
  
  
}