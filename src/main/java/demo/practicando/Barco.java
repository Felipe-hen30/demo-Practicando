package demo.practicando;

public class Barco {

	private String nombre = "titanic";
	private int inagurado = 1912;
	private Double velocidad = 38.9;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;

	}

	public void setInaguradoo(int inagurado) {
		this.inagurado = inagurado;
	}

	public int getInagurado() {
		return this.inagurado;

	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
		
	}

	public Double getVelocidad() {
		return this.velocidad;
	}
}
