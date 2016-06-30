package ar.edu.uno.poo2.parcial;

import java.util.*;

public class Ciudad {
	
	private Integer[][] matrizAdyacencia;
	private Integer dimension;
	List<Camino> caminos;
    
	public Ciudad(Integer dimension) {
    	setDimension(dimension);
    	caminos = new ArrayList<Camino>(dimension);
        this.matrizAdyacencia = new Integer[dimension][dimension];
    	for(int i=0;i<dimension;i++)
			this.matrizAdyacencia[i][i]=2;
	}
    
	public void agregarCamino(int origen, int destino, int tipo) throws Exception {
		if (origen > this.dimension)
			throw new Exception("El índice de origen es mayor que la cantidad de islas");
		if (destino > this.dimension)
			throw new Exception("El índice de destino es mayor que la cantidad de islas");
		this.matrizAdyacencia[origen][destino] = tipo;
		this.matrizAdyacencia[destino][origen] = tipo;
		Isla ori = new Isla("Isla" + origen);
		Isla dest = new Isla("Isla" + destino);
		Camino c = new Camino(ori, dest);
		caminos.add(c);
	}
    
	/*public Ciudad(int [][] matriz) {
		setDimension(dimension);
        this.matrizAdyacencia = new Integer[dimension][dimension];
    	for(int i=0;i<dimension;i++)
			this.matrizAdyacencia[i][i]=2;
	}*/
	
	public void setDimension(Integer d) {
		this.dimension=d;
    }
}