package proyecto3y4;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import proyecto2.Producto;

public class Proyecto3App {

	public static void main(String[] args) {

		//Crea el diccionario de datos donde se añadiran los productos segun su nombre - precio
		HashMap<String, Double> almacen = new HashMap<>();
		// Llama al gestor del almacen
		gestionarAlmacen(almacen);
		
	}
	
	public static void gestionarAlmacen (HashMap <String, Double> almacen) {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("$$$$$$ ALMACEN $$$$$$$");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println();
		
		boolean exit = false;		
		while (!exit ) {
			// solicita accion
			String accion = JOptionPane.showInputDialog("Introduce accion :\n (AÑADIR prod. - ELIMINAR prod. - STOCK prod. - SALIR)");
			accion.toLowerCase();
			
			switch (accion) {
			case ("añadir"):
				// Crea un nuevo producto
				Producto prod = new Producto();
				// Setea campos del producto
				prod.setNombre(JOptionPane.showInputDialog("Nombre del producto: "));
				prod.setCantidad(Integer.parseInt(JOptionPane.showInputDialog("Introduce catidad: ")));
				prod.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Introduce precio: ")));
				// Lo añade al almacen
				almacen.put(prod.getNombre(), prod.getPrecio());
				break;
			case ("eliminar"):
				String nombre = JOptionPane.showInputDialog("Que producto quieres eliminar? ").toLowerCase();
				if (almacen.containsKey(nombre)) {
					almacen.remove(nombre);
					System.out.println("Producto eliminado con extio");
				} else {
					System.out.println("No existe el producto");
				}
				break;
			case ("stock"):
				for (Map.Entry<String, Double> entry : almacen.entrySet()) {
					System.out.println(entry.getKey()+" precio: "+entry.getValue());
				}
			break;
			default:
				System.out.println("Saliendo...");
				exit = true;
				break;
			}
		}
		
	}

}
