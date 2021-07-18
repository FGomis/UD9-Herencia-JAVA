package Clases;

public class Videojuego implements Entregable{
	
//	Constantes	
	protected final int HORASESTIMADAS = 10;
	
	protected final boolean ENTREGADO = false;
	
//	Atributos
	protected String titulo;
	
	protected int horasEstimadas;
	
	protected boolean entregado;
	
	protected String genero;
	
	protected String compañia;

//	Constructor principal
	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = HORASESTIMADAS;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.compañia = "";
	}

//	Constructor con atributos titulo y horas estimadas
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.compañia = "";
	}

//	Constructor con todos los atributos excepto entregado
	public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
	}
	
	
//	Getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	//	Método toString
	@Override
	public String toString() {
		return "[titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia + "]";
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
	public Object compareTo(Object videojuego) {
		Object output;
		if(this.horasEstimadas > ((Videojuego) videojuego).horasEstimadas) {
			output = this;
		} else {
			output = videojuego;
		}
		return output;
		
	}
	
	
}
