package cl.awakelab.clases;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Esta clase nos genera la vista del menu al usuario, contiene los atributos
 * juego, seleccion.
 * 
 * @author Manuel Soto, Josue Quiriban, Javier Leiva
 *
 */
public class Menu {

	/**
	 * @param juego
	 * @param seleccion
	 */
	private static Tablero juego;
	private static int seleccion;

	/**
	 * Metodo que genera el mensaje de bienvenida al usuario.
	 */
	private static void bienvenida() {
		escribir("  --** Bienvenidos ciudadanos de Oscurilandia", true);
		escribir("  --** Ayuda a nuestros superheroes anonimos" + " FirstLine", true);
		escribir("  --** a derrotar a la elite de seguridad PKS", true);
		escribir("  --** Sigue las intrucciones para eliminar a los" + " enemigos", true);
		escribir("  --** Situados en la camara Secreta", true);

	}

	/**
	 * Metodo que entrega las opciones al usuario.
	 */
	private static void menuOpciones() {
		escribir("", true);
		escribir("", true);
		escribir(" 1-. Lanzar Huevo ", true);
		escribir(" 2-. Mostrar Matriz de lanzamiento", true);
		escribir(" 3-. Mostrar resumen de lanzamiento", true);
		escribir(" 4-. Mostrar Puntaje Actual", true);
		escribir(" 5-. Mostrar Matriz con posiciones de carros", true);
		escribir(" 6-. Finalizar Juego y mostrar Resumen", true);
		escribir("", true);
		escribir("", true);

		ejecutarOpciones();
	}

	/**
	 * Metodo que lee la opcion del usuario y ejecuta sus acciones.
	 */
	private static void ejecutarOpciones() {

		try {
			seleccion = leerEntero("ingrese una de las alternativas " + "mensionadas");

			switch (seleccion) {
			case 1:
				try {
					int fila = 0;
					int columna = 0;
					boolean condicion;
					do {
						escribir("ingresar nuemero entre 0 y 14", true);

						fila = leerEntero("Ingrese fila");
						columna = leerEntero("ingrese columna");
						condicion = (fila > 14 || fila < 0 || columna < 0 || columna > 14);
					} while (condicion);
					juego.lanzarHuevo(juego.crearHuevo(fila, columna));
				} catch (InputMismatchException e) {
					System.out.println("ingrese solo numeros " + e);

				}
				break;

			case 2:
				juego.mostrarMatrizJugador();
				break;
			case 3:
				mostrarLanzamientos();
				break;
			case 4:
				mostrarPuntajeActual();
				break;
			case 5:
				juego.mostrarMatrizCarros();
				break;
			case 6:
				juego.mostrarMatrizCarros();
				escribir("", true);
				mostrarLanzamientos();
				escribir("", true);
				mostrarPuntajeActual();

				escribir("Gracias por participar de nuestro Proyecto", true);
				escribir("Javier Leiva", true);
				escribir("Josue Quiriban", true);
				escribir("Manuel Soto", true);
			}

		} catch (InputMismatchException e) {

		}
	}

	/**
	 * Metodo que muestra los lanzamientos echos por el usuario.
	 */
	public static void mostrarLanzamientos() {
		for (Huevo huevos : juego.getHuevos()) {
			escribir(huevos.toString(), true);
		}
	}

	/**
	 * Metodo que muestra el puntaje que lleva hasta el momento el usuario.
	 */
	public static void mostrarPuntajeActual() {
		int sumaPuntaje = 0;
		for (Huevo huevos : juego.getHuevos()) {
			sumaPuntaje += huevos.getPuntaje();
		}
		escribir("el puntaje acumulado actual es " + sumaPuntaje, true);
	}

	/**
	 * Metodo que ejecuta el tablero.
	 */
	public static void run() {
		juego = new Tablero();
		bienvenida();
		do {
			menuOpciones();
		} while (seleccion != 6);
	}

	/**
	 * Metodo que lee la opcion del usuario
	 * 
	 * @param mensaje mensaje entregado por el usuario
	 * @return entrada.
	 */
	public static int leerEntero(String mensaje) {
		escribir(mensaje, true);
		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt();
	}

	/**
	 * Metodo que escribe al usuario.
	 * 
	 * @param mensaje Es lo que se muestra al usuario.
	 * @param salto   espacio entre palabras.
	 */
	private static void escribir(String mensaje, boolean salto) {
		if (salto) {
			System.out.println(mensaje);
		} else
			System.out.print(mensaje);
	}

}
