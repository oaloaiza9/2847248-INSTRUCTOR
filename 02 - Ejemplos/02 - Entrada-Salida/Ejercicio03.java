import java.util.Scanner;

public class Ejercicio03{
	public static void main(String[] args) {
		
		// Creando variable de entrada
		Scanner teclado = new Scanner(System.in);

		// Pedir los datos:
		System.out.print(" Ingrese valor del numero 1: ");
		int numero_1 = teclado.nextInt();

		System.out.print(" Ingrese valor del numero 2: ");
		int numero_2 = teclado.nextInt();

		int auxiliar = numero_1;
		numero_1 = numero_2;
		numero_2 = auxiliar;

		// Imprimir el contenido de las  variables
		System.out.println(" => Numero 1: " + numero_1);
		System.out.println(" => Numero 2: " + numero_2);

	}
}