package atv;
public class Aluno {
    
    String nome;
    int matricula;
    double nota;

public Aluno(String nome, int matricula, double nota){
    this.nome = nome;
    this.matricula = matricula;
    this.nota = nota;
}
public void estudar(){
    System.out.println(nome + " está estudando.");
}
public void mostraNota(){
    System.out.println("Nota: " + nota);
}
}
