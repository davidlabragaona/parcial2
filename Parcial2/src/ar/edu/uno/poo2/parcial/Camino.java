package ar.edu.uno.poo2.parcial;

public class Camino {
	private Isla origen;
	private Isla destino;
	private int tipo;
	
	public Camino(Isla origen, Isla destino, int tipo) {
		this.setIslaOrigen(origen);
		this.setIslaDestino(destino);
		this.setTipo(tipo);
	}
	
	private void setIslaOrigen(Isla origen) {
		this.origen = origen;
	}
	
	private void setIslaDestino(Isla destino) {
		this.destino = destino;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public int compareTo(Object o) {
		Camino camino = (Camino)o;        

		if(this.getTipo()==camino.getTipo()) {            
				return this.getTipo();
		} else {
			return camino.getTipo();
		}        

	}
	
}
