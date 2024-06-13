package Utilidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Entidades.Cancion;
import Entidades.Oyente;
import Entidades.Recital;

public class LeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese que artista es ");
		String nombreArtista = scanner.nextLine();
		
		List<Cancion> songs = new LinkedList<Cancion>();

		int i = 0;
		while (i < 2) {
			System.out.println("Ingrese el nombre de la cancion: ");
			String nombre = scanner.nextLine();
			Cancion cancion1 = new Cancion(nombreArtista, nombre, 3, new Date());
			songs.add(cancion1);
			i++;
		}
		

		int j = 0;
		List<Oyente> oyentes = new ArrayList<Oyente>();

		while (j < 3) {
			System.out.println("                           ");
			System.out.println("Ingrese el nombre del oyente: ");
			String nombreO = scanner.nextLine();
			System.out.println("Ingrese el apellido del oyente: ");
			String apellidoO = scanner.nextLine();
			System.out.println("Ingrese el numero de su asiento: ");
			int asiento = scanner.nextInt();
			 scanner.nextLine(); 
			System.out.println("Ingrese la cantidad de recitales a los que ha asistido: ");
			int cantidadRecitales = scanner.nextInt();
			 scanner.nextLine(); 
			Oyente oyente1 = new Oyente( nombreO, apellidoO, 19, 12000, asiento, cantidadRecitales );
			oyentes.add(oyente1);
			for (Oyente o : oyentes) {
			o.AvisoDesc();
			}
			j++;	
			}
		Recital recital1 = new Recital(songs, oyentes);
		System.out.println("Las canciones registradas son: ");
		for (Cancion c: songs ) {
			System.out.println(c.toString());
		}
		System.out.println("¿Quiere agregar mas cancion? (SI/NO) ");
		String AgCan = scanner.nextLine();
		if (AgCan.equals("SI")) {
			System.out.println("Ingrese el nombre de la nueva cancion: ");
			String nuevaCan=scanner.nextLine();
			Cancion cancion2= new Cancion(nombreArtista, nuevaCan, 3, new Date());

			recital1.agragameCancion(cancion2);
			System.out.println("Entonces, el listado de canciones registradas es: ");
			for (Cancion nuevas: songs) {
				System.out.println(nuevas.toString());
			}
			
		}
		
		
		System.out.println("Los oyentes registrados son: ");
		for (Oyente o : oyentes) {
			System.out.println(" " +o.getNombre());
			}
		System.out.println("Desea eliminar uno de los oyentes.");
		System.out.println("Escriba SI/NO: ") ;
		String confnombre = scanner.nextLine();
		if (confnombre.equals("SI") ){
		System.out.println("Ingrese el nombre del oyente: ");
		String nombreabuscar = scanner.nextLine();
		int asientoAEliminar = recital1.buscarOyentes(nombreabuscar);
		Oyente oyenteAELiminar= new Oyente();
		for(Oyente o:oyentes) {
			if(o.getAsiento() == asientoAEliminar) {
				 oyenteAELiminar = o;
			}
		}
		recital1.eliminarOyente(oyenteAELiminar);
					System.out.println("Ahora los oyentes registrados son:  ");

		for (Oyente o : oyentes) {
		System.out.println(o.getNombre());
			}
		scanner.close();
	}
	}
}

