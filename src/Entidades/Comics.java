package entidades;

import java.util.Date;

public class Comics extends Libros{
	private String personajes;

	public Comics(int precio, Date fechaDePublicacion, String autor, String titulo, String editorial,
			String personajes) {
		super(precio, fechaDePublicacion, autor, titulo, editorial);
		this.personajes = personajes;
	}

	public String getPersonajes() {
		return personajes;
	}

	public void setPersonajes(String personajes) {
		this.personajes = personajes;
	}

	@Override
	public String toString() {
		return super.toString()+ "Comics [personajes=" + personajes + "]";
	}
	
}
