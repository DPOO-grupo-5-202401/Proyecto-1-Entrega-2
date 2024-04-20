package Logica;

import java.util.HashMap;

public class Comprador extends Usuario{
    private int numeroDeContacto;
    private int valorMaximoCompras;
    private boolean esPropietario;
    private HashMap<String, Pieza> piezasCompradas;
    private HashMap<String, Oferta> ofertas;
    private HashMap<String, Compra> compras;
    private HashMap<String, Pieza> piezasqueHaTenido;
    

}
