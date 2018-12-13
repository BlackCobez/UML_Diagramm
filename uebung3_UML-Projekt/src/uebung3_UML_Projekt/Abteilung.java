package uebung3_UML_Projekt;

import java.util.ArrayList;

public class Abteilung {
	//Beziehungen
	
	//Variablen
	private String kuerzel;
	private String name;
	
	private Schule schule;
	
	private ArrayList<Schueler> schuelerliste = new ArrayList<Schueler>();
	
	//Konstruktor
	public Abteilung (String kuerzel, String name) {
		this.kuerzel = kuerzel;
		this.name = name;
	}

	//Aggregation zu Shcule?
	
	//Methoden, getter und setter
	public String getName() {
		return name;
	}
	
	public String getKuerzel() {
		return kuerzel;
	}
	
	public ArrayList<Schueler> getSchuelerliste() {			//ArrayList<Schueler> 
		return schuelerliste;
	} 			
	public boolean addLehrer(Lehrer l) {
		
	}
	public boolean setAbteilungsvorstand(Lehrer l) {
		
	}
	
}
