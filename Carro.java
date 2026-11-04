package atv;
public class Carro {

    String marca;
    int ano;
    String modelo;

public Carro(String marca, int ano, String modelo){
    this.ano = ano;
    this.modelo = modelo;
    this.marca = marca;
}
public void acelarar(){
System.out.println("O carro está acelerando");
}
public void freae(){
System.out.println("O carro está freando");
}
}
