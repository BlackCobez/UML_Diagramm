//
// 	Testumgebung(Versuchsanstalt) HTL für Schule
// 	Hier werden versuche an semtlichen Lebewesen innerhalb der öffentlichen Einrichtung durchgeführt.
//
package uebung3_UML_Projekt;
import java.util.ArrayList;

public class HTL_main {

	public static void main(String[] args){
		ArrayList<Klassen> klassenliste = new ArrayList<Klassen>();
		
		Adresse wald = new Adresse("stp", "waldstraße", 3, 3011);
		
		Schueler alex = new Schueler("Alex","Steger", "03-10-1999","alex.steger@htlstp.at", 2222, "stp","hauptstraße", 11, 3011, 1, true, "01-09-2014");				//Instanzierung Schueler
		Schueler monika = new Schueler("Monika","Wandl", "05-09-1999","alex.steger@htlstp.at", 2222, "tullnerbach","hauptstraße", 11, 3011, 2, true, "01-09-2014");		
		
		Fach hwe = new Fach("Hardware-Entwicklung", 6, "KLASSENZIMMER");	//Instanzierung Fach
		Fach labor = new Fach("Labor", 4 , "LABORRAUM");				
		
		Lehrer weigl = new Lehrer("Manuel","Weigl", "03-10-1999","alex.steger@htlstp.at", 2222, "stp","hauptstraße", 11, 3011,"weig", hwe);			//Instanzierung Lehrer
		Lehrer tillich = new Lehrer("Markus","Tillich", "03-10-1999","alex.steger@htlstp.at", 2222, "stp","hauptstraße", 11, 3011,"till", hwe);
		Lehrer steger = new Lehrer("Gottfried","Steger", "17-1-1999","gottfried.steger@htlstp.at", 2222, "stp","hauptstraße", 11, 3011,"steg", labor);	
				
		Schule htl = new Schule("HTBLuVA", "Techinische Schule", 42, wald, monika, tillich);
	
		Raum klassevon5AHELS = new Raum("2",32,"KLASSENZIMMER");
		Raum klassevon5BHELS = new Raum("3",32,"KLASSENZIMMER");
		Klassen a = new Klassen("5AHELS", 5, klassevon5AHELS);			// Instanzierung von Klassen
		Klassen n = new Klassen("5BHELS", 5, klassevon5BHELS);
		klassenliste.add(a);
		klassenliste.add(n);
		
		Abteilung el = htl.addAbteilung("el", "Elektronik", htl, alex, tillich,  klassenliste);			
		Abteilung mb = htl.addAbteilung("mb", "Maschienenbau", htl, monika, weigl,  klassenliste);
		el.addLehrer(tillich);
		el.addLehrer(weigl);
		mb.addLehrer(steger);
		
		

		
		Nichtlehrpersonal hausmeister= new Nichtlehrpersonal("franz","tischler", "03-10-1999","franz.tischler@htlstp.at", 2222, "stp","hauptstraße", 11, 3011);	//Instanzieung NichtLehrPersonal
		htl.addPersonal(hausmeister);
		

		
		System.out.println("Status von Nichtlehrern/Lehrern: " + Nichtlehrpersonal.nichtlehrperson);		//Status von Beschäftigten in der Schule
		
		System.out.println("Personal: "+ weigl.getAnzahl());												//Anzahl der Mitarbeiter in der Schule
		
		monika.addadresse("Pressbaum", "Hauptstraße", 6, 3021);												//Adresse einer Person hinzugefügt
		
		System.out.println(monika.getVorname() + " hat die Adresse/n:");									//Ausgabe von nun zwei Adressen
		for (Adresse g : monika.getAdressenliste()) {
			g.printAdresse();
		}
		
		a.addSchueler(alex);							//Schueler der Klasse a hinzugefügt
		a.addSchueler(monika);
		
		System.out.println("\nSchüler der Klasse: " + a.getBezeichnung());		//Ausgabe der Schüler der Klasse a
		for(Schueler s : a.getklasse())
		{
			System.out.println(s.getVorname());
		}
		
		a.setKlassensprecher(alex);						//Klassensprecher gesetzt
		
		System.out.println("\nKlassensprecher = "+a.getKlassensprecher().getVorname());			//Klassensprecherausgabe
		
		//a.setKv(tillich, a);
		tillich.setMeineklasse(a, tillich); //set Kv macht das selbe 
		tillich.addfach(labor);
		System.out.print("Klassenvorstand: " + a.getKv().getNachname() + " unterrichtet:\n");
		for (Fach t : tillich.getUnterrichtet()) 
		{ 
				System.out.println(t.getName());
		}
		
		a.addfach(hwe);				//Klassenfächer hinzugefügt
		a.addfach(labor);
		
		System.out.println("\nFächer der " + a.getBezeichnung()+":");
		for(Fach k : a.getFaecher())			//Ausgabe von Fächern einer Klasse
		{
			System.out.println(k.getName());
		} 
		
		Raum laborraum = new Raum("1",19,"LABORRAUM");
		laborraum.addRaumverwendung(hwe);
		laborraum.addRaumverwendung(labor);
		
		System.out.println("\nRaum wird verwendet für die Fächer:");
		for(Fach r : laborraum.getRaumverwendung())			//Ausgabe von Fächern einer Klasse
		{
			System.out.println(r.getName());
		}
		
		System.out.println("Stammklasse von "+a.getBezeichnung()+" ist Raum Nummer "+a.getStammklasse().getRaumNummer());
		
		//Daten Schule: Name, Schultyp, Schulkennzahl, standort schulsprecher direktor
		System.out.println("\nSchulname: " +htl.getName());
		System.out.println("Schultyp: " +htl.getSchultyp());
		System.out.println("Schulkennzahl: " +htl.getSchulkennzahl());
		System.out.println("Adresse: " + wald.getStrasse() + " " + wald.getHausnummer() + " " + wald.getOrt() + " " + wald.getPlz());
		System.out.println("Schulsprecher: " + htl.getSchulsprecher().getVorname());
		System.out.println("Direktor: " +htl.getDirektor().getNachname());
		
		//Abteilungsvorstand
		System.out.println("\n Abteilungsvorstand MB:" + mb.getAbteilungsvorstand().getNachname());
		el.setAbteilungsvorstand(tillich);
		System.out.println(" Abteilungsvorstand EL:" + el.getAbteilungsvorstand().getNachname());
		
		//Alle Mitarbeiter
		System.out.println("\n Alle Mitarbeiter: ");		
		for(Mitarbeiter m : htl.getPersonal())
		{
			System.out.println(m.getNachname() + " " + m.getVorname() +" "+m.getGeburtsdatum()+" "+ m.getEmail()+" "+ m.getSvnr());
			for(Adresse adr : m.getAdressenliste()) {
				System.out.println(adr.getOrt()+" "+adr.getPlz()+" "+ adr.getStrasse()+" "+ adr.getHausnummer());
				
			}
		}
		//Daten Abteilung: Name, kuerzel, Schule, Abteilungssprecher, klassen 
		System.out.println("\nMögliche Abteilungen:" + el.getName()+ " " + el.getKuerzel()+ " und " + mb.getName()+ " " + mb.getKuerzel()+ " in der Schule "+ htl.getName());
		System.out.println("Abteilungssprecher in " + el.getName()+ ":" + el.getAbteilungssprecher().getVorname());
		System.out.println("Abteilungssprecher in " + mb.getName()+ ":" + mb.getAbteilungssprecher().getVorname());
		
		System.out.println("\n Klassen in" + mb.getName());		//Ausgabe der KLassen in mb 
		for(Klassen k : mb.getKlassenliste())
		{
			System.out.println(k.getBezeichnung());
		}
		System.out.println("\n Klassen in" + el.getName());		//Ausgabe der KLassen in el
		for(Klassen k : el.getKlassenliste())
		{
			System.out.println(k.getBezeichnung());
		}
		//unterrichtende Lehrer Lehrer
		System.out.println("\nUnterrichtende Lehrer in " + mb.getName());		//Ausgabe der Lehrer mb
		for(Lehrer l : mb.getLehrerliste())
		{
			System.out.println(l.getNachname());
		}
		System.out.println("Unterrichtende Lehrer in " + el.getName());		//Ausgabe der Lehrer el
		for(Lehrer l : el.getLehrerliste())
		{
			System.out.println(l.getNachname());
		}
	}
}
