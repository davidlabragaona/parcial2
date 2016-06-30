package ar.edu.uno.poo2.parcial;

public class Camino {
	private Isla origen;
	private Isla destino;
	
	public Camino(Isla origen, Isla destino) {
		this.setIslaOrigen(origen);
		this.setIslaDestino(destino);
	}
	
	private void setIslaOrigen(Isla origen) {
		this.origen = origen;
	}
	
	private void setIslaDestino(Isla destino) {
		this.destino = destino;
	}
	
}
