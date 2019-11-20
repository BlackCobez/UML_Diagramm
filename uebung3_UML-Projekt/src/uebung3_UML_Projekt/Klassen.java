package uebung3_UML_Projekt;

import java.util.ArrayList;

public class Klassen {
	
	//Beziehung
	private Lehrer kv;													// Klassenvorstand 0..1 Ein Lehrer ist maximal Klassenvorstand von einer Klasse
	private Schueler klassensprecher;									// Klassensprecher 0...1
	private ArrayList<Schueler> schueler = new ArrayList<Schueler>();	//Liste von Schuelern
	private ArrayList<Fach> faecher = new ArrayList<Fach>();			//Liste von Fächern von dieser Klasse
	private Raum stammklasse;
	
	
	//Variablen
	private String bezeichnung;
	private int schulstufe;
	private int s_anz = 0;
	//Konstruktor
	public Klassen(String bezeichnung, int schulstufe, Raum stammklasse) {
		this.bezeichnung = bezeichnung;
		this.schulstufe = schulstufe;
		this.stammklasse = stammklasse;
	}
	
	//Methoden, getter und setter
	public String getBezeichnung() {
		return bezeichnung;
	}
	public int getSchulstufe() {
		return schulstufe;
	}
	public float getDurchschnittsalter() {
		float durchschnittsalter = 0;
		
		return durchschnittsalter;
	}
	public void addSchueler(Schueler schueler){		
		if(s_anz<36) {									//obergrenze von 36 schuelern	
			this.schueler.add(schueler);
			s_anz++;	
		}else System.out.println("Max anzahl von 36 Schülern");	//Ausgabe an den User
	}
	public void exportStundenplan() {
		
	}
	public ArrayList<Schueler> getklasse() {	// um die gesammte liste von schülern zu kriegen
		return schueler;
	}

	public int getS_anz() {			//Schüler anzahl in einer klasse
		return s_anz;
	}

	public Schueler getKlassensprecher() {		//klassensprecher herausfinden
		return klassensprecher;
	}

	public void setKlassensprecher(Schueler klassensprecher) {	//klassensprecher auswählen
		this.klassensprecher = klassensprecher;
	}

	public Lehrer getKv() {		// klassenvorstand herausfinden
		return kv;
	}

	public void setKv(Lehrer kv, Klassen klasse) {	// Mit dieser Methode kann man von "beiden Seiten" Klasse und Schueler jeweils die parameter setzen (bidirektional)
		try {										
			this.kv = kv;
			kv.setMeineklasse(klasse, kv);
		}catch(StackOverflowError i)
		{
			return;					// ist ein einfacher aber effektiver weg aus der methode "auszubrechen", damit sich die methoden nicht unendlich weiter aufrufen
		}
	}

	public ArrayList<Fach> getFaecher() {
		return faecher;
	}

	public void setFaecher(ArrayList<Fach> faecher) {
		this.faecher = faecher;
	}
	
	public void addfach(Fach fach)
	{
		this.faecher.add(fach);
	}

	public Raum getStammklasse() {
		return stammklasse;
	}

	public void setStammklasse(Raum stammklasse) {
		this.stammklasse = stammklasse;
	}
}
