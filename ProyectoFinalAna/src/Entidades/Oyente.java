package Entidades;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Oyente extends Persona {
	//private List<Oyente> oyentes = new ArrayList<Oyente>();
	private int precioEntradas;
	private int asiento;
	private int cantidadRecitales;
	
	public Oyente(String nombre, String apellido, int edad, int precioEntradas, int asiento,
			int cantidadRecitales) {
		super(nombre, apellido, edad);
		//this.oyentes = oyentes;
		this.precioEntradas = precioEntradas;
		this.asiento = asiento;
		this.cantidadRecitales = cantidadRecitales;
	}

	public Oyente() {
		super();
	}

	public int getPrecioEntradas() {
		return precioEntradas;
	}
	public void setPrecioEntradas(int precioEntradas) {
		this.precioEntradas = precioEntradas;
	}
	public int getAsiento() {
		return asiento;
	}
	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	public int getCantidadRecitales() {
		return cantidadRecitales;
	}
	public void setCantidadRecitales(int cantidadRecitales) {
		this.cantidadRecitales = cantidadRecitales;
	}
	
	/*public void eliminarOyente (int asiento1) {
		for (Oyente cliente:oyentes) {
			if (cliente.getAsiento()== asiento1) {
			oyentes.remove(cliente);
			}
		}
	}*/
	
	public void AvisoDesc() {
		if (this.cantidadRecitales <=2) {
            JOptionPane.showMessageDialog(null, "Para adquirir el descuento tiene que haber asistido a 3 o mas recitales. Por el momento usted cuenta con un total de "+this.cantidadRecitales);

		}
		else {
            JOptionPane.showMessageDialog(null, this.getNombre()+ " tiene un descuento por la cantidad de recitales a los que asistio. Estos siendo un total de "+this.cantidadRecitales);

		}
	}

}
