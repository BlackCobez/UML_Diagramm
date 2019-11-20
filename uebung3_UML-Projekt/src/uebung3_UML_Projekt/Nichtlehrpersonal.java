package uebung3_UML_Projekt;

public class Nichtlehrpersonal extends Mitarbeiter{
	//Beziehung

	//Variablen
	public static String nichtlehrperson = "Wichtige Aufgaben zu erledigen (Kaffee trinken)";
	
	//Konstruktor
	public Nichtlehrpersonal(String vorname, String nachname, String geburtsdatum, String email, long svnr, 
			String ort, String strasse, Integer hausnummer, Integer plz) {									//Von Adresse Beziehung
		
		super(vorname, nachname, geburtsdatum, email, svnr, ort, strasse, hausnummer, plz);
		
	}
	
	
	//Methoden, getter und setter
}
