package entidades;

public class Electronico extends Producto {

	private String fabricante;


	public Electronico(int precio, String fabricante) {
		super(precio);
		this.fabricante = fabricante;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public double getPrecioVenta() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return super.toString()+ "Electronico [fabricante=" + fabricante + "]";
	}
	
}
