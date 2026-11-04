package atv;
public class Livro {
   
    String titulo;
    int paginas;
    String autor;

public Livro(String titulo, int paginas, String autor){
    this.titulo = titulo;
    this.paginas = paginas;
    this.autor = autor; 
}
public void ler(){
    System.out.println("Lendo o livro" + titulo);
}
public void mostraAutor(){
    System.out.println("Autor: " + autor);
}
}

