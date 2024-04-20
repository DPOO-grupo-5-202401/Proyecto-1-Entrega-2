package Logica;

public class Pintura extends Pieza{
	private String tecnica;
	private String estilo;
	private int altura;
	private int ancho;
	
	public String getTecnica() {
		return tecnica;
	}
	public String getEstilo() {
		return estilo;
	}
	public int getAltura() {
		return altura;
	}
	public int getAncho() {
		return ancho;
	}
	
	public void setResolucion(String tecnica) {
    	this.tecnica= tecnica;
    }
	
	public void setEstilo(String estilo) {
    	this.estilo= estilo;
    }
	
	public void setAncho(int ancho) {
    	this.ancho= ancho;
    }
	
	public void setAltura(int altura) {
    	this.altura= altura;
    }
	
	public Pintura(String id, String titulo,int año,String lugarDeCreacion,boolean enExhibicion, 
    		String FechaEntradaGaleria,String FechaSalidaGaleria,String EstadoActual,
    		boolean ValorFijo,int ValorInicial,int ValorMinimo,int Valor,Comprador DueñoActual,
    		double peso, String observacion, int altura, String tecnica, int ancho, String estilo,Autor autor) {
		this.tecnica= tecnica;
		this.estilo= estilo;
		this.ancho= ancho;
		this.altura= altura;
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
