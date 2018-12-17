package uebung3_UML_Projekt;

import java.util.ArrayList;

public class Klassen {
	
	//Beziehung
	private Schueler klassensprecher;									// Klassensprecher 0...1
	private ArrayList<Schueler> schueler = new ArrayList<Schueler>();	//Liste von Schuelern
	
	//Variablen
	private String bezeichnung;
	private int schulstufe;
	private int s_anz = 0;
	//Konstruktor
	public Klassen(String bezeichnung, int schulstufe) {
		this.bezeichnung = bezeichnung;
		this.schulstufe = schulstufe;
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
	public boolean addSchueler(Schueler schueler) {		//schüler hinzufügen
		if(s_anz<36) {									//obergrenze von 36 schuelern
			this.schueler.add(schueler);
			s_anz++;
		}else System.out.println("Klasse darf max 36 Schüler haben");
		
		return true;		
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

}
