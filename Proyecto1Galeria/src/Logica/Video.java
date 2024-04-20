package Logica;

public class Video extends Pieza {
	private int resolucion;
	private int duracion;
	
	
	public int getResolucion() {
    	return resolucion;
    }
	
	public int getDuracion() {
    	return duracion;
    }
	
	public void setResolucion(int resolucion) {
    	this.resolucion= resolucion;
    }
	
	public void setDuracion(int duracion) {
    	this.duracion= duracion;
    }
	public Video(String id, String titulo,int año,String lugarDeCreacion,boolean enExhibicion, 
    		String FechaEntradaGaleria,String FechaSalidaGaleria,String EstadoActual,
    		boolean ValorFijo,int ValorInicial,int ValorMinimo,int Valor,Comprador DueñoActual,
    		double peso, String observacion, int resolucion, int duracion) {
		
		super(id);
		super(titulo);
		super(lugarDeCreacion);
		super(enExhibicion);
		super(FechaEntradaGaleria);
		super(FechaSalidaGaleria);
		super(EstadoActual);
		super(getValorFijo);
		super(ValorInicial);
		super(ValorMinimo);
		super(Valor);
		super(DueñoActual);
		super(peso);
		super(observacion);
		
		this.resolucion= resolucion;
		this.duracion= duracion;
	}
	

}
