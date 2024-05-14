package TareaMeses;

import javax.swing.JOptionPane;

public class MesesDelAnioJava {

		   public static void main(String[] args) {
		        String nombreMes = JOptionPane.showInputDialog("Ingrese el nombre del mes:");
		        int numMes;
		        switch (nombreMes) {
		            case "enero":
		                numMes = 1;
		                System.out.println("El numero del mes Enero es 1");
		                break;
		            case "febrero":
		                numMes = 2;
		                System.out.println("El numero del mes Febrero es 2");

		                break;
		            case "marzo":
		                numMes = 3;
		                System.out.println("El numero del mes Marzo es 3");

		                break;
		            case "abril":
		                numMes = 4;
		                System.out.println("El numero del mes Abril es 1");

		                break;
		            case "mayo":
		                numMes = 5;	               
		                System.out.println("El numero del mes Mayo es 5");

		                break;
		            case "junio":
		                numMes = 6;
		                System.out.println("El numero del mes Junio es 2");

		                break;
		            case "julio":
		                numMes = 7;	               
		                System.out.println("El numero del mes Julio es 7");

		                break;
		            case "agosto":
		                numMes = 8;
		                System.out.println("El numero del mes Agosto es 8");

		                break;
		            case "septiembre":
		                numMes = 9;
		                System.out.println("El numero del mes Septiembre es 9");

		                break;
		            case "octubre":
		                numMes = 10;
		                System.out.println("El numero del mes Osctubre es 10");

		                break;
		            case "noviembre":
		                numMes = 11;
		                System.out.println("El numero del mes Noviembre es 11");

		                break;
		            case "diciembre":
		                numMes = 12;
		                System.out.println("El numero del mes Diciembre es 12");

		                break;
		            default:
		            	System.out.println("Ingrese un mes valido!");
		                break;
		        }
		    }
		}


