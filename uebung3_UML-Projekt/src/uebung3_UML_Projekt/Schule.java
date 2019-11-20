package uebung3_UML_Projekt;
import java.util.ArrayList;
import java.util.List;

public class Schule {
	//Beziehungen
	private Adresse standort;
	private Schueler schulsprecher;
	private Lehrer direktor;
	private Lehrer abteilungsvorstand; 
	private ArrayList<Abteilung> abteilungsliste= new ArrayList<Abteilung>();				//zuerst Liste(höchste Objekt in Vererbungshirarchie) und dann deklarieren welche list Array/link 
	private ArrayList<Schueler> schuelerliste = new ArrayList<Schueler>();
	private ArrayList<Mitarbeiter> mitarbeiterliste = new ArrayList<Mitarbeiter>();
	private ArrayList<Klassen> klassenliste = new ArrayList<Klassen>();
	
	//Variablen
	private String name;
	private String schultyp;
	private long schulkennzahl;	

	
	//Konstruktor
	public Schule(String name, String schultyp, long schulkennzahl, Adresse standort, Schueler schulsprecher, Lehrer direktor) {
		this.name = name;
		this.schultyp = schultyp;
		this.schulkennzahl = schulkennzahl;
		this.setStandort(standort);									//Adresse muss vorhanden sein im Konstruktur
		this.setSchulsprecher(schulsprecher);								//Nur ein Schulsprecher
		this.setDirektor(direktor);	
		
	}

	
	//Methoden, getter und setter
	
	public Abteilung addAbteilung(String kuerzel, String name, Schule schule, Schueler abteilungssprecher, Lehrer abteilungsvorstand, ArrayList<Klassen> klassenliste) {						//Schule kann 0 oder mehr Abteilungen haben
		Abteilung abteilung = new Abteilung (kuerzel, name, this, abteilungssprecher, abteilungsvorstand, klassenliste);					//Erzeuge Objekz Abteilung und gebe Wert(el, wir etc) in abteilung und returne das an schule, this-->Schule ruft sich selbst auf
		abteilungsliste.add(abteilung);						//DIe Abteilung die die zurückgeliefetr wird Wird in die Liste gespeichert und kann somit abgerufen werden zb get
		this.abteilungsvorstand = abteilungsvorstand;
		return abteilung;
	}
	
	public boolean addPersonal(Nichtlehrpersonal personal) {
		mitarbeiterliste.add(personal);
		return true;
	}
	
	public boolean setDirektor(Lehrer neuerdirektor) {
		this.direktor=neuerdirektor;
		return true;
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
		return Schueler.getSanz();
	}
		
	public  ArrayList<Mitarbeiter> getPersonal(){		
		
		for (Abteilung abteilung : abteilungsliste) {
			mitarbeiterliste.addAll(abteilung.getLehrerliste());		//Alle Lehrer Listen einer Abteilung werden zusammengefasst und werden plus dem Nichtlehrpersonal, welches schon vorher immer dazu geadded wurde ausgegeben
		}
		return mitarbeiterliste;
	} 
	public  ArrayList<Schueler> getSchuelerliste() {
		return schuelerliste;
	}  
	
	public ArrayList<Abteilung> getAbteilung(){
		return abteilungsliste;
	}


	public ArrayList<Klassen> getKlassenliste() {
		return klassenliste;
	}


	public void setKlassenliste(ArrayList<Klassen> klassenliste) {
		this.klassenliste = klassenliste;
	}


	public Lehrer getDirektor() {
		return direktor;
	}


	public Schueler getSchulsprecher() {
		return schulsprecher;
	}


	public void setSchulsprecher(Schueler schulsprecher) {
		this.schulsprecher = schulsprecher;
	}


	public Adresse getStandort() {
		return standort;
	}


	public void setStandort(Adresse standort) {
		this.standort = standort;
	}
	
	
}
