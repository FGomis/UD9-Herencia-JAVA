package Clases;

public class Pelicula {

//	Atributos
	protected String titulo;
	
	protected int duracion;
	
	protected int edadMin;
	
	protected String director;

//	Constructor principal
	public Pelicula(String titulo, int duracion, int edadMin, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMin = edadMin;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEdadMin() {
		return edadMin;
	}

	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return titulo + " Duración:" + duracion + " Edad mínima: " + edadMin + " Director: "+ director+"\n";
	}
	
	
}
