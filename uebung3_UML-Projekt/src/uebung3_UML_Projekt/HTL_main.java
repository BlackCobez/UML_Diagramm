//
// 	Testumgebung(Versuchsanstalt) HTL für Schule
// 	Hier werden versuche an semtlichen Lebewesen innerhalb der öffentlichen Einrichtung durchgeführt.
//
package uebung3_UML_Projekt;

import java.util.ArrayList;

public class HTL_main {

	public static void main(String[] args) {
		//Testdurchlauf für die Beziehung von einer Adresse zu mehreren Personen
		/*
		 * Jede Person hat sehr wahrscheinlich eine andere Adresse für den spezialfall Schule
		 * Doch für die Praxis gillt, mehrere Personen können ein und dieselbe Adresse haben
		 * Hier ist es so gelöst, das eine adresse immer mind. eine Person braucht (würde sonst keinen sinn machen)
		 */
		ArrayList<Person> pers = new ArrayList<Person>();
		Person tillich = new Person("tillich");
		Person k = new Person("großer K");
		Person crha = new Person("CRHA");
		
		pers.add(tillich);
		pers.add(crha);
		pers.add(k);
		

		Adresse stp = new Adresse("St.Pölten", pers);

		
		for(Person p : stp.getpersonenliste())
		{
			System.out.println(p.getVorname() +" hat die Adresse: "+ stp.getOrt());
		}
		
		//Adresse
		Adresse adresse = new Adresse("Waldstraße");
		//Abteilung
		Abteilung el = new Abteilung("Elektronik");
		Abteilung et = new Abteilung("Elektrotechnik");
		Abteilung wir = new Abteilung("Wirtschaft");
		Abteilung ma = new Abteilung("Maschienenbau");
		Abteilung in = new Abteilung("Informatik");
		
	}

}
