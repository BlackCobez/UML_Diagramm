package uebung3_UML_Projekt;

import java.util.ArrayList;

public class Abteilung {
	//Beziehungen
	private ArrayList<Schueler> schuelerliste = new ArrayList<Schueler>();
	private ArrayList<Klassen> klassenliste = new ArrayList<Klassen>();
	private ArrayList<Lehrer> lehrerliste = new ArrayList<Lehrer>();
	private Schule schule;
	private Schueler abteilungssprecher;
	private Lehrer abteilungsvorstand;
	 
	//Variablen
	private String kuerzel;
	private String name;
 

	
	//Konstruktor
	public Abteilung (String kuerzel, String name, Schule schule, Schueler abteilungssprecher, Lehrer abteilungsvorstand , ArrayList<Klassen> klassenliste) {				//Jedes mal bei Abteilung erstellen MUSS eine Shcule dabei sein
		this.kuerzel = kuerzel;
		this.name = name;
		this.schule = schule;									//Abteilung MUSS eine Shcule haben, passiert aber nicts damit
		this.setAbteilungssprecher(abteilungssprecher);			//Abteilung hat genau einen Abteilungssprecher
		this.setKlassenliste(klassenliste);
		this.setAbteilungsvorstand(abteilungsvorstand);
	}

	
	
	
	//Methoden, getter und setter
	public String getName() {
		return name;
	}
	
	public String getKuerzel() {
		return kuerzel;
	}
	
	public ArrayList<Schueler> getSchuelerliste() {			//ArrayList<Schueler> 
		return schuelerliste;
	} 
	
	public boolean addLehrer (Lehrer l) {
		lehrerliste.add(l);
		return true;
	}
	
	public boolean setAbteilungsvorstand(Lehrer l) {
		this.abteilungsvorstand = l;
		return true;
	}

	public ArrayList<Lehrer> getLehrerliste() {
		return lehrerliste;
	}

	public void setLehrerliste(ArrayList<Lehrer> lehrerliste) {
		this.lehrerliste = lehrerliste;
	}




	public Schueler getAbteilungssprecher() {
		return abteilungssprecher;
	}




	public void setAbteilungssprecher(Schueler abteilungssprecher) {
		this.abteilungssprecher = abteilungssprecher;
	}




	public ArrayList<Klassen> getKlassenliste() {
		return klassenliste;
	}




	public void setKlassenliste(ArrayList<Klassen> klassenliste) {
		this.klassenliste = klassenliste;
	}




	public Lehrer getAbteilungsvorstand() {
		return abteilungsvorstand;
	}
	
}
