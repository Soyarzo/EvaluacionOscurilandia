package cl.awakelab.clases;

/**
 * Clase Huevo es la que tiene los atributos fila, columna, puntaje.
 * @author Manuel Soto, Josue Quiriban, Javier Leiva
 *
 */
public class Huevo {
	/**
	 * @param fila Indica posicion en el arreglo.
	 * @param columna Indica poscion en el arreglo.
	 * @param puntaje Indica el puntaje otorgado en caso 
	 * de eliminar un objeto de tipo Carro.
	 */
	private int fila;
	private int columna;
	private int puntaje;

	/**
	 * Constructor por defecto que le da el valor por 
	 * defecto a fila, columna y puntaje.
	 * @param fila Ubicacion en el arreglo.
	 * @param columna Ubicacion en el arreglo.
	 */
	public Huevo(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
		this.puntaje = 0;
	}

	//Metodos Get y Set.
	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	//Metodo toString.
	@Override
	public String toString() {
		String retorno = String.format("%10s %-5s %10s %-5s%10s %-5s", "Fila=", this.fila, "Columna=", this.columna,
				"Puntaje=", this.puntaje);
		return retorno;
	}

}
