package atv;
public class Computador {

    String marca;
    String processador;
    int memoria;

public Computador(String marca, String processador, int memoria){
    this.marca = marca;
    this.processador = processador;
    this.memoria = memoria;
}
public void ligar(){
    System.out.println("Computador esta ligado");
}
public void desligar(){
    System.out.println("Computador está desligado");
}
}