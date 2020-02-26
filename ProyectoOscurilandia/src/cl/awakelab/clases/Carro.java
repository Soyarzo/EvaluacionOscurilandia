package cl.awakelab.clases;

import java.util.Arrays;

/*
 @author
@deprecated Indica que el método o clase es obsoleto (propio de versiones anteriores) y que no se recomienda su uso.
Descripción
@param Definición de un parámetro de un método, es requerido para todos los parámetros del método.
Nombre de parámetro y descripción
@return Informa de lo que devuelve el método, no se aplica en constructores o métodos "void".
Descripción del valor de retorno
@see Asocia con otro método o clase.
Referencia cruzada
referencia (#método(); clase#método(); paquete.clase; paquete.clase#método()).
@version*/

public class Carro {

	private int cantidadOcupantes;
	private String fechaIngreso;
	private int[] posicionTablero = new int[2];
	private String modelo;
	private int fila;
	private int columna;

	public Carro() {
		RandomData azares = new RandomData();
		setPosicionTablero(getFila(), getColumna());
		setCantidadOcupantes(RandomData.azar(0, 10));
		setFechaIngreso(azares.getFecha());
		setFila();
		setColumna();
	}

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

	@Override
	public String toString() {
		return "Carro [cantidadOcupantes=" + cantidadOcupantes + ", fechaIngreso=" + fechaIngreso + ", posicionTablero="
				+ Arrays.toString(posicionTablero) + ", modelo=" + modelo + "]";
	}

}
