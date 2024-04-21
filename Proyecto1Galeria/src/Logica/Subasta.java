package Logica;

import java.util.HashMap;

public class Subasta {
    private String fecha;
    private Integer pujaActual;
    private Comprador compradorFinal;
    private Administrador administrador;
    private Pieza pieza;
    private HashMap<String,Comprador> compradoresValidados;
    private HashMap<String,Movimiento> movimientos;
    
	public Subasta(String fecha, Administrador administrador, Pieza pieza,
			HashMap<String, Comprador> compradoresValidados) {
		super();
		this.fecha = fecha;
		this.pujaActual = 0;
		this.compradorFinal = new Comprador("No Registra",000000000);
		this.administrador = administrador;
		this.pieza = pieza;
		this.compradoresValidados = compradoresValidados;
		this.movimientos = new HashMap<String, Movimiento>();
	}
    
    
    

}
