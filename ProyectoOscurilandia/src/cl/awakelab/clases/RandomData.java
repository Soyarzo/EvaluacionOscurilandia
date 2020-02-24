
package cl.awakelab.clases;


public class RandomData {

	private final String[] NOMBRES = { "Isabella", "Sofia", "Agustina", "Emilia", "Josefa", "Isidora", "Emma",
			"Trinidad", "Florencia", "Julieta", "Maite", "Maria", "Amanda", "Antonella", "Martina", "Valentina",
			"Catalina", "Leonor", "Renata", "Mia", "Mateo", "Agustin", "Santiago", "Tomas", "Benjamin", "Lucas",
			"Gaspar", "Alonso", "Vicente", "Maximiliano", "Joaquin", "Matias", "Martin", "Jose", "Luciano", "Facundo",
			"Julian", "Gabriel", "Maximo", "Juan" };

	private final String[] APELLIDOS = { "Gonzalez", "Munoz", "Rojas", "Diaz", "Perez", "Soto", "Contreras", "Silva",
			"Martinez", "Sepulveda", "Morales", "Rodriguez", "Lopez", "Fuentes", "Hernandez", "Torres", "Araya",
			"Flores", "Espinoza", "Valenzuela", "Castillo", "Ramirez", "Reyes", "Gutierrez", "Castro", "Vargas",
			"alvarez", "Vasquez", "Tapia", "Fernandez", "Sanchez", "Carrasco", "Gomez", "Cortes", "Herrera", "Nunez",
			"Jara", "Vergara", "Rivera", "Figueroa" };

	public final String[] MARCAS = {"Scania", "Man", "Volvo", "Mercedes", "Isuzu", "GMC", "Hino", 
			"Ford", "Hummer", "Mack Trucks" };

	
	
	private String nombre;
	private String apellido;
	private String marca;
	private int dia, mes, year;
	
	public RandomData() {
		this.generarNombre();
		this.generarApellido();
		this.generarMarca();
		this.generarFecha();
		
	}

	private void generarNombre() {
		this.nombre = NOMBRES[(int) (Math.random() * NOMBRES.length)];
	}

	private void generarApellido() {
		this.apellido = APELLIDOS[(int) (Math.random() * APELLIDOS.length)];
	}
	

	public String getNombreCompleto() {
		return this.nombre + " " + this.apellido;
	}

	private void generarMarca() {
		this.marca = MARCAS[(int) (Math.random() * MARCAS.length)];
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	private void generarFecha() {
		
		this.mes = azar(1,12);
		this.dia = azar(1,30);
		this.year = azar(1990,2020);
	}

	public String getFecha() {
		return this.dia + "/" + this.mes + "/" + this.year;
	}
	
	
	public static int azar(int desde, int hasta) {
		int azar = (int) (Math.random() * (hasta + 1 - desde)) + desde; //
		return azar;
	}
}