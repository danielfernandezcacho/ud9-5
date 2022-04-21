package Padre;

import java.util.Random;

public abstract class Persona {
	
	// Atributos
	protected String nombre;
	protected int edad;
	protected char sexo;
	protected boolean falta;
	
	// Getters setters
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
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public boolean isFalta() {
		return falta;
	}
	public void setFalta(boolean falta) {
		this.falta = falta;
	}
	
	// Constructores
	public Persona () {
		this.sexo = generarSexo();
		if (sexo == 'H') {
			this.nombre = nombreMasculino();
		}
		else {
			this.nombre = nombreFemenino();
		}
	}
	
	// Metodos
	public abstract boolean ausencia();
	public abstract int edad();
	
	// Para generar el sexo random
	private char generarSexo() {
		Random rnd = new Random();
		char[] sex = {'H', 'M'}; // Array para randomizar el sexo
		
		return sex[(int) (rnd.nextDouble() * sex.length)];
	}
	
	// Para generar nombres masculinos random
	public String nombreMasculino () {
		Random rnd = new Random();
		String[] hombre = {"Jose", "Antonio", "Jesus", "Sergio", "Aitor"};
		
		return hombre[(int) (rnd.nextDouble() * hombre.length)];
	}
	// Para generar nombres femeninos random
	public String nombreFemenino () {
		Random rnd = new Random();
		String[] mujer = {"Maria", "Paula", "Cristina", "Sara", "Mireia"};
		
		return mujer[(int) (rnd.nextDouble() * mujer.length)];
	}
}