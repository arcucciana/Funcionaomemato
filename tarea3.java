package tarea3;

import javax.swing.JOptionPane;

public class tarea3 {

	public static void main( String[] args) {
		
	
		 int numero, segundonumero;
	        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero :D "));
	        segundonumero = numero%2;

	        if(segundonumero == 0 ) {
	            JOptionPane.showMessageDialog(null, "tu numero es par");
	        }
	        else{
	            JOptionPane.showMessageDialog(null,"tu numero no es par");
	        }
	}
	}


