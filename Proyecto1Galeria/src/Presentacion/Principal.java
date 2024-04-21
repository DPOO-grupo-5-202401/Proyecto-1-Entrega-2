package Presentacion;

import java.util.HashMap;
import java.util.Scanner;

import Logica.Administrador;
import Logica.Comprador;
import Logica.Galeria;
import Logica.Movimiento;
import Logica.Pieza;
import Logica.Subasta;


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
			System.out.println("2. Iniciar Subasta");
			System.out.println("3. ");
			System.out.println("4. ");
			System.out.println("5. ");
			op = sc.nextInt();
			try {
				if(op == 1) {
					crearCompradores(sc);
					System.out.println("Se han registrado 4 Compradores");
				}else if(op == 2) {
					iniciarSubasta(sc);
				}else if(op == 5) {
					
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
	
	
	//Iniciar Subasta
	private void iniciarSubasta(Scanner sc) throws Exception {
		
		HashMap compradoresValidados = new HashMap<String,Comprador>();
		for(String nombre : galeria.compradores.keySet()) {
			
		}
		this.usuarios.put(nuevoComprador.getNombre(),nuevoComprador);
		
		
		Subasta nuevaSubasta = this.administrador.iniciarSubasta(administrador,pieza,compradoresValidados);
		while (!nuevaSubasta.getFinalizada()) {

		}
	}
	
	
	
	public static void main(String[] args) {
		new Principal();
	}


}
