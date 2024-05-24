package Entidades;

import java.util.Date;

public class OrdenCompra {
   private int id;
   private String descripcion;
   private Date fecha;
   private Clientes cliente;
   private Productos [] productos= new Productos [4];
   private int contadorProductos=0;
   
public OrdenCompra(String descripcion) {
	super();
	this.descripcion = descripcion;
}

public int getId() {
	return id;
}

public String getDescripcion() {
	return descripcion;
}

public Date getFecha() {
	return fecha;
}

public Clientes getCliente() {
	return cliente;
}

public Productos[] getProducto() {
	return productos;
}

public void setFecha(Date fecha) {
	this.fecha = fecha;
}

public void setCliente(Clientes cliente) {
	this.cliente = cliente;
}
   
public void addProducto (Productos producto) {
	if (contadorProductos<4) {
		productos[contadorProductos]=producto;
		contadorProductos++;
	}
}

public int getTotal () {
	int total=0;
	for(int i=0; i<productos.length; i++) {
		if(productos[i]!=null) {
			total=productos[i].getPrecio();
			}
	}
	return total;	
}

   
   
   
   
}
