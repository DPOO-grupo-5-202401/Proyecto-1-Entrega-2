package Logica;

public class Fotografia extends Pieza{
	private int resolucion;
	private String tipo;
	
	public int getResolucion() {
    	return resolucion;
    }
	public String getTipo() {
		return tipo;
	}
	
	public void setResolucion(int resolucion) {
    	this.resolucion= resolucion;
    }
	
	public void setTipo(String tipo) {
    	this.tipo= tipo;
    }
	
	
	
	public Fotografia(String id, String titulo,int año,String lugarDeCreacion,boolean enExhibicion, 
    		String FechaEntradaGaleria,String FechaSalidaGaleria,String EstadoActual,
    		boolean ValorFijo,int ValorInicial,int ValorMinimo,int Valor,Comprador DueñoActual,
    		double peso, int resolucion,String observacion, String tipo,Autor autor) {
		this.resolucion=resolucion;
		this.tipo=tipo;
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
		super(autor);

		
	}
	
	
	

}
