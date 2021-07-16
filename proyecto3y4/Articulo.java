package proyecto3y4;

public class Articulo {
	
	// Atributos
	private String nombre;
	private int cantidad;
	private double precio;
	
	// Constructores
	public Articulo() {
		this("random", 1, 0);
	}
	public Articulo(String nombre, int cantidad, double precio) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	// Getters & setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre.toLowerCase();
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	// Metodos
	@Override
	public String toString() {
		return "Articulo [nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	
}
