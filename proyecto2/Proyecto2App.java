package proyecto2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Proyecto2App {

	public static void main(String[] args) {
		
		// Creado carrito de la compra
		ArrayList<Producto> carrito = new ArrayList<>();
		
		// Se añaden algunos productos al carrito
		carrito.add(new Producto("Leche", 4, 5, 1.5));
		carrito.add(new Producto("Cocacola", 21, 2, 3));
		carrito.add(new Producto());
		
		// Muestra los articulos comprados
		int counter = 1;
		System.out.println("==================================================");
		for (Producto p : carrito) {
			System.out.println("Producto " + counter + p.toString());
			counter++;
		}
		
		// Muestra el total a pagar
		double aPagar = 0;
		for (Producto p : carrito) {
			aPagar += p.calcularPrecio();
		}
		System.out.println("==================================================");
		System.out.println("La factura asciende a " + aPagar + " €");
		// Pide cuanto va a pagar el cliente
		String pagoInput = JOptionPane.showInputDialog("Introduce el dinero: ");
		double pago = Double.parseDouble(pagoInput);
		
		// Retorna el cambio
		System.out.println("Has pagado " + pago + " €");
		System.out.println("El cambio es:" + (pago-aPagar) + " €");
	}

}
