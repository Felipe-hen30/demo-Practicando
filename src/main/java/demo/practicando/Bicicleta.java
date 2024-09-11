package demo.practicando;

public class Bicicleta {

	private String nombre;
	private int puestos;
	private Double velocidadMaximaEnDescenso;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public int getPuestos() {
		return this.puestos;

	}

	public void setVelocidadMaximaEnDescenso(Double velocidadMaximaEnDescenso) {
		this.velocidadMaximaEnDescenso = velocidadMaximaEnDescenso;
		

	}

	public Double getVelocidadMaximaEnDescenso() {
		return this.velocidadMaximaEnDescenso;
	}
	
}
