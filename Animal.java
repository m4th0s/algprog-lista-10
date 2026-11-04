package atv;
public class Animal {
    
    String nome;
    int idade;
    String especie;

public Animal(String nome, int idade, String especie){
    this.idade = idade;
    this.nome = nome;
    this.especie = especie;
}
public void comer(){
System.out.println(nome + "está comendo");
}
public void dormir(){
System.out.println(nome + " está dormindo");
}
}
