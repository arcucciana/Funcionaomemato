package Entidades;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Recital extends Cancion implements IRecital{
	
	List <Cancion> lineUp = new LinkedList <Cancion>();

	 List <Oyente> oyentes  = new LinkedList <Oyente>();

	 
	public Recital(List<Cancion> lineUp,List<Oyente> oyentes) {
		this.lineUp = lineUp;
		this.oyentes = oyentes;
	}

	public int buscarOyentes(String nombre){
		int asiento=0;
		for(Oyente cliente:oyentes) {
			if (cliente.getNombre().equals(nombre)){
				asiento= cliente.getAsiento();
				
			}
		}
		return asiento;
		
	}
	
	public List<Oyente> getOyentes() {
		return oyentes;
	}

	public void setOyentes(List<Oyente> oyentes) {
		this.oyentes = oyentes;
	}
	
	public void agragameCancion  (Cancion nuevaCan) {
		lineUp.add(nuevaCan);
		
	}
	
	public void eliminarOyente (Oyente o) {
				oyentes.remove(o);

	}
	public Recital(String nombreArtista, String nombre, int duracion, Date fechaEstreno, List<Cancion> lineUp) {
		super(nombreArtista, nombre, duracion, fechaEstreno);
		this.lineUp = lineUp;
	}

	public Recital() {
		super();
	}
	public List<Cancion> getLineUp() {
		return lineUp;
	}
	public void setLineUp(List<Cancion> lineUp) {
		this.lineUp = lineUp;
	}

	
}
