package Entidades;

import java.util.Date;

public class Cancion extends Artista {
	private String nombre;
	private int duracion;
	private Date fechaEstreno;
	
	
	public Cancion(String nombreArtista, String nombre, int duracion, Date fechaEstreno) {
		super(nombreArtista);
		this.nombre = nombre;
		this.duracion = duracion;
		this.fechaEstreno = fechaEstreno;
	}
	
	
	public Cancion() {
		super();
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public Date getFechaEstreno() {
		return fechaEstreno;
	}
	public void setFechaEstreno(Date fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}


	@Override
	public String toString() {
		return "El nombre " + nombre + ", su duracion " + duracion + "y su fechaEstreno " + fechaEstreno ;
	}
	
	
}
