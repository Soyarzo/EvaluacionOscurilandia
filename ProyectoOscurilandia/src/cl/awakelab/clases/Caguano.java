package cl.awakelab.clases;

/**
 * Clase Caguano hereda de la superClase Carro. Esta clase 
 * tiene como atributos alcanceDeTiro y colorConfeti.
 * @author Manuel Soto, Josue Quiriban, Javier Leiva
 *
 */
public class Caguano extends Carro {
	
	/**
	 * @param alcanceDeTiro este atributo define el
	 *  alcance de tiro del carro Caguano.
	 * @param colorConfeti Este atributo indica el color
	 * de confeti que lanza el carro Caguano. 
	 */
	private int alcanceDeTiro;
	private String colorConfeti;
	
	/**
	 * Este es el constructor por defecto el cual por medio
	 * del azar define el color de confeti y el alcance de tiro.
	 */
	public Caguano() {
		super();
		RandomData azares = new RandomData();
		
		setAlcanceDeTiro(azares.getAlcance());
		setColorConfeti(azares.getColor());
		setModelo("Caguano");
	}

	//Metodos Get y Set.
	public float getAlcanceDeTiro() {
		return alcanceDeTiro;
	}

	public void setAlcanceDeTiro(int alcanceDeTiro) {
		this.alcanceDeTiro = alcanceDeTiro;
	}

	public String getColorConfeti() {
		return colorConfeti;
	}

	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}

}
