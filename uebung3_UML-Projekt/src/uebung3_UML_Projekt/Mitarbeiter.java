package uebung3_UML_Projekt;

public abstract class Mitarbeiter extends Person{
	//Beziehung
	
	//Variablen
	private static int anzahl = 0;
	
	//KOnstruktor
	public Mitarbeiter(String vorname, String nachname, String geburtsdatum, String email, long svnr, String ort,String strasse, Integer hausnummer, Integer plz) {
		super(vorname, nachname, geburtsdatum, email, svnr, ort, strasse, hausnummer, plz);
		anzahl ++;
	}
	
	//Methoden, getter und setter
	public int getAnzahl() {
		return anzahl;
	}
}
