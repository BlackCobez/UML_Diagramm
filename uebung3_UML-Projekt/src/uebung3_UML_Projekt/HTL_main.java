//
// 	Testumgebung(Versuchsanstalt) HTL f�r Schule
// 	Hier werden versuche an semtlichen Lebewesen innerhalb der �ffentlichen Einrichtung durchgef�hrt.
//
package uebung3_UML_Projekt;

import java.util.ArrayList;

public class HTL_main {

	public static void main(String[] args) {
		//Testdurchlauf f�r die Beziehung von einer Adresse zu mehreren Personen
		/*
		 * Jede Person hat sehr wahrscheinlich eine andere Adresse f�r den spezialfall Schule
		 * Doch f�r die Praxis gillt, mehrere Personen k�nnen ein und dieselbe Adresse haben
		 * Hier ist es so gel�st, das eine adresse immer mind. eine Person braucht (w�rde sonst keinen sinn machen)
		 */
		ArrayList<Person> pers = new ArrayList<Person>();
		Person tillich = new Person("tillich");
		Person k = new Person("gro�er K");
		Person crha = new Person("CRHA");
		
		pers.add(tillich);
		pers.add(crha);
		pers.add(k);
		

		Adresse stp = new Adresse("St.P�lten", pers);

		
		for(Person p : stp.getpersonenliste())
		{
			System.out.println(p.getVorname() +" hat die Adresse: "+ stp.getOrt());
		}
		
		//Adresse
		Adresse adresse = new Adresse("Waldstra�e");
		//Abteilung
		Abteilung el = new Abteilung("Elektronik");
		Abteilung et = new Abteilung("Elektrotechnik");
		Abteilung wir = new Abteilung("Wirtschaft");
		Abteilung ma = new Abteilung("Maschienenbau");
		Abteilung in = new Abteilung("Informatik");
		
	}

}
