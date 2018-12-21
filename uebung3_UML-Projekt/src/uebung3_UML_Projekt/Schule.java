package uebung3_UML_Projekt;
import java.util.ArrayList;
import java.util.List;

public class Schule {

	//Variablen
	private String name;
	private String schultyp;
	private long schulkennzahl;
	private Adresse standort;
	private Schueler schulsprecher;
	private Adresse adresse;
	
	private List<Abteilung> abteilungsliste= new ArrayList<Abteilung>();				//zuerst Liste(höchste Objekt in Vererbungshirarchie) und dann deklarieren welche list Array/link 
	private List<Schueler> schuelerliste = new ArrayList<Schueler>();
	
	//Konstruktor
	public Schule(String name, String schultyp, long schulkennzahl, Adresse standort, Schueler schulsprecher) {
		this.name = name;
		this.schultyp = schultyp;
		this.schulkennzahl = schulkennzahl;
		this.standort = standort;									//Adresse muss vorhanden sein(im Konstruktur wenns 1 oder mehr haben MUSS)
		this.schulsprecher = schulsprecher;								//Nur ein Schulsprecher
	}
	
	/*Getter,Setter Adress_Class(Assoziation)--nur 1 Adresse?
	public Adresse getAdresse() {
		return adresse;
	}*/

	//Abteilung

		
	//Methoden, getter und setter
	public boolean addPersonal(Nichtlehrpersonal personal) {		
	}
	
	public Abteilung addAbteilung(String name, String kuerzel) {						//Schule kann 0 oder mehr Abteilungen haben(In Angabe 1 oder mehr)
		Abteilung abteilung = new Abteilung(name, kuerzel, this);					//Erzeuge Objekz Abteilung und gebe Wert(el, wir etc) in abteilung und returne das an schule, this-->Schule ruft sich selbst auf
		abteilungsliste.add(abteilung);						//DIe Abteilung die die zurückgeliefetr wird Wird in die Liste gespeichert und kann somit abgerufen werden zb get
		return abteilung;
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
