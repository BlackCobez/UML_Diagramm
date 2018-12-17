package uebung3_UML_Projekt;

import java.util.ArrayList;

public class Adresse {
	//Beziehungen
	private ArrayList<Person> personenliste = new ArrayList<Person>();
	private Schule schule;
	//Variablen
	private String ort; 
	private String strasse;
	private Integer hausnummer;
	private Integer plz;
	
	//Konstruktor (muss noch geändert werden, siehe *testkonstruktor, aber immer noch in testphase
	public Adresse(String ort, String strasse, Integer hausnummer, Integer plz) {
		this.ort = ort;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
	}
	//test konstruktor wo eine Person vorhanden sein muss !!!
	public Adresse(String ort, ArrayList<Person> personenliste)
	{	//if(personenliste.isEmpty()) System.out.println("keine personen"); //Falls jemand nichts hineinschreibt
		this.ort = ort;
		this.personenliste = personenliste;
	}
	
	//Methoden, getter und setter
	public ArrayList<Person> getpersonenliste() {
		return personenliste;
	}

	public void setpersonenliste(ArrayList<Person> personenliste) {
		this.personenliste = personenliste;
	}
	
	public Schule getschule() {					
		return schule;
	}
	
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
	}

}
