package cl.awakelab.clases;

import java.util.ArrayList;

import javax.net.ssl.TrustManagerFactorySpi;

import cl.awakelab.clases.Carro;

public class Tablero {
	
	private final int KROMI= 0;
	private final int TRUPALLA=1;
	private final int CAGUANO= 2;

	private Carro[] carros;
	private ArrayList<Huevo> huevos;
	
	
	public Tablero() {
		carros = new Carro[18];
		huevos = new ArrayList();	
		llenarTablero();
	}
	
	public Carro[] getCarros() {
		return carros;
	}
	
	public ArrayList<Huevo> getHuevos() {
		return huevos;
	}
	
	public Carro crearCarro(int modelo) {
		
		Carro nuevoCarro;
		if(modelo == KROMI) {
			nuevoCarro = new Kromi();
				
		}else if (modelo == CAGUANO) {
			nuevoCarro = new Caguano();
	
		}else   {
			nuevoCarro =new Trupalla();

		}
		return nuevoCarro;
	}
	
	public void ingresarATablero(Kromi carro) {
		boolean creado =true;
		for(int i=0;i<18 && creado;i++) {
			if (carros[i]==null) {
				carros[i]=carro;
				creado = false;
				if (i>0) {
					cambioPosicionTablero(i);
				}
			}	
		}		
	}
	
	public void ingresarATablero(Caguano carro) {
		boolean creado =true;
		for(int i=0;i<18 && creado;i++) {
			if (carros[i]==null) {
				carros[i]=carro;
				creado = false;
				if (i>0) {
					cambioPosicionTablero(i);
				}
			}	
		}		
	}
	
	public void ingresarATablero(Trupalla carro) {
		boolean creado =true;
		for(int i=0;i<18 && creado;i++) {
			if (carros[i]==null) {
				carros[i]=carro;
				creado = false;
				if (i>0) {
					cambioPosicionTablero(i);
				}
			}	
		}		
	}
	
	public void llenarTablero() {
		for (int i = 0;i<3;i++) {
			ingresarATablero((Kromi)crearCarro(KROMI));
		}
		for (int i = 0;i<5;i++) {
			ingresarATablero((Caguano)crearCarro(CAGUANO));
		}
		for (int i = 0;i<10;i++) {
			ingresarATablero((Trupalla)crearCarro(TRUPALLA));
		}
	}
	
	public void cambioPosicionTablero(int posicionCarroNuevo) {
		boolean condicion;
		
		for (int j=0; j<posicionCarroNuevo;j++) {
			condicion =((carros[posicionCarroNuevo].getFila()==carros[j].getFila() &&
					carros[posicionCarroNuevo].getColumna()==carros[j].getColumna()) ||
					carros[j].getFila()+1==carros[posicionCarroNuevo].getFila() ||
					carros[j].getFila()+2==carros[posicionCarroNuevo].getFila() ||
					carros[j].getColumna()+1==carros[posicionCarroNuevo].getColumna());
			
			if(condicion) {
				carros[posicionCarroNuevo].setColumna();
				carros[posicionCarroNuevo].setFila();	
				cambioPosicionTablero(j);
			}
		}	
	}
	
	public Huevo crearHuevo(int fila,int columna) {
		Huevo huevo = new Huevo(fila,columna);
		return huevo;
	}
	
	public void lanzarHuevo(Huevo huevo) {
		//huevo.setPuntaje(puntaje);
		
	}
	
	
	
	
}





/*


if(carros[j].getModelo().equals("Kromi")) {
	
	do {
		System.out.println(carros[posicionCarroNuevo].getFila()+","+carros[posicionCarroNuevo].getColumna() +" = " +carros[j].getFila()+","+carros[j].getColumna());
		if (carros[posicionCarroNuevo].getFila()==carros[j].getFila() && carros[posicionCarroNuevo].getColumna()==carros[j].getColumna()) {
			carros[posicionCarroNuevo].setColumna();
			carros[posicionCarroNuevo].setFila();
			j=0;
		}else {
			if (carros[j].getFila()+1==carros[posicionCarroNuevo].getFila()) {
				carros[posicionCarroNuevo].setFila();
				j=0;
			}else {
				if (carros[j].getFila()+2==carros[posicionCarroNuevo].getFila()) {
					carros[posicionCarroNuevo].setFila();
					j=0;
				}
			}
		}
	}while ((carros[posicionCarroNuevo].getFila()==carros[j].getFila() && carros[posicionCarroNuevo].getColumna()==carros[j].getColumna()) 
			|| carros[j].getFila()+1==carros[posicionCarroNuevo].getFila() || carros[j].getFila()+2==carros[posicionCarroNuevo].getFila());
}

if (carros[j].getModelo().equals("Caguano")) {
	
	do {
		System.out.println(carros[posicionCarroNuevo].getFila()+","+carros[posicionCarroNuevo].getColumna() +" = " +carros[j].getFila()+","+carros[j].getColumna());
		if(carros[posicionCarroNuevo].getFila()==carros[j].getFila() && carros[posicionCarroNuevo].getColumna()==carros[j].getColumna()) {
			carros[posicionCarroNuevo].setColumna();
			carros[posicionCarroNuevo].setFila();
			j=0;
		}else {
			if (carros[j].getColumna()+1==carros[posicionCarroNuevo].getColumna()) {
				carros[posicionCarroNuevo].setColumna();
				j=0;
			}
		}	
	}while((carros[posicionCarroNuevo].getFila()==carros[j].getFila() && carros[posicionCarroNuevo].getColumna()==carros[j].getColumna())
			|| carros[j].getColumna()+1==carros[posicionCarroNuevo].getColumna());
}

if (carros[j].getModelo().equals("Trupalla")) {
	do {
		System.out.println(carros[posicionCarroNuevo].getFila()+","+carros[posicionCarroNuevo].getColumna() +" = " +carros[j].getFila()+","+carros[j].getColumna());
		if(carros[posicionCarroNuevo].getFila()==carros[j].getFila() && carros[posicionCarroNuevo].getColumna()==carros[j].getColumna()) {
			carros[posicionCarroNuevo].setColumna();
			carros[posicionCarroNuevo].setFila();
			j=0;
		}
	}while(carros[posicionCarroNuevo].getFila()==carros[j].getFila() && carros[posicionCarroNuevo].getColumna()==carros[j].getColumna());
	
}	
}	


public void crearCarro(int modelo) {
	
	Carro prueba ;
	
	prueba = new Kromi();
	
	boolean creado =false;
	
	switch(modelo) {
	
	case 0:
		Kromi kromi = new Kromi();
		
		for (int i = 0; i<18 && creado!=true;i++) {
			if (carros[i]==null) {
				carros[i]=kromi;
				creado = true;
				if(i>0) {
					cambioPosicionTablero(i);	
				}
			}
		}
		break;
	case 1:
		Trupalla trupalla = new Trupalla();
		
		for (int i = 0; i<18 && creado!=true;i++) {
			if (carros[i]==null) {
				carros[i]=trupalla;
				creado = true;
				if(i>0) {
					cambioPosicionTablero(i);	
				}
			}
		}
		break;
	case 2:
		Caguano caguano = new Caguano();
		
		for (int i = 0; i<18 && creado!=true;i++) {
			if (carros[i]==null) {
				carros[i]=caguano;
				creado = true;
				if(i>0) {
					cambioPosicionTablero(i);	
				}
			}
		}
		break;
	}	
	
}
*/