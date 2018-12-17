//
// 	Testumgebung(Versuchsanstalt) HTL f�r Schule
// 	Hier werden versuche an semtlichen Lebewesen innerhalb der �ffentlichen Einrichtung durchgef�hrt.
//
package uebung3_UML_Projekt;
import java.util.ArrayList;

public class HTL_main {

	public static void main(String[] args) {
		Schueler alex = new Schueler("Alex","Steger", "03-10-1999","alex.steger@htlstp.at", 2222, "stp","hauptstra�e", 11, 3011, 1, true, "01-09-2014");
		Schueler monika = new Schueler("Monika","Wandl", "05-09-1999","alex.steger@htlstp.at", 2222, "tullnerbach","hauptstra�e", 11, 3011, 2, true, "01-09-2014");
		
		Lehrer weigl = new Lehrer("Manuel","Weigl", "03-10-1999","alex.steger@htlstp.at", 2222, "stp","hauptstra�e", 11, 3011,"weig");
		Lehrer tillich = new Lehrer("Markus","Tillich", "03-10-1999","alex.steger@htlstp.at", 2222, "stp","hauptstra�e", 11, 3011,"weig");
		Nichtlehrpersonal hausmeister= new Nichtlehrpersonal("franz","tischler", "03-10-1999","alex.steger@htlstp.at", 2222, "stp","hauptstra�e", 11, 3011);
		
		monika.addadresse("Pressbaum", "Hauptstra�e", 6, 3021);
		
		System.out.println(weigl.getAnzahl());
		
		System.out.println(monika.getVorname() + " hat die Adresse/n:");
		for (Adresse a : monika.getAdressenliste()) {
			a.printAdresse();
		}
		
		Klassen a = new Klassen("5AHELS", 5);
		Klassen n = new Klassen("5BHELS", 5);
		
		a.addSchueler(alex);
		a.addSchueler(monika);
		a.setKlassensprecher(alex);
		
		for(Schueler s : a.getklasse())
		{
			System.out.println(s.getVorname());
		}
		System.out.println("Klassensprecher "+a.getKlassensprecher().getVorname());
		System.out.println(a.getS_anz());
		
	}
}


/*	Als Person und Mitarbeiter noch nicht abstract waren, wurde direkt mit Personen getestet ob die Assoziation und die 
 * 	addadresse funktion funktioniert, somit kann man schon beim instanzieren eine adresse angeben und nochmal im nachhinein eine weitere hinzuf�gen	
 * 
 * 
 * 		Person alex = new Person("Alex","Steger", "03-10-1999","alex.steger@htlstp.at", 2222, "stp","hauptstra�e", 11, 3011);
		alex.getAdressenliste().add(new Adresse( "stp2","hauptstra�e", 12, 3012));
		
		Person monika = new Person("Monika","Wandl", "05-09-1999","alex.steger@htlstp.at", 2222, "tullnerbach","hauptstra�e", 11, 3011);
		monika.addadresse("pressbaum","hauptstra�e", 12, 3012);
		
		for(Adresse a : monika.getAdressenliste())
		{
			a.printAdresse();
		}
		for(Adresse a : alex.getAdressenliste())
		{
			a.printAdresse();
		}
 * 
 */
