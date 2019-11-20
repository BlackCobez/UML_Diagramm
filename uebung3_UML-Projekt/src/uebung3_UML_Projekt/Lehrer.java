package uebung3_UML_Projekt;

import java.util.ArrayList;

public class Lehrer extends Mitarbeiter{
	//Beziehung
	private Klassen meineklasse;
	private ArrayList<Fach> unterrichtet = new ArrayList<Fach>();
	
	//Variablen
	private	String kuerzel;
	
	//Konstruktor
	public Lehrer(String vorname, String nachname, String geburtsdatum, String email, long svnr,	//Von Person
			String ort,String strasse, Integer hausnummer, Integer plz, 							//Von Adresse Beziehung
			String kuerzel, Fach unterrichtet) {													//Klassenlokale variablen, es kann beim konstruieren nur ein fach gesetzt werden, da sonst bei einer Collection oder Array immer ein array übergeben werden müsste, so muss man nur mit der methode addfach alle weiteren fächer dazu adden
		super(vorname, nachname, geburtsdatum, email, svnr, ort, strasse, hausnummer, plz);			//Von übergeordneter Klasse
		
		this.kuerzel = kuerzel;	
		this.unterrichtet.add(unterrichtet);
	}
	
	//Methoden, GEtter und Setter
	public String getKuerzel() {
			return kuerzel;
		}

	public void exportStundenplan() {
		
	}

	public Klassen getMeineklasse() {
		return meineklasse;
	}

	public void setMeineklasse(Klassen meineklasse, Lehrer kv) { 	// Mit dieser Methode kann man von "beiden Seiten" Lehrer und Klassen den Kv setzen
		try {	
			this.meineklasse = meineklasse;
			meineklasse.setKv(kv,meineklasse);
			return;						// ist ein einfacher aber effektiver weg aus der methode "auszubrechen", damit sich die methoden nicht unendlich weiter aufrufen
		}catch(StackOverflowError i)
		{
			return;					// ist ein einfacher aber effektiver weg aus der methode "auszubrechen", damit sich die methoden nicht unendlich weiter aufrufen
		}
	}

	public ArrayList<Fach> getUnterrichtet() {
		return unterrichtet;
	}

	public void setUnterrichtet(ArrayList<Fach> unterrichtet) {
		this.unterrichtet = unterrichtet;
	}
	
	public void addfach(Fach unterrichtet)
	{
		this.unterrichtet.add(unterrichtet);
	}
}

