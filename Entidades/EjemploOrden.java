package Entidades;

import java.util.Date;
import java.util.Scanner;

public class EjemploOrden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Productos producto1 = new Productos("Coto", "Tallarines", 50);
		Productos producto2 = new Productos("Colombraro", "Caja", 100);
		Productos producto3 = new Productos("Carrefour", "Atun", 70);
		Productos producto4 = new Productos("China", "Muñeca", 60);
		
		Clientes cliente1= new Clientes("Pepina","Arcu");
		Clientes cliente2= new Clientes("Rau","Lojas");
		Clientes cliente3= new Clientes("Cele","Melez");

		OrdenCompra compra1=new OrdenCompra ("la primera orden");
		compra1.setCliente(cliente1);
		compra1.setFecha(new Date());
		compra1.addProducto(producto1);
		
		OrdenCompra compra2=new OrdenCompra ("la segunda orden");
		compra2.setCliente(cliente2);
		compra2.setFecha(new Date());
		compra2.addProducto(producto2);
		
		OrdenCompra compra3=new OrdenCompra ("la tercera orden");
        compra3.setCliente(cliente3);
		compra3.setFecha(new Date());
		compra3.addProducto(producto3);
		
		
		System.out.printf("La descripcion de la orden es: " + compra1.getDescripcion() + "realiza en la fecha: "+ compra1.getFecha()+". La compra realizada por: "+compra1.getCliente().getNombre() + " " + compra1.getCliente().getApellido() );
		
		
		
		System.out.printf(". Los productos "  );
		for (Productos producto : compra1.getProducto()) {
			if (producto != null) {
				System.out.println(producto.getNombre() +  " del fabricante " + producto.getFabricante()+ "y su precio"+ producto.getPrecio() );	
			}	
		}
     	System.out.println("El total es: " + compra1.getTotal());
		
     	System.out.printf("La descripcion de la orden es: " + compra2.getDescripcion() 
     	+ "realiza en la fecha: "+ compra2.getFecha()+". La compra realizada por: "+compra2.getCliente().getNombre() + " " + compra2.getCliente().getApellido() );
		
		
		
		System.out.printf(". Los productos elegidos "  );
		for (Productos producto : compra2.getProducto()) {
			if (producto != null) {
				System.out.println(producto.getNombre() +  " del fabricante " + producto.getFabricante()+ "y su precio"+ producto.getPrecio() );	
			}	
		}
     	System.out.println("El total es: " + compra2.getTotal());
		
System.out.printf("La descripcion de la orden es: " + compra3.getDescripcion() + "realiza en la fecha: "+ compra3.getFecha()+". La compra realizada por: "+compra3.getCliente().getNombre() + " " + compra3.getCliente().getApellido() );
		
		
		
		System.out.printf("Los productos "  );
		for (Productos producto : compra3.getProducto()) {
			if (producto != null) {
				System.out.println(producto.getNombre() +  " del fabricante " + producto.getFabricante()+ "y su precio"+ producto.getPrecio() );	
			}	
		}
     	System.out.println("El total es: " + compra3.getTotal());
			
	}

}
