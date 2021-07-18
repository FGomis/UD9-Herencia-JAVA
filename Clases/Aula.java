package Clases;

import java.util.Arrays;

public class Aula {
	
//	Atributos
	protected int id;
	
	protected String materia;
	
	protected int aforo;
	
	protected Profesor profesor;
	
	protected Alumno[] alumnos;

//	Constructor principal
	public Aula(int id, String materia, int aforo, Profesor profesor, Alumno[] alumnos) {
		this.id = id;
		this.materia = materia;
		this.aforo = aforo;
		this.profesor = profesor;
		this.alumnos = alumnos;
	}
	
//	Método para comprobar la disponibilidad del aula para hacer clase
	public boolean comprobarDisponibilidad() {
		int presentes = 0;
//		Contamos cuantos alumnos no han hecho novillos
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i].isAsistencia()) {
				presentes++;
			}
		}
		
//		Comprobamos que el profesor asista, que la matéria del profesor sea la misma que la del aula
//		y que haya más del 50% de alumnos presentes, de no ser el caso el aula no está disponible
		if(!this.profesor.isAsistencia() || !this.materia.equals(this.profesor.getMateria()) || presentes < (this.aforo/2)) {
			return false;
		} else {
			return true;
		}
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	@Override
	public String toString() {
		return "Aula " + id + ":\n"
				+ "Materia: " + materia + "\tAforo: " + aforo + "\tProfesor: " + profesor + "\nAlumnos: "
				+ "\n-----------------------------"
				+ Arrays.toString(alumnos);
	}
	
	

}
