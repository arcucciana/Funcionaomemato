package Utilidades;

import java.util.LinkedList;
import java.util.List;

import Entidades.persona;

public class laMain {
	
	public static double promedioEdades(persona[] persona) {
        int totalEdades = 0;
        for (persona personas : persona) {
            totalEdades += personas.getEdad();
        }
        return (double) totalEdades / persona.length;}

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
		persona[] personasArray = listalinked.toArray(new persona[0]);
		double promedio = promedioEdades(personasArray);
		int totalMacs = contarM(personasArray);
		int totalFem= contarF(personasArray);
		
		
		System.out.println("El promedio del total de las edades es de "+ promedio);
		System.out.println("El total de personas del genero masculino es de "+totalMacs);
		System.out.println("El total de personas del genero femenino es de "+ totalFem);


	}
	public static int contarM (persona [] persona) {
        int cont = 0;
        for (persona persona1: persona){
            if (persona1.getGenero() == "masculino") {
                cont++;
            }
        }
        return cont;}
	public static int contarF (persona[]persona) {
        int cont = 0;
        for (persona persona1: persona){
            if (persona1.getGenero() == "femenino");
                cont++;
            }
        
        return cont;}
	
	}



