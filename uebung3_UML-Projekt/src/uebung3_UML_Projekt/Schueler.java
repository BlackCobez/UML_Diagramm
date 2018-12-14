package uebung3_UML_Projekt;

import java.util.Date;

public class Schueler extends Person{
	//Beziehung
	private Klassen klasse;

	//Variablen
	private int katalognummer;
	private boolean eigenberechtigt;
	private String eintrittsdatum;
	
	//Konstruktor
	public Schueler(String vorname, String nachname, String geburtsdatum, String email, long svnr, 	// Person
			String ort, String strasse, Integer hausnummer, Integer plz, 				// Von Adresse Beziehung
			int katalognummer, boolean eigenberechtigt, String eintrittsdatum) {		// Schueler innterne Variablen
		
		super(vorname, nachname, geburtsdatum, email, svnr, ort, strasse, hausnummer, plz);		//von übergerordneter Klasse
		this.katalognummer = katalognummer;
		this.eigenberechtigt = eigenberechtigt;
		this.eintrittsdatum = eintrittsdatum;
	}
	
	//Methoden, getter und setter
	public int getKatalognummer() {
		return katalognummer;
	}
	public boolean isEigenberechtigt() {
		return eigenberechtigt;
	}
	
	public String getEintrittsdatum() {
		return eintrittsdatum;
	}

}
