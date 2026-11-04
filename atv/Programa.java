package atv;
public class Programa {

    public static void main(String[] args) {
    
    Pessoa pessoa = new Pessoa("Creuza", 15, " 45782133952", " creuzinhadograu77@gmial.com");

    Aluno aluno = new Aluno("Vorcaro", 25297, 7.6);

    Animal animal = new Animal("Ornitorrinco", 20,  " Ornithorhynchus anatinus");

    Carro carro = new Carro("Honda", 2018, " fit");

    Celular celular = new Celular("Xiaomi", " POCO", 75);

    Computador computador = new Computador("Dell", " Intel 8", 128);

    ContaBancaria contaBancaria = new ContaBancaria("Pedro", 4587, 875);

    Livro livro = new Livro("Como ligar o botão do FODA-SE", 100, " Matheus");

    Produto produto = new Produto("Caderno", 12.5, 5);

    Professor professor = new Professor("Daniel", 4.500, " Algoritmo e Programação");

    pessoa.andar();
    carro.acelarar();
    animal.comer();
    produto.mostraPreço();
    aluno.estudar();
    professor.ensinar();
    contaBancaria.consultarSaldo();
    livro.ler();
    celular.ligar();
    computador.ligar();
 }
}