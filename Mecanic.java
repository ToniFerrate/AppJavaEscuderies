
/*
Dels/les mecànics volen saber si tenen estudis superiors de mecànica o no. I el seu sou es calcula sumant 
10.000 € per cada any d’antiguitat a l’escuderia més el sou base.
*/

public class Mecanic extends Treballador {
	boolean estudisSuperiors;
	
	//Constructor
	public Mecanic(String nom, String cognom, int edat, int antiguitat, boolean estudisSuperiors) {
		super(nom, cognom, edat, antiguitat);
		this.estudisSuperiors = estudisSuperiors;
	}
	
	public int calculaSou() {
		int sou = super.souBase + super.antiguitat * 10000;
		return sou;
	}

	@Override
	public String toString() {
		return super.toString() + "Mecanic [estudisSuperiors=" + estudisSuperiors + ", calculaSou()=" + calculaSou() + "]";
	}


	
	
}