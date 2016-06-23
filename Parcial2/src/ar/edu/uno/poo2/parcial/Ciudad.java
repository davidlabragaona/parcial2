package ar.edu.uno.poo2.parcial;

public class Ciudad {
	
	private Integer[][] matrizAdyacencia;
	private Integer dimension;
    
    	public Ciudad(Integer dimension){
        	setDimension(dimension);
	        this.matrizAdyacencia = new Integer[dimension][dimension];
        	for(int i=0;i<dimension;i++){
        	   for(int j=0; j<dimension;j++){
        	        this.matrizAdyacencia[i][j]=2;
        	   }
		}
	  }
    
    
	  public void agregarCamino(int origen, int destino, int tipo){
		  this.matrizAdyacencia[origen][destino]=tipo;
		  this.matrizAdyacencia[destino][origen]=tipo;
	    }
    
    
	public Ciudad(int [][] matriz) {
		
		//Creamos vectores para el grafo terminado
		int prim[] = new int[matriz.length];
		//y le asignamos pesos a las claves
		int key[] = new int[matriz.length];
		
		//para saber que vertice está incluído
		boolean mstSet[] = new boolean[matriz.length];
		
		
		
		
		
		
		
	}
	

}
