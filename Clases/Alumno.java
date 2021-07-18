package Clases;

import java.text.DecimalFormat;

public class Alumno extends Persona{

//	Atributos
	protected double nota;
	
	protected boolean asistencia;
	
	
//	Constructor principal
	public Alumno(String nombre, int edad, String sexo, double nota) {
		super(nombre, edad, sexo);
		this.asistencia = asistencia();
		this.nota = nota;
	}



//	Método heredado de la clase abstracta para controlar asistencia
	@Override
	public boolean asistencia() {
		double n = (Math.random())*100;
		if(n < 50) {
			this.asistencia = true;
			return true;
		} else {
			this.asistencia = false;
			return false;
		}
	}



	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return "\nNombre: " + nombre + " Edad: " + edad + ", Asistencia: " + asistencia + " Nota: " + df.format(nota);
	}



	public boolean isAsistencia() {
		return asistencia;
	}



	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}
	
	

}
