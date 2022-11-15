import java.util.ArrayList;

/*
Volen saber de cada escuderia 
que participa en el campionat, el nom, el pressupost que tenen i el país d’origen.
*/

public class Escuderia {
	private String nom;
	private String pais;
	private int pressupost;
	private ArrayList<Cotxe> llistaCotxes;
	private ArrayList<Treballador> llistaTreballadors;
	


	public Escuderia(String nom, String pais, int pressupost) {
		this.nom = nom;
		this.pais = pais;
		this.pressupost = pressupost;
		this.llistaCotxes = new ArrayList<Cotxe>();
		this.llistaTreballadors = new ArrayList<Treballador>();
	}
	
	

	public String getNom() {
		return nom;
	}

	//Afegeig un treballador a la llista
	public void addTreballador(Treballador treballador) {
		llistaTreballadors.add(treballador);
	}
	
	//Afegeix un cotxe a la llista
	public void addCotxe(Cotxe cotxe) {
		llistaCotxes.add(cotxe);
	}

	//Elimina un treballador de la llista (el busca pel nom)
	public void removeTreballador(String nom) {
		int i = getIndex(nom);
		if (i >= 0) {
			llistaTreballadors.remove(i);
		}
	}
	
	//Retorna l'index d'un treballador de la llista de treballadors
	public int getIndex(String nom) {
		int i=0, index;
		while (i < llistaTreballadors.size() && !llistaTreballadors.get(i).nom.equalsIgnoreCase(nom)) {
			i++;
		}
		if (i >= llistaTreballadors.size()) {
			System.out.println("Treballador '" + nom + "' no trobat");
			index = -1;
		} else {
			index = i;
		}
		return index;
	}
	
	public void listCotxes() {
		System.out.println("********* Llistat de cotxes (" + nom + ") **********");
		for(int i = 0 ; i<llistaCotxes.size(); i++) {
			System.out.println(llistaCotxes.get(i));		
		}
	}
	
	public void listTreballadors() {
		System.out.println("********* Llistat de treballadors (" + nom + ") **********");
		for(int i = 0 ; i<llistaTreballadors.size(); i++) {
			System.out.println(llistaTreballadors.get(i));		
		}
	}


	@Override
	public String toString() {
		return "Escuderia [nom=" + nom + ", pais=" + pais + ", pressupost=" + pressupost + "]";
	}
	
	
	
}
