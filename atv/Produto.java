package atv;
public class Produto {
    
    String nome;
    double preço;
    int quantidade;

public Produto(String nome, double preço, int quantidade){
    this.nome = nome;
    this.preço = preço;
    this. quantidade = quantidade;
}
public void vender(){
    System.out.println("Produto vendido: "+ nome);
}
public void mostraPreço(){
    System.out.println("Preço: " + preço);
}
}
