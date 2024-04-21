package Logica;

import java.util.HashMap;

public class Galeria {
	public HashMap<String, Pieza> inventarioHistorico;
	public HashMap<String, Comprador> compradores;
	
	
	
	public Galeria() {
		this.inventarioHistorico = new HashMap<String, Pieza>();
		this.compradores = new HashMap<String, Comprador>();
	}


	public void crearComprador(String nombre, int numeroDeContacto) {
		Comprador nuevoComprador = new Comprador(nombre,numeroDeContacto); 
		this.compradores.put(nuevoComprador.getNombre(),nuevoComprador);
	}

}
