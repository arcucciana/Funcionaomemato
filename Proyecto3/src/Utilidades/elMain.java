package Utilidades;

import Entidades.Fruta;
import Entidades.Lacteo;
import Entidades.Limpieza;
import Entidades.NoPerecible;
import Entidades.Productos;

public class elMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				 Productos array[] = new Productos[8];

		  array[0] = new Lacteo("Leche", 10, 2, 19);
	      array[1] = new Lacteo("Queso", 12, 1, 25);
	      array[2] = new Fruta("Manzana", 8, 500, "rojo");
	      array[3] = new Fruta("Bananas", 9, 1000, "amarillo");
	      array[4] = new Limpieza("Limpiador", 18, "Lavaplatos", 1);
	      array[5] = new Limpieza("Lavandina", 13, "Lavandina sólida", 2);
	      array[6] = new NoPerecible("Arroz", 8, 1000, 466);
	      array[7] = new NoPerecible("Fideos", 7, 980, 777);

	
	      System.out.println("Elementos del array:");
	        for (Productos producto : array) {
	            if (producto instanceof Lacteo) {
	                Lacteo lacteo = (Lacteo) producto;
	                System.out.println("Lacteo: " + lacteo.getNombre() + ", precio: " + lacteo.getPrecio()+ " , cantidad: "+lacteo.getCantidad()+ "y sus proteinas: "+lacteo.getProteinas());
	            } else if (producto instanceof Fruta) {
	                Fruta fruta = (Fruta) producto;
	                System.out.println("Fruta: " + fruta.getNombre() + ", precio: " + fruta.getPrecio()+" , peso: "+ fruta.getPeso()+" y su color: "+fruta.getColor());
	            } else if (producto instanceof Limpieza) {
	                Limpieza limpieza = (Limpieza) producto;
	                System.out.println("Limpieza: " + limpieza.getNombre() + ", precio: " + limpieza.getPrecio()+ " ,sus componentes: "+limpieza.getComponentes()+ " y vine en fomrato litro: ");
	            } else if (producto instanceof NoPerecible) {
	                NoPerecible noPerecible = (NoPerecible) producto;
	                System.out.println("No Perecible: " + noPerecible.getNombre() + ", precio: " + noPerecible.getPrecio()+" su contenido es de: "+noPerecible.getContenido()+ " y sus calorias: "+noPerecible.getCalorias());
	            } else {
	                System.out.println("No hay un producto de ese tipo.");
	            }
	}

}
} 
