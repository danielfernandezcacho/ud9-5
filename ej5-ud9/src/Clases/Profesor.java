package Clases;

import java.util.Random;

import Padre.Persona;

public class Profesor extends Persona {

	// Atributos 
	private String materia;

	// Getters setters
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	// Constructores
	public Profesor () {
		this.edad = edad();
		this.materia = generarMateria();
		this.falta = ausencia();
	}

	@Override
	public String toString() {
		return "Profesor [materia=" + materia + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", falta="
				+ falta + "]";
	}
	
	// Metodos
	public boolean ausencia() {
		Random rnd = new Random();
		boolean falta = false;
		
		// Genero un num random del 1 al 10, si es mas grande de 8 falta, si es mas pequeño no (20% de posibilidades)
		if ((int) (rnd.nextDouble() * 10 + 1) > 8) {
			falta = true;
		}
		
		return falta;
	}
	// Genero su edad random
	public int edad() {
		Random rnd = new Random();
		return (int) (rnd.nextDouble() * 30 + 20); // De 20 a 50
	}
	// Genero su materia random
	private String generarMateria() {
		Random rnd = new Random();
		// Un array donde estan las materias disponibles
		String[] nombreMateria = {"Matematicas", "Filosofia", "Fisica"};
		// Genero un numero random en funcion del array
		return nombreMateria[(int) (rnd.nextDouble() * nombreMateria.length)];
	}
	
}