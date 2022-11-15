/*
A més, dels/les pilots volen saber 
la seva alçada, el pes. El sou dels/les pilots és el sou base de les persones treballadores més 10.000 € 
per cada any d’antiguitat a l’escuderia, més 50.000 € de perillositat. 
*/
public class Pilot extends Treballador {
	private int altura;
	private int pes;
	
	//Constructor
	public Pilot(String nom, String cognom, int edat, int antiguitat, int altura, int pes) {
		super(nom, cognom, edat, antiguitat);
		this.altura = altura;
		this.pes = pes;
	}
	
	public int calculaSou() {
		int sou = super.souBase + super.antiguitat * 10000 + 50000;
		return sou;
	}

	@Override
	public String toString() {
		return super.toString() + "Pilot [altura=" + altura + ", pes=" + pes + ", calculaSou()=" + calculaSou() + "]";
	}

	
	
	
}
