package Clases;

import java.util.Random;

import Padre.Persona;

public class Estudiante extends Persona {

	// Atributos
	private int nota;

	// Getters setters
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	// Constructores
	public Estudiante () {
		super();
		this.edad = edad();
		this.nota = nota();
		this.falta = ausencia();
	}

	@Override
	public String toString() {
		return "Estudiante [nota=" + nota + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", falta="
				+ falta + "]";
	}

	// Metodos
	public boolean ausencia() {
		Random rnd = new Random();
		boolean falta = false;
		
		// Genero un num random del 1 al 10, si es mas grande de 5 falta, si es mas pequeño no (50% de posibilidades)
		if ((int) (rnd.nextDouble() * 10 + 1) > 5) {
			falta = true;
		}
		
		return falta;
	}
	// Genero la nota random
	public int nota () {
		Random rnd = new Random();
		return (int) (rnd.nextDouble() * 11); // de 0 a 10
	}
	// Genero su edad random
	public int edad() {
		Random rnd = new Random();
		return (int) (rnd.nextDouble() * 5 + 12);
	}

}