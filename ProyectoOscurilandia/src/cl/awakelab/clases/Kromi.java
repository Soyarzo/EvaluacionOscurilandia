package cl.awakelab.clases;

/**
 * Clase Kromi hereda los atributos y metodos de clase padre Carro, tiene
 * los atributos marca y fecha de fabricacion.
 * @author Manuel Soto, Josue Quiriban, Javier Leiva
 *
 */
public class Kromi extends Carro {

	/**
	 * @param marca Este atributo se refiere a la marca del vehiculo Kromi.
	 * @param fechaFabricacion Se refiere a la fecha de fabricacion de Kromi.
	 */
	private String marca;
	private String fechaFabricacion;

	/**
	 * Constructor por defecto que da el valor por azar a marca, fecha
	 *  de fabricacion y modelo Kromi.
	 */
	public Kromi() {
		super();
		RandomData azares = new RandomData();

		setMarca(azares.getMarca());
		setFechaFabricacion(azares.getFecha());
		setModelo("Kromi");
	}

	//Metodos Get y Set.
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getFechaFabricacion() {
		return fechaFabricacion;
	}
	
	public void setFechaFabricacion(String fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

}
