package uebung3_UML_Projekt;

import java.util.ArrayList;

public class Schule {

	//Variablen
	private String name;
	private String schultyp;
	private long schulkennzahl;
	
	private Adresse adresse;
	
	
	private ArrayList<Mitarbeiter> mitarbeiterliste = new ArrayList<Mitarbeiter>();
	private ArrayList<Schueler> schuelerliste = new ArrayList<Schueler>();
	
	//Konstruktor
	public Schule(String name, String schultyp, long schulkennzahl) {
		this.name = name;
		this.schultyp = schultyp;
		this.schulkennzahl = schulkennzahl;
	}
	
	//Getter,Setter Adress_Class(Assoziation)--nur 1 Adresse?
	public Adresse getAdresse() {
		return adresse;
	}
	public Adresse setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	

	
	//Methoden, getter und setter
	public boolean addPersonal(Nichtlehrpersonal personal) {		
	}
	public Abteilung addAbteilung(String name, String kuerzel) {
		
	}
	public boolean setDirektor(Lehrer lehrer) {
		
	}
	public long getSchulkennzahl() {
		return schulkennzahl;
	}
	public String getName() {
		return name;
		
	}
	public String getSchultyp() {
		return schultyp;		
	}
	public int getAnzahlSchueler() {
		return anzahlSchueler;
	}
	
	
	//ArrayListen Mitarbeiter/Personal ? und Schueler
	public  ArrayList<Mitarbeiter> getMitarbeiterliste(){		//ArrayList<Mitarbeiter>????PERSONAL ODER MITARBEITER????
		return mitarbeiterliste;
	} 
	public  ArrayList<Schueler> getSchuelerliste() {			//ArrayList<Schueler>
		return schuelerliste;		
	}  
	
	
	
}
