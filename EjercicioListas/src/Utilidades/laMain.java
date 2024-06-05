package Utilidades;

import java.util.LinkedList;
import java.util.List;

import Entidades.persona;

public class laMain {
	
	public static double promedioEdades(List<persona> listita) {
        int totalEdades = 0;
        for (persona personas : listita) {
            totalEdades += personas.getEdad();
        }
        return (double) totalEdades / listita.size();}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <persona> listalinked = new LinkedList <persona>();
		listalinked.add(new persona("Ana","Arcucci","femenino",20));
		listalinked.add(new persona("Cele","Melez","femenino",22));
		listalinked.add(new persona("Rauti","Lojas","masculino",25));
		listalinked.add(new persona("Fede","DAT","masculino",21));
		listalinked.add(new persona("Juan","Ma","masculino",21));
		

		for (int i=0; i<listalinked.size();i++) {
			System.out.println("El nombre completo de la persona es "+ listalinked.get(i).getNombre() + " "+listalinked.get(i).getApellido()+ " y pertenece al genero "+ listalinked.get(i).getGenero());
		}
		//persona[] personasArray = listalinked.toArray(new persona[0]);
		double promedio = promedioEdades(listalinked);
		int totalMacs = contarM(listalinked);
		int totalFem= contarF(listalinked);
		
		
		System.out.println("El promedio del total de las edades es de "+ promedio);
		System.out.println("El total de personas del genero masculino es de "+totalMacs);
		System.out.println("El total de personas del genero femenino es de "+ totalFem);


	}
	public static int contarM (List <persona> machos) {
        int cont = 0;
        for (persona persona1: machos){
           
        	if (persona1.getGenero().equals("masculino")) {
        		cont++;
        	}
        	
        }
        return cont;}
	public static int contarF (List<persona>fem) {
        int cont = 0;
      for (persona persona1: fem){
            if (persona1.getGenero().equals ("femenino"));
                cont++;
            }
        
        return cont;}
	
	}



