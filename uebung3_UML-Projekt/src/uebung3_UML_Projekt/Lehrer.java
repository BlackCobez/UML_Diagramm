package uebung3_UML_Projekt;

public class Lehrer extends Mitarbeiter{
	//Beziehung
	
	//Variablen
	private	String kuerzel;
	
	//Konstruktor
	public Lehrer(String vorname, String nachname, String geburtsdatum, String email, long svnr,	//Von Person
			String ort,String strasse, Integer hausnummer, Integer plz, String kuerzel) {		//Von Adresse Beziehung
		super(vorname, nachname, geburtsdatum, email, svnr, ort, strasse, hausnummer, plz);		//Von übergeordneter Klasse
		this.kuerzel = kuerzel;																	//Klassen interne variable
	}
	
	//Methoden, GEtter und Setter
	public String getKuerzel() {
			return kuerzel;
		}

	public void exportStundenplan() {
		
	}
}

