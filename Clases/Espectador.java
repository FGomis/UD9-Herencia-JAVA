package Clases;

import java.text.DecimalFormat;

public class Espectador {

//	Atributos
	protected String nombre;
	
	protected int edad;
	
	protected double dinero;

//	Constructor principal
	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return "Nombre: " + nombre + " Edad: " + edad + " Dinero: " + df.format(dinero) + "\n";
	}
}
