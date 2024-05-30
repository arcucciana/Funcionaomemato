package entidades;

public abstract class Producto implements IProducto{

	private int precio;

	public Producto(int precio) {
		super();
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [precio=" + precio + "]";
	}
	
}
