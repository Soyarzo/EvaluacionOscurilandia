package cl.awakelab.clases;

import java.util.ArrayList;

import javax.net.ssl.TrustManagerFactorySpi;

import cl.awakelab.clases.Carro;

public class Tablero {

	private final int KROMI = 0;
	private final int TRUPALLA = 1;
	private final int CAGUANO = 2;

	private Carro[] carros;
	private ArrayList<Huevo> huevos;

	private String[][] matrizJugador;
	private String[][] matrizCarros;

	public Tablero() {
		carros = new Carro[18];
		huevos = new ArrayList();
		matrizJugador = new String[15][15];
		matrizCarros = new String[15][15];
		llenarTablero();
		llenarMatrizBlanco();
		rellenarMatrizCarros();
	}

	public Carro[] getCarros() {
		return carros;
	}

	public ArrayList<Huevo> getHuevos() {
		return huevos;
	}

	public Carro crearCarro(int modelo) {

		Carro nuevoCarro;
		if (modelo == KROMI) {
			nuevoCarro = new Kromi();

		} else if (modelo == CAGUANO) {
			nuevoCarro = new Caguano();

		} else {
			nuevoCarro = new Trupalla();

		}
		return nuevoCarro;
	}

	public void ingresarATablero(Kromi carro) {
		boolean creado = true;
		for (int i = 0; i < 18 && creado; i++) {
			if (carros[i] == null) {
				carros[i] = carro;
				creado = false;
				if (i > 0) {
					cambioPosicionTablero(i);
				}
			}
		}
	}

	public void ingresarATablero(Caguano carro) {
		boolean creado = true;
		for (int i = 0; i < 18 && creado; i++) {
			if (carros[i] == null) {
				carros[i] = carro;
				creado = false;
				if (i > 0) {
					cambioPosicionTablero(i);
				}
			}
		}
	}

	public void ingresarATablero(Trupalla carro) {
		boolean creado = true;
		for (int i = 0; i < 18 && creado; i++) {
			if (carros[i] == null) {
				carros[i] = carro;
				creado = false;
				if (i > 0) {
					cambioPosicionTablero(i);
				}
			}
		}
	}

	public void llenarTablero() {
		for (int i = 0; i < 3; i++) {
			ingresarATablero((Kromi) crearCarro(KROMI));
		}
		for (int i = 0; i < 5; i++) {
			ingresarATablero((Caguano) crearCarro(CAGUANO));
		}
		for (int i = 0; i < 10; i++) {
			ingresarATablero((Trupalla) crearCarro(TRUPALLA));
		}
	}

	public void cambioPosicionTablero(int posicionCarroNuevo) {
		boolean condicion;

		for (int j = 0; j < posicionCarroNuevo; j++) {
			condicion = ((carros[posicionCarroNuevo].getFila() == carros[j].getFila()
					&& carros[posicionCarroNuevo].getColumna() == carros[j].getColumna())
					|| (carros[j].getFila() + 1 == carros[posicionCarroNuevo].getFila()
							&& carros[posicionCarroNuevo].getColumna() == carros[j].getColumna())
					|| (carros[j].getFila() + 2 == carros[posicionCarroNuevo].getFila()
							&& carros[posicionCarroNuevo].getColumna() == carros[j].getColumna())
					|| (carros[posicionCarroNuevo].getFila() == carros[j].getFila()
							&& carros[j].getColumna() + 1 == carros[posicionCarroNuevo].getColumna()));

			if (condicion) {
				carros[posicionCarroNuevo].setColumna();
				carros[posicionCarroNuevo].setFila();
				cambioPosicionTablero(j);
			}
		}
	}

	public Huevo crearHuevo(int fila, int columna) {
		Huevo huevo = new Huevo(fila, columna);
		return huevo;
	}

	public void lanzarHuevo(Huevo huevo) {

		if (this.matrizCarros[huevo.getFila()][huevo.getColumna()].equals("| K |")) {
			huevo.setPuntaje(3);
			this.matrizJugador[huevo.getFila()][huevo.getColumna()] = "| H |";
			this.matrizCarros[huevo.getFila()][huevo.getColumna()] = "| H |";
		} else if (this.matrizCarros[huevo.getFila()][huevo.getColumna()].equals("| C |")) {
			huevo.setPuntaje(2);
			this.matrizJugador[huevo.getFila()][huevo.getColumna()] = "| H |";
			this.matrizCarros[huevo.getFila()][huevo.getColumna()] = "| H |";
		} else if (this.matrizCarros[huevo.getFila()][huevo.getColumna()].equals("| T |")) {
			huevo.setPuntaje(2);
			this.matrizJugador[huevo.getFila()][huevo.getColumna()] = "| H |";
			this.matrizCarros[huevo.getFila()][huevo.getColumna()] = "| H |";
		} else
			this.matrizJugador[huevo.getFila()][huevo.getColumna()] = "| H |";
		this.matrizCarros[huevo.getFila()][huevo.getColumna()] = "| H |";
		huevos.add(huevo);

	}

	public void mostrarMatrizCarros() {
		String print1;
		mostrarCoordenadas();
		for (int i = 0; i < this.matrizCarros.length; i++) {
			print1 = i + "  ";
			System.out.printf("%5s", print1);
			for (int j = 0; j < this.matrizCarros.length; j++) {
				System.out.printf("%5s", this.matrizCarros[i][j]);
			}
			print1 = "  " + i;
			System.out.print(print1);
			System.out.println("");
		}
		mostrarCoordenadas();
	}

	public void mostrarMatrizJugador() {
		String print1;
		mostrarCoordenadas();
		for (int i = 0; i < this.matrizJugador.length; i++) {
			print1 = i + "  ";
			System.out.printf("%5s", print1);
			for (int j = 0; j < this.matrizJugador.length; j++) {
				System.out.printf("%5s", this.matrizJugador[i][j]);
			}
			print1 = "  " + i;
			System.out.print(print1);
			System.out.println("");
		}
		mostrarCoordenadas();
	}

	private void mostrarCoordenadas() {
		System.out.print("     ");
		for (int i = 0; i < 15; i++) {
			// String print = "[ "+i +"]";
			System.out.printf("%1s%-2s%1s", "[ ", i, "]");
		}

		System.out.println("");
	}

	public void llenarMatrizBlanco() {

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				this.matrizCarros[i][j] = "|   |";
				this.matrizJugador[i][j] = "|   |";
			}
		}
	}

	public void rellenarMatrizCarros() {
		for (int i = 0; i < carros.length; i++) {
			if (carros[i].getModelo().equals("Kromi")) {
				llenarMatriz((Kromi) carros[i]);
			} else if (carros[i].getModelo().equals("Caguano")) {
				llenarMatriz((Caguano) carros[i]);
			} else
				llenarMatriz((Trupalla) carros[i]);
		}

	}

	private void llenarMatriz(Kromi kromi) {
		this.matrizCarros[kromi.getFila()][kromi.getColumna()] = "| K |";
		this.matrizCarros[kromi.getFila() + 1][kromi.getColumna()] = "| K |";
		this.matrizCarros[kromi.getFila() + 2][kromi.getColumna()] = "| K |";
	}

	private void llenarMatriz(Caguano caguano) {
		this.matrizCarros[caguano.getFila()][caguano.getColumna()] = "| C |";
		this.matrizCarros[caguano.getFila()][caguano.getColumna() + 1] = "| C |";
	}

	private void llenarMatriz(Trupalla Trupalla) {
		this.matrizCarros[Trupalla.getFila()][Trupalla.getColumna()] = "| T |";

	}

}

/*
 * 
 * 
 * if(carros[j].getModelo().equals("Kromi")) {
 * 
 * do { System.out.println(carros[posicionCarroNuevo].getFila()+","+carros[
 * posicionCarroNuevo].getColumna() +" = "
 * +carros[j].getFila()+","+carros[j].getColumna()); if
 * (carros[posicionCarroNuevo].getFila()==carros[j].getFila() &&
 * carros[posicionCarroNuevo].getColumna()==carros[j].getColumna()) {
 * carros[posicionCarroNuevo].setColumna();
 * carros[posicionCarroNuevo].setFila(); j=0; }else { if
 * (carros[j].getFila()+1==carros[posicionCarroNuevo].getFila()) {
 * carros[posicionCarroNuevo].setFila(); j=0; }else { if
 * (carros[j].getFila()+2==carros[posicionCarroNuevo].getFila()) {
 * carros[posicionCarroNuevo].setFila(); j=0; } } } }while
 * ((carros[posicionCarroNuevo].getFila()==carros[j].getFila() &&
 * carros[posicionCarroNuevo].getColumna()==carros[j].getColumna()) ||
 * carros[j].getFila()+1==carros[posicionCarroNuevo].getFila() ||
 * carros[j].getFila()+2==carros[posicionCarroNuevo].getFila()); }
 * 
 * if (carros[j].getModelo().equals("Caguano")) {
 * 
 * do { System.out.println(carros[posicionCarroNuevo].getFila()+","+carros[
 * posicionCarroNuevo].getColumna() +" = "
 * +carros[j].getFila()+","+carros[j].getColumna());
 * if(carros[posicionCarroNuevo].getFila()==carros[j].getFila() &&
 * carros[posicionCarroNuevo].getColumna()==carros[j].getColumna()) {
 * carros[posicionCarroNuevo].setColumna();
 * carros[posicionCarroNuevo].setFila(); j=0; }else { if
 * (carros[j].getColumna()+1==carros[posicionCarroNuevo].getColumna()) {
 * carros[posicionCarroNuevo].setColumna(); j=0; } }
 * }while((carros[posicionCarroNuevo].getFila()==carros[j].getFila() &&
 * carros[posicionCarroNuevo].getColumna()==carros[j].getColumna()) ||
 * carros[j].getColumna()+1==carros[posicionCarroNuevo].getColumna()); }
 * 
 * if (carros[j].getModelo().equals("Trupalla")) { do {
 * System.out.println(carros[posicionCarroNuevo].getFila()+","+carros[
 * posicionCarroNuevo].getColumna() +" = "
 * +carros[j].getFila()+","+carros[j].getColumna());
 * if(carros[posicionCarroNuevo].getFila()==carros[j].getFila() &&
 * carros[posicionCarroNuevo].getColumna()==carros[j].getColumna()) {
 * carros[posicionCarroNuevo].setColumna();
 * carros[posicionCarroNuevo].setFila(); j=0; }
 * }while(carros[posicionCarroNuevo].getFila()==carros[j].getFila() &&
 * carros[posicionCarroNuevo].getColumna()==carros[j].getColumna());
 * 
 * } }
 * 
 * 
 * public void crearCarro(int modelo) {
 * 
 * Carro prueba ;
 * 
 * prueba = new Kromi();
 * 
 * boolean creado =false;
 * 
 * switch(modelo) {
 * 
 * case 0: Kromi kromi = new Kromi();
 * 
 * for (int i = 0; i<18 && creado!=true;i++) { if (carros[i]==null) {
 * carros[i]=kromi; creado = true; if(i>0) { cambioPosicionTablero(i); } } }
 * break; case 1: Trupalla trupalla = new Trupalla();
 * 
 * for (int i = 0; i<18 && creado!=true;i++) { if (carros[i]==null) {
 * carros[i]=trupalla; creado = true; if(i>0) { cambioPosicionTablero(i); } } }
 * break; case 2: Caguano caguano = new Caguano();
 * 
 * for (int i = 0; i<18 && creado!=true;i++) { if (carros[i]==null) {
 * carros[i]=caguano; creado = true; if(i>0) { cambioPosicionTablero(i); } } }
 * break; }
 * 
 * }
 */