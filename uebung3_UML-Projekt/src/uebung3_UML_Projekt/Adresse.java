package uebung3_UML_Projekt;

import java.util.ArrayList;

public class Adresse {
	//Beziehungen
	
	//Variablen
	private String ort; 
	private String strasse;
	private Integer hausnummer;
	private Integer plz;
	
	//Konstruktor 
	public Adresse(String ort, String strasse, Integer hausnummer, Integer plz) {
		this.ort = ort;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
	}
	
	
	//Methoden, getter und setter

	public String getOrt() {
		return ort;
	}

	public String getStrasse() {
		return strasse;
	}
	
	public Integer getHausnummer() {
		return hausnummer;
	}
	
	public Integer getPlz() {
		return plz;		
	}
	
	public void printAdresse() {
		System.out.println(ort +" "+ strasse +" "+ hausnummer +" "+ plz);
	}

}
