package Clases;

import java.util.Enumeration;
import java.util.Hashtable;

public class Cine {
	
//	Atributos
	protected Pelicula pelicula;
	
	protected double entrada;
	
	protected int filas;
	
	protected int columnas;
	
	protected Hashtable<String, Espectador> asientos;

//	Constructor principal
	public Cine(Pelicula pelicula, double entrada, int filas, int columnas, Hashtable<String, Espectador> asientos) {
		this.pelicula = pelicula;
		this.entrada = entrada;
		this.filas = filas;
		this.columnas = columnas;
		this.asientos = asientos;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public double getEntrada() {
		return entrada;
	}

	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	public Hashtable<String, Espectador> getAsientos() {
		return asientos;
	}

	public void setAsientos(Hashtable<String, Espectador> asientos) {
		this.asientos = asientos;
	}

	@Override
	public String toString() {
		String asientosOutput = asientosOutput();
		return "Cine\n Entrada:" + entrada + "€ Pelicula: " + pelicula + " Nº Asiento / Espectador\n" + asientosOutput;
	}
	
//	Método para formatar el output del hashtable que contiene los asientos + espectadores
	private String asientosOutput() {
		String output = "";
		Enumeration<String> keys = asientos.keys();
		Enumeration<Espectador> enumeration = asientos.elements();
		
		while (enumeration.hasMoreElements()) {
			output+="Asiento " + keys.nextElement() + "\nEspectador: " + enumeration.nextElement() + "\n";
		}
		
		return output;
	}
	
	

}
