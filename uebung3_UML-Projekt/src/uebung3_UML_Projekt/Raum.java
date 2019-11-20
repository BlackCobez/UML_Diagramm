package uebung3_UML_Projekt;

import java.util.ArrayList;

public class Raum {
	//Beziehung
	private ArrayList<Fach> raumverwendung = new ArrayList<Fach>();
	private Klassen klassenraum;	
	
	//Variablen
	private String raumNummer;
	private int maxSitzplaetze;
	private Raumtyp raumtyp;
	
	//Konstruktor
	public Raum(String raumNummer, int maxSitzplaetze, String raumtyp) {
		this.raumNummer = raumNummer;
		this.maxSitzplaetze = maxSitzplaetze;
		this.raumtyp.valueOf(raumtyp);
	}
	
	//Methoden, getter und setter
	public String getRaumNummer() {
		return raumNummer;
	}
	public int getMaxSitzplaetze() {
		return maxSitzplaetze;
	}
	public Raumtyp getRaumtyp() {
		return raumtyp;
	}
	public void exportBelegung() {
		
	}

	public ArrayList<Fach> getRaumverwendung() {
		return raumverwendung;
	}

	public void setRaumverwendung(ArrayList<Fach> raumverwendung) {
		this.raumverwendung = raumverwendung;
	}
	
	public void addRaumverwendung(Fach raumverwendung){
		this.raumverwendung.add(raumverwendung);
	}

	public Klassen getKlassenraum() {
		return klassenraum;
	}

	public void setKlassenraum(Klassen klassenraum) {
		this.klassenraum = klassenraum;
	}
}
