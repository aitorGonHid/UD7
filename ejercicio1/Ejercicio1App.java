import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

import Proyecto1.Alumno;

public class Ejercicio1App {

	public static void main(String[] args) {
		
		// Se crea una diccionario de datos donde se guardaran los alumnos y su media de notas
		HashMap <String, Double> notasAlumnos = new HashMap<>();
		// Patron para formatear a 2 decimales de las notas
		DecimalFormat df = new DecimalFormat("#.##");
		
		// Se pide crear un alumno
		Alumno alum1 = new Alumno("Aitor");
		// Se pide introducir las notas del alumno
		pedirNotas(alum1);
		
		// Se crea un segundo alumno
		Alumno alum2 = new Alumno("Aleatorio");
		// Se les añade valores aleatorios a sus notas
		for (int i = 0; i < 10; i++) {
			Double nota = (Math.random() * 10);
			alum2.addNota(nota);
		}
		
		// Se guardan las notas medias de los dos alumnos
		guardarMedia(alum1, notasAlumnos);
		guardarMedia(alum2, notasAlumnos);
		
		// Se muestra el contenido del diccionario de datos
		System.out.println("######  NOTAS  ######");
		System.out.println("El alumno 1:");
		System.out.println("Aitor: "+ df.format(notasAlumnos.get("Aitor")));
		System.out.println("El alumno 2:");
		System.out.println("Aleatorio: " + df.format(notasAlumnos.get("Aleatorio")));
		


	}
	
	/**
	 *  Guarda la nota media de un alumno en un diccionario de datos
	 * @param alumno - Objeto de la clase alumno con un campo notas que contiene su lista de notas
	 * @param expediente -  Diccionario de datos donde se almacenarán las notas medias de los alumnos
	 */
	public static void guardarMedia (Alumno alumno, HashMap<String, Double> expediente) {
		
		//calcula la nota media y la asigna a la variable nota
		double media = alumno.notaMedia();
		// Guarda el valor de media en la lista
		expediente.put(alumno.getNombre(), media);
		
	}
	
	public static void pedirNotas (Alumno alum) {
		boolean pedir = true;
		
		while (pedir) {
			String respuesta = JOptionPane.showInputDialog("Introduce una nota entre 0 y 10:\n"
					+ " (introduce valor invalido para no añadir mas)");
			double nota = Double.parseDouble(respuesta);
			if (nota < 0 || nota > 10) pedir = false;
			else alum.addNota(nota);	
			}
			
		}
}
