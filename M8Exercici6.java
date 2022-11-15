import java.util.ArrayList;
import java.util.Scanner;

/*
L'organització d’un campionat de cotxes vol tenir un programa per gestionar part de la informació que 
fins ara no tenien informatitzada.
 
Es demana que l’aplicació sigui capaç de donar d’alta, de baixa i de veure pilots i mecànics, i de veure escuderies i bòlids. 
Les escuderies i els bòlids poden estar introduïts directament en el codi.
 */
public class M8Exercici6 {
	static ArrayList<Escuderia> llistaEscuderies = new ArrayList<Escuderia>();
		
	public static void main(String[] args) {
		Pilot pilot;
		Mecanic mecanic;
		int operacio, i;
		
		inicialitzaEscuderies();

		do {
			mostraMenu(); //Presenta menu
			operacio = getInt("Introdueix una opcio de Menu: ");
			switch (operacio) {
				case 0: //0.- Sortir de l'aplicació
					break;
					
				case 1: //1.- Crear pilot d'una escuderia.
					pilot = new Pilot(getString("Nom del pilot? "), getString("Cognom del Pilot? "), getInt("Edat del pilot? "), getInt("Anys antiguitat del pilot? "), getInt("Altura del Pilot? "), getInt("Pes del pilot? "));
					guardaTreballador(pilot, getString("Escuderia del pilot? "));
					break;
					
				case 2: //2.- Crear mecanic d'una escuderia.
					mecanic = new Mecanic(getString("Nom del mecanic? "), getString("Cognom del mecanic? "), getInt("Edat del mecanic? "), getInt("Anys antiguitat del mecanic? "), getBoolean("Estudis superiors (S o N)? "));
					guardaTreballador(mecanic, getString("Escuderia del mecanic? "));
					break;
					
				case 3: //3.- Eliminar treballador.
					eliminaTreballador();
					break;
					
				case 4: //4.- Llistar escuderies.
					listEscuderies();
					break;
					
				case 5: //5.- Llistar cotxes d'una escuderia
					i = getIndex(getString("Nom de l'escuderia? "));
					if (i != -1) {
						llistaEscuderies.get(i).listCotxes();
					}
					break;
					
				case 6: //6.- Llistar treballadors d'una escuderia
					i = getIndex(getString("Nom de l'escuderia? "));
					if (i != -1) {
						llistaEscuderies.get(i).listTreballadors();
					}
					break;
					
				default:
					System.out.println("Operació incorrecta");
			}
		} while (operacio !=0 );

	}
	
	static void inicialitzaEscuderies() {
		Escuderia escuderia;
		
		//Escuderia 1
		escuderia = new Escuderia("Ferrari", "Italia", 200000);
		escuderia.addCotxe(new Cotxe(200, 280, "vermell", 40000));
		escuderia.addCotxe(new Cotxe(220, 300, "blau", 45000));
		escuderia.addCotxe(new Cotxe(190, 270, "blau", 37500));
		llistaEscuderies.add(escuderia);
			
		//Escuderia 2
		escuderia = new Escuderia("Renault", "França", 250000);
		escuderia.addCotxe(new Cotxe(180, 285, "groc", 30000));
		escuderia.addCotxe(new Cotxe(210, 290, "verd", 42000));
		llistaEscuderies.add(escuderia);
		
		//Escuderia 3
		escuderia = new Escuderia("Porsche", "Alemanya", 275000);
		escuderia.addCotxe(new Cotxe(207, 280, "blanc", 38000));
		llistaEscuderies.add(escuderia);
	}
	
	static int getInt(String print) {
		Scanner input=new Scanner(System.in);
		System.out.print(print);
		return input.nextInt();
	}
	
	static String getString(String print) {
		Scanner input=new Scanner(System.in);
		System.out.print(print);
		return input.nextLine();
	}
	
	static boolean getBoolean(String print) {
		Scanner input=new Scanner(System.in);
		System.out.print(print);
		return input.nextLine().equalsIgnoreCase("S");
	}
	
	// Mostra el menú
	static void mostraMenu() {
		System.out.println("0.- Sortir de l'aplicacio.");
		System.out.println("1.- Crear Pilot.");
		System.out.println("2.- Crear Mecanic.");
		System.out.println("3.- Eliminar treballador.");
		System.out.println("4.- Llistar escuderies.");
		System.out.println("5.- Llistar cotxes d'una escuderia.");
		System.out.println("6.- Llistar treballadors d'una escuderia.");
	}
	
	//Guarda (crea) un treballador en una escuderia
	static void guardaTreballador(Treballador treballador, String nomEscuderia) {
		int i = getIndex(nomEscuderia);
		if (i >= 0) {
			llistaEscuderies.get(i).addTreballador(treballador);
		}
	}
	
	//Elimina un treballador (mecànic o pilot) d'una escuderia
	static void eliminaTreballador() {
		int i = getIndex(getString("Escuderia del treballador a eliminar? "));
		if (i != -1) {
			llistaEscuderies.get(i).removeTreballador(getString("Nom del treballador a eliminar? "));
		}
	}
	
	//Retorna l'index d'una escuderia si existeix i sinó retorna -1
	static int getIndex(String nom) {
		int i=0, index;
		while (i < llistaEscuderies.size() && !llistaEscuderies.get(i).getNom().equalsIgnoreCase(nom)) {
			i++;
		}
		if (i >= llistaEscuderies.size()) {
			System.out.println("Escuderia '" + nom + "' no trobat");
			index = -1;
		} else {
			index = i;
		}
		return index;
	}
	
	//Mostra un llistat de totes les escuderies
	static void listEscuderies() {
		System.out.println("********* Llistat d'escuderies **********");
		for(int i = 0 ; i<llistaEscuderies.size(); i++) {
			System.out.println(llistaEscuderies.get(i));		
		}
	}
	

}
