package Logica;

import java.util.HashMap;

public abstract class Pieza {
	protected String id;
    protected String titulo;
    protected int año;
    protected String lugarDeCreacion;
    protected boolean enExhibicion;
    protected String fechaEntradaGaleria;
    protected String fechaSalidaGaleria;
    protected String estadoActual;
    protected boolean valorFijo;
    protected int valorInicial;
    protected int valorMinimo;
    protected int valor;
    protected Comprador DueñoActual;
    protected HashMap<String, Autor> autor;
    
    

}
