package entidades;

public class iPhone extends Electronico{

	
	private String modelo;
	private String color;
	
	public iPhone(int precio, String fabricante, String modelo, String color) {
		super(precio, fabricante);
		this.modelo = modelo;
		this.color = color;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return super.toString()+"iPhone [modelo=" + modelo + ", color=" + color + "]";
	}
	
	
}
