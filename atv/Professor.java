package atv;
public class Professor {
    
    String nome;
    double salario;
    String disciplina;

public Professor(String nome, double salario, String disciplina){
    this.nome = nome;
    this.salario = salario;
    this.disciplina = disciplina;
}
public void ensinar(){
    System.out.println(nome + " está ensinando.");
}
public void corrigirProva(){
    System.out.println(nome + " está corrindo as provas");
}
}
