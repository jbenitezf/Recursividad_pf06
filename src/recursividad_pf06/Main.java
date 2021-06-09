package recursividad_pf06;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author JOAQUIN
 *
 */


public class Main {
	/**
	 * En el main se encuentra el switch para elegir que método ejecutar.
	 * @param args
	 */
		public static void main (String [] args) {
			while(true) {
	    		int opcion = menu();
	    		switch (opcion) {
				case 1:
					FactorialIterativo();
					break;
				case 2:
					FactorialRecursivo();
					break;
				case 3:
					EuclidesDirecto();
					break;
				case 4:
					EuclidesArray ();
					break;
				default:
					break;
				}
	    	
			}
		}
			/**
			 * Este metodo muestra las opciones del men� cuando se llama en el main, y llama al m�todo leeropcion. Este se repite hasta poner una
			 * opción válida
			 * @return opcion Devuelve la opción elegida
			 */
			private static int menu() {
		    	int opcion=0;
		    	
		    	do {
		    		System.out.println("Opciones:");
		    		System.out.println("1. Factorial Iterativo");
		    		System.out.println("2. Factorial Recursivo");
		    		System.out.println("3. Euclides Directo");
		    		System.out.println("4. Euclides Recursivo");
		    		System.out.println("Introduce la opcion:");
		    	
		    		opcion = leerOpcion(4);
		    		
		    	}while(opcion <=0);
		    	
		    	return opcion;
		    }
			/**
			 * Este método lee la opcion que se pasa por teclado cuando se le pide en el m�todo menu y si la opcion es incorrecta salta un error
			 * @param max
			 * @return opcion Devuelve la opción elegida
			 */
			 private static int leerOpcion(double max) {
			    	int opcion = -1;
			    	try {
			    		Scanner teclado = new Scanner(System.in);
			    		opcion=teclado.nextInt();
			    		if(opcion>max)
			    			opcion=-1;
			    	}catch (InputMismatchException e) {
						System.out.println("Opción incorrecta");
					}
			    	
			    	return opcion;
			 }
			 /**
			  * Método que resuelve el factorial de un número que se pasa por pantalla
			  */
			 private static void FactorialIterativo(){
				 try {
					 	double result = 1;
				    	double num1 = 0;
				    	Scanner teclado = new Scanner(System.in);
				    	System.out.println("Introduce un número");
			    		num1=teclado.nextInt();
				    	if (num1 < 0) 
				    			num1 = num1 * -1;
				    	if (num1 <= 0)
				    			result = 1;
				    	while(num1 > 1) {
				    		result = result * num1;
				    		num1--;
				    	}
				   
				    	System.out.println("---------------------------------");
				    	System.out.println("El factorial(iterativo) es:");
				    	System.out.println(result);
				    	System.out.println("---------------------------------\n");
					 }catch(InputMismatchException ime) {
						 System.out.println("Solo se admiten números");
					 }
			 }
			 
			 /**
			  * Método que muestra el factorial de un número pasado por teclado
			  * llamando a un metodo recursivo
			  */
			 private static void FactorialRecursivo(){ 
				 try {
					 	double result = 0;
				    	double num1 = 0;
				    	Scanner teclado = new Scanner(System.in);
				    	System.out.println("Introduce un número");
			    		num1=teclado.nextInt();
			    		result = factorial(num1);
				   
				    	System.out.println("---------------------------------");
				    	System.out.println("El factorial(recursivo) es:");
				    	System.out.println(result);
				    	System.out.println("---------------------------------\n");
					 }catch(InputMismatchException ime) {
						 System.out.println("Solo se admiten números");
					 }
			 }
			 /**
			  * metodo recursivo que resuelve el factorial de un número
			  * @param numero
			  * @return 1 si el numero que se pasa es igual a 0 o numero * factorial(numero-1)
			  * si no es así
			  */
			 private static double factorial (double numero) {
				 if (numero == 0) return 1;
				 else return numero * factorial(numero-1);
			 }
			  
			 /**
			  * Método que muestra el MCD de dos números pasados por teclado
			  * llamando a un metodo recursivo
			  */
			 private static void EuclidesDirecto() {
				 try {
				 	int num1 = 0;
				 	int num2 = 0;
			    	Scanner teclado = new Scanner(System.in);
			    	System.out.println("Introduce un número");
		    		num1=teclado.nextInt();
		    		System.out.println("Introduce otro número");
		    		num2=teclado.nextInt();
		    		System.out.println("---------------------------------");
			    	System.out.println("El resultado de Euclides(Directo) es:");
			    	System.out.println(Euclides(num1, num2));
			    	System.out.println("---------------------------------\n");
				 }catch(InputMismatchException ime) {
					 System.out.println("Solo se admiten números");
				 }
				 
			 }
			 /**
			  * metodo recursivo que resuelve el MCD de dos números
			  * @param num1 
			  * @param num2
			  * @return num1 si num2 es igual a 0 o Euclides(num2, num1 % num2)
			  * si no es así
			  */
			 private static int Euclides(int num1, int num2) {
				 if(num2==0)
			           return num1;
			       else
			           return Euclides(num2, num1 % num2);
			 }
			 /**
			  * Metodo que resuelve el MCD De dos números que se pasan por teclado mediante arrays
			  */
			 private static void EuclidesArray() { 
				 try {
					 	int result = 0;
					 	int num1 = 0;
					 	int num2 = 0;
				    	Scanner teclado = new Scanner(System.in);
				    	System.out.println("Introduce un número");
			    		num1=teclado.nextInt();
			    		System.out.println("Introduce otro número");
			    		num2=teclado.nextInt();
			    		int[] arrayA = new int[num1+2];
			    		int[] arrayB = new int[num2+2];
			    		int division;
			    		int i=0;
			    		arrayA[i] = num1;
			    		arrayB[i] = num2;
			    		if ( arrayA[0]>0) {
			    			for (i = 0; arrayB[i]!=0 ; i++) {
			    				division = arrayA[i] % arrayB[i];
			    				arrayA[i+1] = arrayB[i];
			    				arrayB[i+1] = division;
			    			}
			    			result = arrayA[i];
			    		}else {
			    			result = arrayB[i];
			    		}
			    		System.out.println("---------------------------------");
				    	System.out.println("El Resultado de Euclides(Arrays) es:");
				    	System.out.println(result);
				    	System.out.println("---------------------------------\n");
				 }catch(InputMismatchException ime) {
					 System.out.println("Solo se admiten números");
				 }
			 }
}
