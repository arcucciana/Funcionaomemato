package tarea4;
import java.util.Scanner;

public class OrdenarNombres {

	public static void main(String[] args) {
 
		// TODO Auto-generated method stub
		String palabra="";
		Scanner scaners = new Scanner(System.in);
		System.out.println("Ingrese el primer nombre: ");
		String nombre1= scaners.nextLine();
		System.out.println("Ingrese el segundo nombre: ");
		String nombre2= scaners.nextLine();
		System.out.println("Ingrese el tercer nombre: ");
		String nombre3= scaners.nextLine();
		
		if ((nombre1.length() > nombre2.length()) && (nombre1.length() > nombre3.length())){
            System.out.println ("El nombre mas largo es: "+  nombre1);
        }else if((nombre2.length() > nombre1.length()) && (nombre2.length() > nombre3.length())){
            System.out.println ("El nombre mas largo es :" + nombre2);
        } else {
            System.out.println ("El nombre mas largo es: "+ nombre3);}
        
       
	}

}
