package cl.awakelab.clases;

/**
 * Clase Trupalla hereda los atributos y metodos de clase padre Carro, tiene los
 * atributos armadura y conductor.
 * 
 * @author Manuel Soto, Josue Quiriban, Javier Leiva
 *
 */
public class Trupalla extends Carro {

	/**
	 * @param armadura  Se refiere al nivel de armadura que tiene el carro, este
	 *                  esta definido por un azar.
	 * @param conductor Se refiere al nombre completo del conductor del vehiculo.
	 */
	private int armadura;
	private String conductor;

	/**
	 * Constructor por defecto que le da valor por azar a armadura , a el conductor
	 * y al modelo de Carro.
	 */
	public Trupalla() {
		super();
		RandomData azares = new RandomData();

		setArmadura(azares.getArmadura());
		setConductor(azares.getNombreCompleto());
		setModelo("Trupalla");
	}

	// Metodos Get y Set.
	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

}
