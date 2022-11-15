
/*
 * Cada escuderia pot tenir més d’un cotxe i de cadascun volen saber la potència, la velocitat màxima, 
 * el color i el preu de mercat. 
 */

public class Cotxe {
	private int potencia;
	private int velocitatMaxima;
	private String color;
	private int preu;
	
	//Constructor
	public Cotxe(int potencia, int velocitatMaxima, String color, int preu) {
		this.potencia = potencia;
		this.velocitatMaxima = velocitatMaxima;
		this.color = color;
		this.preu = preu;
	}


	@Override
	public String toString() {
		return "Cotxe [potencia=" + potencia + ", velocitatMaxima=" + velocitatMaxima + ", color=" + color + ", preu="
				+ preu + "]";
	}

	
}
