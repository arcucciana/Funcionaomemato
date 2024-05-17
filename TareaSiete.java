package TareaJava7;


public class TareaSiete {

	public static void main(String[] args) {
        int[] array = new int[10];

  for (int i=0; i<10; i++) {
	  array[i]=(int)(Math.random()*100);
	  
  }
  System.out.println("El array es: ");
  for (int i=0; i<10; i++) {
	  System.out.println(array[i]);
  }
    
	int max = array[0];
    for (int i = 1; i < 10; i++) {
        if (array[i] > max) {
            max = array[i];
        }
    }

    System.out.println("El número mayor en el arreglo es: " + max);
}
	
}



