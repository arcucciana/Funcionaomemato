package utilidades;

import java.util.Date;

import entidades.Comics;
import entidades.Libros;
import entidades.IProducto;
import entidades.TvLcd;
import entidades.iPhone;
import entidades.Producto;

public class ElMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IProducto[] productos = new Producto[7];
		productos[0]= new Libros(12000,new Date(24, 8, 5), "Fede", "FF: Full Flow", "Editorial fede");
		productos[1]= new Libros(13000, new Date (03/05/4002), "celemelez", "Reina hater", "Editorial celemelez");
		productos[2]= new TvLcd (650000, "Sony", 54);
		productos[3]= new TvLcd (789000, "LG", 60);
		productos[4]= new Comics (5000, new Date(26/06/2000), "Marvel", "Hulk", "Editorial super heroes", "Hulk y amigos");
		productos [5]= new Comics(9000, new Date(30/11/1990), "Marvel", "Thor", "Editorial superheroes", "Spiderman 1, 2, 3");
		productos [6] = new iPhone (900000, "Apple", "modelo 13", "Rosa");
		
	 for (int i =0; i<7;i++) {
		 System.out.print(productos[i].toString());
	 }
}
	} 
