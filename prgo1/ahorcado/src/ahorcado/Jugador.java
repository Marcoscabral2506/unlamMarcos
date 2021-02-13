package ahorcado;

public class Jugador {
	private String nombre;
	private String palabra;
	private int vidas;

	public Jugador(String nombre, String palabra) {
		this.nombre = nombre;
		this.palabra = palabra;
		this.vidas = 6;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getPalabra() {
		return this.palabra;
	}
	public void perderVidas() {
		this.vidas = vidas-1;
	}
	public int getVidas() {
		return this.vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
}
