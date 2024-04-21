package Presentacion;

import java.util.HashMap;
import java.util.Scanner;

import Logica.Administrador;
import Logica.Comprador;
import Logica.Galeria;
import Logica.Movimiento;
import Logica.Pieza;


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
			System.out.println("1. Iniciar Subasta");
			System.out.println("2. ");
			System.out.println("3. ");
			System.out.println("4. ");
			System.out.println("5. ");
			op = sc.nextInt();
			try {
				if(op == 1) {
					iniciarSubasta(sc);
				}else if(op == 2) {
					
				}else if(op == 5) {
					
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
			
		}while(op != 0);
		sc.close();
	}

	private void iniciarSubasta(Scanner sc) throws Exception {
		System.out.println("Digite id del evento");
		int id = sc.nextInt();
		System.out.println("Digite nombre del evento");
		String nombre = sc.next();

		
		//this.administrador.iniciarSubasta(fecha,pujaActual,compradorFinal, administrador, pieza,compradoresValidados);
	}
	
	public static void main(String[] args) {
		new Principal();
	}


}
