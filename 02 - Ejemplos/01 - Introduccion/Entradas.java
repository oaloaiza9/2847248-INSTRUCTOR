import java.util.Scanner;

public class Entradas{
	public static void main(String[] args) {
		
		// Creando variable para entrada de datos.
		Scanner teclado_numero = new Scanner(System.in);
		Scanner teclado_texto = new Scanner(System.in);

		// Pidiendo datos al usuario
		System.out.print("Ingrese la edad: ");
		byte edad = teclado_numero.nextByte();

		System.out.print("Ingrese el turno: ");
		short turno = teclado_numero.nextShort();

		System.out.print("Ingrese la cedula: ");
		int cedula = teclado_numero.nextInt();

		System.out.print("Ingrese la nota: ");
		float nota = teclado_numero.nextFloat();
		
		System.out.print("Ingrese la latitud: ");
		double latitud = teclado_numero.nextDouble();

		System.out.print("Ingrese el estado (true - false): ");
		boolean estado = teclado_numero.nextBoolean();

		System.out.print("Ingrese un simbolo: ");
		char simbolo = teclado_texto.nextLine().charAt(0);

		System.out.print("Ingrese Nombre Completo: ");
		String nombres = teclado_texto.nextLine();

		// Imprimiendo Datos de Variables
		System.out.println("=> La edad ingresada fue: " + edad);
		System.out.println("=> El turno ingresado fue: " + turno);
		System.out.println("=> La cedula ingresada fue: " + cedula);
		System.out.println("=> La nota ingresada fue: " + nota);
		System.out.println("=> La latitud ingresada fue: " + latitud);
		System.out.println("=> El estado ingresado fue: " + estado);
		System.out.println("=> El simbolo ingresado fue: " + simbolo);
		System.out.println("=> El nombre ingresado fue: " + nombres);


	}
}