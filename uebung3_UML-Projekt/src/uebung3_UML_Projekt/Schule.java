package uebung3_UML_Projekt;

public class Schule {
	//Beziehung
	
	//Variablen
	private String name;
	private String schultyp;
	private long schulkennzahl;
	
	//Konstruktor
	
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
	public getPersonal() {		//ArrayList<Mitarbeiter>
		return personal;
	} 
	public getSchueler() {			//ArrayList<Mitarbeiter>
		return schueler;		
	}  
	
	
	
}
