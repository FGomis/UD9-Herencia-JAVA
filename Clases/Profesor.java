package Clases;

public class Profesor extends Persona{
	
//	Atributos
	protected String materia;
	
	protected boolean asistencia;
	
	
//	Constructor principal
	public Profesor(String nombre, int edad, String sexo, String materia) {
		super(nombre, edad, sexo);
		this.materia = materia;
		this.asistencia = asistencia();
	}


//	Método heredado de la clase abstracta para controlar asistencia
	@Override
	public boolean asistencia() {
		double n = (Math.random())*100;
		if(n > 20) {
			this.asistencia = true;
			return true;
		} else {
			this.asistencia = false;
			return false;
		}
	}


//	Método toString
	@Override
	public String toString() {
		return "Materia: " + materia + ", Nombre: " + nombre + ", Edad: " + edad + " Asistencia: " + asistencia;
	}


//	Getters y setters
	public String getMateria() {
		return materia;
	}



	public void setMateria(String materia) {
		this.materia = materia;
	}



	public boolean isAsistencia() {
		return asistencia;
	}



	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}
	
	

}
