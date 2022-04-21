package Clases;

import java.util.Random;

public class Aula {

	// Atributos
	private int id;
	private Profesor profe;
	private Estudiante[] est;
	private String materia;
	
	// Constante
	private final int NUM_MAX = 30;
	
	// Getters setters
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
	
	// Constructores
	public Aula () {
		this.id = 1;
		this.profe = new Profesor();
		this.est = new Estudiante[NUM_MAX];
		generarEstudiante();
		this.materia = generarMateria();
	}
	
	@Override
	public String toString() {
		return "Aula [id=" + id + ", materia=" + materia + "]";
	}
	
	// Para generar alumos
	private void generarEstudiante() {
		int i;
		for (i = 0; i < est.length; i++) {
			est[i] = new Estudiante();
		}
	}
	
	// Genero su materia random
	private String generarMateria() {
		Random rnd = new Random();
		// Un array donde estan las materias disponibles
		String[] nombreMateria = {"Matematicas", "Filosofia", "Fisica"};
		// Genero un numero random en funcion del array
		return nombreMateria[(int) (rnd.nextDouble() * nombreMateria.length)];
	}
	
	// Para contar cuantos alumnos faltan
	private boolean faltaAlumnos() {
		int cont = 0, i;
		
		for (i = 0; i < est.length; i++) {
			if (est[i].isFalta()) {
				cont++;
			}
		}
		System.out.println("Faltan " + cont + " alumnos");
		// True falta la mitad o mas, false no, por lo que se podra dar clase
		return cont >= ((int) (est.length / 2)); // Su taño entre 2 para saver si falta la mitad de la clase
	}
	
	// Para decir si se puede dar clase o no
	public boolean darClase() {
		boolean sePuede = true;
		
		if (profe.isFalta()) {
			System.out.println("El profe falta");
			sePuede = false;
		}
		else if (!profe.getMateria().equals(materia)) {
			System.out.println("Las materias del profesor y de el aula no son la misma");
			sePuede = false;
		}
		else if (faltaAlumnos()) {
			System.out.println("Falta mas del 50% de los alumnos");
			sePuede = false;
		}
		
		return sePuede;
	}
}