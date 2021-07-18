package Clases;

public abstract class Persona {
	
//	Atributos	
	protected String nombre;
	
	protected int edad;
	
	protected String sexo;
	
	
//	Constructor principal
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}


//	Método para controlar asistencia
	public abstract boolean asistencia();


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
	
	

	}
