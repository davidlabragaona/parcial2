package ar.edu.uno.poo2.parcial;

public class Isla {
	
	private String nombre;
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Isla(String nombre) {
		this.setNombre(nombre);
	}

}
