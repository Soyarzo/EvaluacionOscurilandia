
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

	public final String[] COLORES = {"Azul", "Rojo", "Negro", "Verde", "Rosado","Amarillo"};
	
	private String nombre;
	private String apellido;
	private String marca;
	private int dia, mes, year;
	private int alcance;
	private String color;
	private int armadura;
	
	public RandomData() {
		this.generarNombre();
		this.generarApellido();
		this.generarMarca();
		this.generarFecha();
		this.generarAlcance();
		this.generarColor();
		this.generarArmadura();
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
	
	public void setDia() {
		this.dia = azar(1,30);
	}
	public void setMes() {
		this.mes = azar(1,12);
	}
	public void setYear() {
		this.year = azar(1990,2020);
	}
	
	private void generarFecha() {	
		setMes();
		setDia();
		setYear();
	}

	public String getFecha() {
		return this.dia + "/" + this.mes + "/" + this.year;
	}
	
	private void generarAlcance() {
		this.alcance = azar(1, 15);
	}
	
	public int getAlcance() {
		return this.alcance;
	}
	
	private void generarColor() {
		this.color = COLORES[(int) (Math.random() * COLORES.length)];
	}
	
	public String getColor() {
		return this.color;
	}
	
	private void generarArmadura() {
		this.armadura = azar(0, 5);
	}
	
	public int getArmadura() {
		return this.armadura;
	}
	public static int azar(int desde, int hasta) {
		int azar = (int) (Math.random() * (hasta + 1 - desde)) + desde; //
		return azar;
	}
}