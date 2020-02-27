package cl.awakelab.clases;

import java.util.Arrays;

/**
 * Esta es la clase padre del sistema, de ella heredaran clases hijas con los 
 * atributos cantidadOcupantes, fechaIngreso, posicionTablero, modelo, fila, 
 * columna.
 * @author Manuel Soto, Josue Quiriban, Javier Leiva
 *
 */
public class Carro {

	//atributos
	private int cantidadOcupantes;
	private String fechaIngreso;
	private int[] posicionTablero = new int[2];
	private String modelo;
	private int fila;
	private int columna;
	/**
	 * @param cantidadOcupantes Este atributo indica
	 *  la cantidad de ocupantes que tiene un carro.
	 * @param fechaIngreso Este atributo se refiere a la
	 *  fecha de ingreso del ocupante a la institucion.
	 * @param posicionTablero Este atributo indica la posicion en el arreglo.
	 * @param modelo Este atributo indica el modelo de carro creado.
	 * @param fila Indica la posicion en el arreglo.
	 * @param columna Indica la posicion en el arreglo.
	 */
	
	/**
	 * Este es el constructor por defecto que le da el valor
	 *  por defecto a los atributos de la clase.
	 */
	public Carro() {
		RandomData azares = new RandomData();
		setPosicionTablero(getFila(), getColumna());
		setCantidadOcupantes(RandomData.azar(0, 10));
		setFechaIngreso(azares.getFecha());
		setFila();
		setColumna();
	}
	
	//Metodos Get y Set.
	public int getFila() {
		return fila;
	}

	public void setFila() {
		this.fila = RandomData.azar(0, 12);
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna() {
		this.columna = RandomData.azar(0, 13);
	}

	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}

	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int[] getPosicionTablero() {
		return posicionTablero;
	}

	public void setPosicionTablero(int fila, int columna) {
		this.posicionTablero[0] = fila;
		this.posicionTablero[1] = columna;
	}

	public String getModelo() {
		return this.modelo;

	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Carro [cantidadOcupantes=" + cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", posicionTablero="
				+ Arrays.toString(posicionTablero) + ", modelo=" + modelo + "]";
	}

}
