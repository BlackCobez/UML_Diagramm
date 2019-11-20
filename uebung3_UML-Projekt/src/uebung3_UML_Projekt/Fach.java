package uebung3_UML_Projekt;

import java.util.ArrayList;

public class Fach {
	//Beziehung
	private ArrayList<Lehrer> lehrer = new ArrayList<Lehrer>();
	private ArrayList<Klassen> klassen = new ArrayList<Klassen>();
	
	//Variablen
	private String name;
	private int wochenstunden;
	private Raumtyp raumanforderung;
	
	//Konstruktor
	public Fach(String name, int wochenstunden, String raumanforderung)
	{
		this.name = name;
		this.wochenstunden = wochenstunden;
		this.raumanforderung = Raumtyp.valueOf(raumanforderung);
	}
	
	//Methoden, getter und setter
	public String getName() {
		return name;
	}
	public Raumtyp getRaumanforderung() {
		return raumanforderung;
	}
	public int getWochenstunden() {
		return wochenstunden;
	}

	public ArrayList<Lehrer> getLehrer() {
		return lehrer;
	}

	public void setLehrer(ArrayList<Lehrer> lehrer) {
		this.lehrer = lehrer;
	}

	public ArrayList<Klassen> getKlassen() {
		return klassen;
	}

	public void setKlassen(ArrayList<Klassen> klassen) {
		this.klassen = klassen;
	}
	
	public void addKlassen(Klassen klasse) {
		this.klassen.add(klasse);
	}
}
