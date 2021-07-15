package Proyecto1;

import java.util.ArrayList;

public class Alumno {
	
	// Atributos
	private String nombre;
	private ArrayList<Double> notas;
	private Double notaMedia = 0.0;
	
	
	// Constructores
	// Crea alumno ficticio
	public Alumno() {
		this("alumno", new ArrayList<Double>());
	}
	// Crea alumno con nombre aun sin notas
	public Alumno (String nombre) {
		this(nombre, new ArrayList<Double>());
	}
	// Crea alumno del que ya se tienen notas
	public Alumno (String nombre, ArrayList<Double> notas) {
		this.nombre = nombre;
		this.notas = notas;
	}
	
	// Getters and setters
	public String getNombre() {
		return nombre;
	}

	public ArrayList<Double> getNotas() {
		return notas;
	}

	// Metodo para añadir una nueva nota al alumno
	public void addNota(Double nota) {
		this.getNotas().add(nota);
	}
	
	public Double getNotaMedia() {
		return notaMedia;
	}
	
	//Métodos
	/**
	 * Calcula la nota media a partir de la lista de notas del alumno
	 * Asigna el valor calculado al atributo notaMedia de alumno y lo retorna
	 * @return Nota media del alumno
	 */
	public Double notaMedia () {
		double sumaNotas = 0;
		int nNotas = 0;
		
		for (Double nota: getNotas()) {
			sumaNotas += nota;
			nNotas++;
		}
		return sumaNotas/nNotas;
	}
}
