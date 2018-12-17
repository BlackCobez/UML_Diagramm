package uebung3_UML_Projekt;

import java.util.ArrayList;

public class Schule {

	//Variablen
	private String name;
	private String schultyp;
	private long schulkennzahl;
	
	private Adresse adresse;
	//private Abteilung abteilung;
	private Nichtlehrpersonal nichtlehrpersonal;
	private Abteilung el, et, ma, inf, wir;			//in Abteilung erstellen?

	
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

	//Abteilung
	public Abteilung() {
		el = new Abteilung();
		et = new Abteilung();
		ma = new Abteilung();
		wir = new Abteilung();
		inf = new Abteilung();
	}
	
	public Nichlehrpersonal() {
		
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
	public  ArrayList<Mitarbeiter> getPersonal(){		//ArrayList<Mitarbeiter>????PERSONAL ODER MITARBEITER????
		return mitarbeiterliste;
	} 
	public  ArrayList<Schueler> getSchuelerliste() {			//ArrayList<Schueler>
		return schuelerliste;		
	}  
	
	
	
}
