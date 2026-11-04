package atv;
public class Celular {
    
    String marca;
    String modelo;
    int bateria;

public Celular(String marca, String modelo, int bateria){
    this.marca = marca;
    this.modelo = modelo;
    this.bateria  = bateria;
}
public void ligar(){
    System.out.println("Estou em ligado");
}
public void fazerLigação(){
    System.out.println("Estou fazendo uma ligação");
}
}
