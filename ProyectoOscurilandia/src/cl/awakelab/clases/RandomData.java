
package cl.awakelab.clases;

/**
 * Esta Clase contiene la biblioteca de Nombres, Apellidos, Marcas y colores que
 * se utilizaran a lo largo del programa.
 * 
 * @author Manuel Soto, Josue Quiriban, Javier Leiva
 */
public class RandomData {

	/**
	 * Arreglo String de Nombres, Contiene todos los nombres de la biblioteca.
	 */
	private final String[] NOMBRES = { "Isabella", "Sofia", "Agustina", "Emilia", "Josefa", "Isidora", "Emma",
			"Trinidad", "Florencia", "Julieta", "Maite", "Maria", "Amanda", "Antonella", "Martina", "Valentina",
			"Catalina", "Leonor", "Renata", "Mia", "Mateo", "Agustin", "Santiago", "Tomas", "Benjamin", "Lucas",
			"Gaspar", "Alonso", "Vicente", "Maximiliano", "Joaquin", "Matias", "Martin", "Jose", "Luciano", "Facundo",
			"Julian", "Gabriel", "Maximo", "Juan" };

	/**
	 * String Apellidos Contiene todos los apellidos de la biblioteca.
	 */
	private final String[] APELLIDOS = { "Gonzalez", "Munoz", "Rojas", "Diaz", "Perez", "Soto", "Contreras", "Silva",
			"Martinez", "Sepulveda", "Morales", "Rodriguez", "Lopez", "Fuentes", "Hernandez", "Torres", "Araya",
			"Flores", "Espinoza", "Valenzuela", "Castillo", "Ramirez", "Reyes", "Gutierrez", "Castro", "Vargas",
			"alvarez", "Vasquez", "Tapia", "Fernandez", "Sanchez", "Carrasco", "Gomez", "Cortes", "Herrera", "Nunez",
			"Jara", "Vergara", "Rivera", "Figueroa" };

	/**
	 * String de Marcas Contiene todas las marcas de la biblioteca.
	 */
	public final String[] MARCAS = { "Scania", "Man", "Volvo", "Mercedes", "Isuzu", "GMC", "Hino", "Ford", "Hummer",
			"Mack Trucks" };

	/**
	 * String de Colores Contiene todos los colores de la biblioteca.
	 */
	public final String[] COLORES = { "Azul", "Rojo", "Negro", "Verde", "Rosado", "Amarillo" };

	/**
	 * @param nombre   Este atributo se refiere a un String de nombre.
	 * @param apellido Este atributo se refiere a un String de apellido.
	 * @param marca    Este atributo se refiere a un String de marca.
	 * @param dia      Este atributo es un int de Dia.
	 * @param mes      Este atributo es un int de mes.
	 * @param year     Este atributo es un int de año.
	 * @param alcance  Este atributo es un int de alcance.
	 * @param color    Este atributo es un String de color.
	 * @param armadura Este atributo es un int de armadura.
	 */
	private String nombre;
	private String apellido;
	private String marca;
	private int dia, mes, year;
	private int alcance;
	private String color;
	private int armadura;

	/**
	 * Constructor por defecto que llama a los metodos generarNombre,
	 * generarApellido, generarMarca, generarFecha, generarAlcance, generarColor,
	 * generarArmadura.
	 */
	public RandomData() {
		this.generarNombre();
		this.generarApellido();
		this.generarMarca();
		this.generarFecha();
		this.generarAlcance();
		this.generarColor();
		this.generarArmadura();
	}

	/**
	 * Metodo que genera el nombre por azar en base a la biblioteca de nombres.
	 */
	private void generarNombre() {
		this.nombre = NOMBRES[(int) (Math.random() * NOMBRES.length)];
	}

	/**
	 * Metodo que genera el apellido por azar en base a la biblioteca de apellidos.
	 */
	private void generarApellido() {
		this.apellido = APELLIDOS[(int) (Math.random() * APELLIDOS.length)];
	}

	/**
	 * Metodo que genera el nombre completo en base a nombre y apellido.
	 * 
	 * @return nombreCompleto.
	 */
	public String getNombreCompleto() {
		return this.nombre + " " + this.apellido;
	}

	/**
	 * Metodo que genera la marca con el azar de marcas de la biblioteca.
	 */
	private void generarMarca() {
		this.marca = MARCAS[(int) (Math.random() * MARCAS.length)];
	}

	/**
	 * Metodo que obtiene el valor de la marca.
	 * 
	 * @return marca
	 */
	public String getMarca() {
		return this.marca;
	}

	/**
	 * Metodo que modifica el dia con un azar entre 1 y 30.
	 */
	public void setDia() {
		this.dia = azar(1, 30);
	}

	/**
	 * Metodo que modifica el mes con un azar entre 1 y 12.
	 */
	public void setMes() {
		this.mes = azar(1, 12);
	}

	/**
	 * Metodo que modifica el año con un azar entre 1990 y 2020.
	 */
	public void setYear() {
		this.year = azar(1990, 2020);
	}

	/**
	 * Metodo que genera la fecha con la obtencion de datos del dia, mes y año.
	 */
	private void generarFecha() {
		setMes();
		setDia();
		setYear();
	}

	/**
	 * Este metodo obtiene la fecha en base al dia, mes y año.
	 * 
	 * @return Fecha.
	 */
	public String getFecha() {
		return this.dia + "/" + this.mes + "/" + this.year;
	}

	/**
	 * Metodo que genera el alcance del objeto Carro por medio de un azar entre 1 y
	 * 15.
	 */
	private void generarAlcance() {
		this.alcance = azar(1, 15);
	}

	/**
	 * Metodo que obtiene el Alcance.
	 * 
	 * @return alcance.
	 */
	public int getAlcance() {
		return this.alcance;
	}

	/**
	 * Este metodo genera el color con un azar de la biblioteca de colores.
	 */
	private void generarColor() {
		this.color = COLORES[(int) (Math.random() * COLORES.length)];
	}

	/**
	 * Este metodo obtiene el color.
	 * 
	 * @return color
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * Este metodo modifica el valor de armadura por medio de un azar entre 0 y 5.
	 */
	private void generarArmadura() {
		this.armadura = azar(0, 5);
	}

	/**
	 * Metodo que obtiene el valor de armadura.
	 * 
	 * @return armadura.
	 */
	public int getArmadura() {
		return this.armadura;
	}

	/**
	 * Metodo que realiza el azar.
	 * 
	 * @param desde parametro que da el rango.
	 * @param hasta parametro que da el rango.
	 * @return azar.
	 */
	public static int azar(int desde, int hasta) {
		int azar = (int) (Math.random() * (hasta + 1 - desde)) + desde; //
		return azar;
	}
}