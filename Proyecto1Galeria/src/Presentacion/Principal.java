package Presentacion;

import java.util.HashMap;
import java.util.Scanner;

import Logica.Administrador;
import Logica.Comprador;
import Logica.Galeria;
import Logica.Movimiento;
import Logica.Pieza;
import Logica.Subasta;
import Logica.Video;


public class Principal {
	private Galeria galeria;
	private Administrador administrador;

	public Principal() {
		this.galeria = new Galeria();
		menu();
	}
	
	private void menu() {
		int op = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Digite una opcion");
			System.out.println("0. Salir");
			System.out.println("1. Registrar Compradores");
			System.out.println("2. Registrar Obras");
			System.out.println("3. Crear Oferta de Obra");
			System.out.println("4. Comprar Obra");
			System.out.println("5. Iniciar Subasta");
			op = sc.nextInt();
			try {
				if(op == 1) {
					crearCompradores(sc);
					System.out.println("Se han registrado 4 Compradores");
				}else if(op == 2) {
					crearPiezas(sc);
					System.out.println("Se han registrado 4 piezas");
				}else if(op == 3) {
					iniciarSubasta(sc);
				}else if(op == 4) {
					iniciarSubasta(sc);
				}else if(op == 5) {
					iniciarSubasta(sc);
				}else if(op == 6) {
					
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
			
		}while(op != 0);
		sc.close();
	}
	
	
	private void crearCompradores(Scanner sc) {
		String nombre = "Juan";
		Integer numContacto = 0000;
		galeria.crearComprador(nombre, numContacto);
		
		String nombre2 = "Ana";
		Integer numContacto2 = 0000;
		galeria.crearComprador(nombre2, numContacto2);
		
		String nombre3 = "Natalia";
		Integer numContacto3 = 0000;
		galeria.crearComprador(nombre3, numContacto3);
		
		String nombre4 = "Jose";
		Integer numContacto4 = 0000;
		galeria.crearComprador(nombre4, numContacto4);
	}
	
	
	private void crearPiezas(Scanner sc) {
		galeria.crearEscultura("ESC001","David", 1600, "Canada", true, "12/12/2021",  "12/12/2021", "En venta", true, 0, 0, 100000, galeria.compradores.get("Jose"), 50, null, null);
		galeria.crearEscultura("ESC002","Cristo", 1600, "Francia", true, "12/12/2021",  "12/12/2021", "En venta", true, 0, 0, 100000, galeria.compradores.get("Jose"), 50, null, null);
		galeria.crearEscultura("ESC003","Piedad", 1600, "Italia", true, "12/12/2021",  "12/12/2021", "En venta", true, 0, 0, 100000, galeria.compradores.get("Jose"), 50, null, null);
		galeria.crearEscultura("ESC004","Persona", 1600, "Canada", true, "12/12/2021",  "12/12/2021", "En venta", true, 0, 0, 100000, galeria.compradores.get("Jose"), 50, null, null);
	
	}
	
	//Iniciar Subasta
	private void iniciarSubasta(Scanner sc) throws Exception {
		Pieza pieza = galeria.inventarioHistorico.get("ESC001");

	    HashMap<String, Comprador> compradoresValidados = new HashMap<>();
	    compradoresValidados.put("Ana", galeria.compradores.get("Ana"));
	    compradoresValidados.put("Natalia", galeria.compradores.get("Natalia"));


	    Subasta nuevaSubasta = this.administrador.iniciarSubasta(administrador, pieza, compradoresValidados);
	    //Movimiento 1
	    administrador.nuevoMovimiento(50000,"Aumento", compradoresValidados.get("Ana"));
	    
	    //Movimiento 2
	    administrador.nuevoMovimiento(60000,"Aumento", compradoresValidados.get("Natalia"));
	    
	    //Ultimo Movimiento
	    administrador.nuevoMovimiento(60000,"Compra", compradoresValidados.get("Natalia"));
	    
	    
	}
	
	
	
	public static void main(String[] args) {
		new Principal();
	}


}
