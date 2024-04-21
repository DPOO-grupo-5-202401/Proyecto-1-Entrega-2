package Logica;

import java.util.HashMap;

public class Administrador extends Usuario {
	
	private String contrasena;
	private String login;
    private HashMap<String, Comprador> compradoresVerificados;
	
	
	
    // Constructor
    public Administrador(String nombre, String contrasena, String login) {
        super(nombre);
        this.contrasena = contrasena;
        this.login = login;
        this.compradoresVerificados = new HashMap<>();
    }

    // Verificar un comprador
    public void verificarComprador(Comprador comprador) {
        compradoresVerificados.put(comprador.getNombre(), comprador);
    }


    
    public void registrarPago(Compra compra) {
        
    }

    // Devolver una pieza al propietario
    public void devolverPieza(Pieza pieza) {
        
    }
    

    public void agregarPiezaAlInventario(Pieza pieza) {

    }


    // Iniciar una subasta
	
	public void iniciarSubasta(String fecha, Administrador administrador, Pieza pieza,
			HashMap<String, Comprador> compradoresValidados) {
		
		subasta = new Subasta()
		
		
		
	}

}
