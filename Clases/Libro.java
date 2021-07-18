package Clases;

public class Libro {

//	Atributos
	protected String isbn;
	
	protected String titulo;
	
	protected String autor;
	
	protected int numPaginas;

	public Libro(String isbn, String titulo, String autor, int numPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "El libro "+titulo+" con ISBN "+isbn+" creado por "+autor+" tiene un total de "+numPaginas+" paginas";
	}
	
	public void masPaginas(Libro libro) {
		if(numPaginas>libro.getNumPaginas()) {
			System.out.println(titulo+" ("+numPaginas+") tiene más páginas que "+libro.getTitulo()+" ("+libro.getNumPaginas()+")");
		} else {
			System.out.println(libro.getTitulo()+" ("+libro.getNumPaginas()+") tiene más páginas que "+titulo+" ("+numPaginas+")");
		}
	}
	
	
}
