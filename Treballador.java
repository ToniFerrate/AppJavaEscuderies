
/*
De les persones treballadores de les diferents escuderies volen saber el nom, el primer cognom, l’edat, 
el temps que porten a l’escuderia i el sou. El sou base és de 50.000 €. 
*/
public class Treballador {
	protected String nom;
	protected String cognom;
	protected int edat;
	protected int antiguitat;
	protected final int souBase;
	
	//Constructor
	public Treballador(String nom, String cognom, int edat, int antiguitat) {
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
		this.antiguitat = antiguitat;
		souBase = 50000;
	}

	@Override
	public String toString() {
		return "Treballador [nom=" + nom + ", cognom=" + cognom + ", edat=" + edat + ", antiguitat=" + antiguitat + "]";
	}

	
	
	
	
}
