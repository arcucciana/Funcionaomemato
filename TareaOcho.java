package Tarea8;

public class TareaOcho {
	public static void main(String[] args) {
        int[] array = new int[10];

  for (int i=0; i<10;i++){
	  array[i]=(int)(Math.random()*100);	
	  array[3] = array[9];
  }  
  
  System.out.println("El array es: ");
  for (int i=0; i<10; i++) {
	  System.out.println(array[i]);}
	  
  boolean encontrarNRep = false;
	int i =0 ;
	while (i<10 && encontrarNRep == false) {
		if (array [i]== array[9]) {
		encontrarNRep=true;
		}
		i++;
		
		if (encontrarNRep==  true) {
			System.out.println("El numero repetido del array fue: " + array [9]);
			
		}

	}
}
}

