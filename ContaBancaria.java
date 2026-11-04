package atv;
public class ContaBancaria {
    
    String titular;
    int numero;
    double saldo;
    double valor;

public ContaBancaria(String titualr, int numero, double saldo){
    this.titular = titualr;
    this.numero = numero;
    this.saldo = saldo;
}
public void depositar(){
    saldo = saldo + valor;
}
public  void consultarSaldo(){
    System.out.println("Saldo:" + saldo);
}
}
