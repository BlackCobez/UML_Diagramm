package uebung3_UML_Projekt;

import java.util.ArrayList;

public class Klassen {
	
	//Beziehung
	private Schueler klassensprecher;
	private ArrayList<Schueler> schueler = new ArrayList<Schueler>();
	
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
	public boolean setKlassensprecher(Schueler schueler) {
		schueler = klassensprecher;
		return true;
	}
	public boolean addSchueler(Schueler schueler) {
		if(s_anz<36) {
			this.schueler.add(schueler);
			s_anz++;
		}else System.out.println("Klasse darf max 36 Schüler haben");
		
		return true;		
	}
	public void exportStundenplan() {
		
	}
	public Schueler getKlassensprecher() {
		return klassensprecher;
	}
	public ArrayList<Schueler> getklasse() {
		return schueler;
	}

	public int getS_anz() {
		return s_anz;
	}

}
