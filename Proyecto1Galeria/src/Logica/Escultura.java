package Logica;

public class Escultura extends Pieza {
	private double largo;
	private double ancho;
	private double alto;
	private boolean electricidad;

	//Getters
	public double getLargo() {
		return largo;
	}
	
	public double getAncho() {
		return ancho;
	}
	
	public double getAlto() {
		return alto;
	}
	
	public boolean getElectricidad() {
		return eletricidad;
	}
	
	
	
	public String getMaterial() {
		return material;
	}
	
	//Setters
	public void setLargo(double largo) {
		this.largo=largo;
	}
	
	public void setAncho(double ancho) {
		this.ancho=ancho;
	}
	
	public void setAlto(double alto) {
		this.alto=alto;
	}
	
	
	public void setElectricidad(boolean electricidad) {
		this.electricidad=electricidad;
	}
	
	
	public void setMaterial(String material) {
		this.material=material;
	}
	
	public Escultura(String id, String titulo,int año,String lugarDeCreacion,boolean enExhibicion, 
    		String FechaEntradaGaleria,String FechaSalidaGaleria,String EstadoActual,
    		boolean ValorFijo,int ValorInicial,int ValorMinimo,int Valor,Comprador DueñoActual,
    		double largo,double ancho,double alto,double peso,boolean electricidad,String observacion,Autor autor) {
		this.largo=largo;
		this.alto=alto;
		this.electricidad=electricidad;
		this.material=material;
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
