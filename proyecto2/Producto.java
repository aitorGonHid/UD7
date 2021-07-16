package proyecto2;

public class Producto {
	
	public final double IVA_4 = 0.04;
	public final double IVA_21 = 0.21;
	
	//Atributos
	String nombre;
	double iva = IVA_21;
	int cantidad;
	double precio;
	
	//Constructores
	public Producto () {
		this("producto", 21, 1, 10);	
	}
	
	public Producto (String nombre, int iva, int cantidad, double precio) {
		this.nombre = nombre;
		this.iva = setIva(iva);
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	//Getters & setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getIva() {
		return iva;
	}

	//devuelve el valor del iva como double
	public double setIva(int iva) {
		if (iva == 4) return IVA_4;
		else return IVA_21;
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
	// Calcula el precio del producto segun las unidades y el iva
	public double calcularPrecio() {
		double precioFinal = (getPrecio()*(1+getIva())*getCantidad());
		return precioFinal;
	}

	@Override
	public String toString() {
		return " [nombre=" + nombre + ", iva=" + iva*100 + ", cantidad=" + cantidad + ", precio sin iva=" + precio + ", precio con iva=" + precio *(getIva()+1) + "]";
	}
	
}
