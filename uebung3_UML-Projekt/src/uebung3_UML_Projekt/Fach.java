package uebung3_UML_Projekt;

public class Fach {
	//Beziehung
	
	//Variablen
	private String name;
	private int wochenstunden;
	private Raumtyp raumanforderung;
	
	//Konstruktor
	
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
}
