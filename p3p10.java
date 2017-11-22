import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase lee tres numeros y una cadena y los muestra en un rango dado
 * 
 * @author: Jesus Lopez Diez git
 */

public class p3p10 {

	static Scanner read = new Scanner(System.in); // escaner por teclado
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Ya
																						// tenemos
																						// el
																						// "lector"
	static ArrayList<Integer> enteros = new ArrayList<Integer>(); // alamacen
																	// para los
																	// numeros
	static String texto = ""; // almacen para la cadena

	public static void main(String[] args) throws IOException {
		for (int i = 0; i < 3; i++)
			enteros.add(entero()); // añadimos los enteros llamando a la funcion
									// 3 veces
		texto = (texto()); // guardamos el texto introducido
		for (int i = 0; i < enteros.size(); i++)
			System.out.print(enteros.get(i) + " "); // imprimimos numeros y
													// texto
		System.out.print(texto);
	}

	/**
	 * @param 
	 * metodo que pide un numero y lo devuelve
	 * @return el numero
	 */
	private static int entero() {
		System.out.println("introduce un numero por teclado");
		int numero = 0;
		numero = read.nextInt();
		return numero;

	}

	/**
	 * @param
	 *  metodo que pide un texto y lo devuelve
	 * @return el texto
	 */
	private static String texto() throws IOException {
		System.out.println("introduce un texto por teclado");
		String texto = br.readLine(); // Se lee el nombre con readLine() que
										// retorna un String con el dato
		return texto;

	}

}
