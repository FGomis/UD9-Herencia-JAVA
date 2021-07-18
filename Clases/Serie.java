package Clases;

public class Serie implements Entregable{
//	Constantes
	protected int NUMTEMPORADAS = 3;
	
	protected boolean ENTREGADO = false;
	
//	Atributos
	protected String titulo;
	
	protected int numTemporadas;
	
	protected boolean entregado;
	
	protected String genero;
	
	protected String creador;

//	Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.numTemporadas = NUMTEMPORADAS;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = "";
	}
	
//	Constructor con título y creador como atributos pasados
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemporadas = NUMTEMPORADAS;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = creador;
	}
	
//	Constructor al que le pasamos todos los atributos menos entregado
	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

//	Getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	//	Método toString
	@Override
	public String toString() {
		return "[titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}

	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public void devolver() {
		this.entregado = false;
	}
	
	@Override
	public boolean isEntregado() {
		return entregado;
	}

	@Override
	public Object compareTo(Object serie) {
		Object output;
		if(this.numTemporadas > ((Serie) serie).numTemporadas) {
			output = this;
		} else {
			output = serie;
		}
		return (Serie) output;
	}
}
