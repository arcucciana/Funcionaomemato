package entidades;

import java.util.Date;

public class Libros extends Producto {
	private Date fechaDePublicacion;
	private String autor;
	private String titulo;
	private String editorial;
	
	public Libros(int precio, Date fechaDePublicacion, String autor, String titulo, String editorial) {
		super(precio);
		this.fechaDePublicacion = fechaDePublicacion;
		this.autor = autor;
		this.titulo = titulo;
		this.editorial = editorial;
	}

	public Date getFechaDePublicacion() {
		return fechaDePublicacion;
	}

	public void setFechaDePublicacion(Date fechaDePublicacion) {
		this.fechaDePublicacion = fechaDePublicacion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	@Override
	public double getPrecioVenta() {
		return 0;}
	

	@Override
	public String toString() {
		return super.toString()+"Libros [fechaDePublicacion=" + fechaDePublicacion + ", autor=" + autor + ", titulo=" + titulo
				+ ", editorial=" + editorial + "]";
	}
	
	

}
