package uebung3_UML_Projekt;
import java.util.ArrayList;


public abstract class Person {
	//Beziehung
	private ArrayList<Adresse> adressenliste = new ArrayList<Adresse>();
	//Variablen
	private long svnr;
	private String vorname;
	private String nachname;
	private String geburtsdatum;	// Das Handling ist einfacher
	private String email;
	
	//Konstruktor
	public Person(String vorname, String nachname, String geburtsdatum, String email, long svnr, String ort, String strasse, Integer hausnummer, Integer plz)
	{
		this.adressenliste.add(new Adresse(ort,strasse,hausnummer,plz));	// Man kann bei dieser variante zwar bei der Instanzierung einer 
																			// Person nur eine Adresse angeben, aber man kann im nachhinein eine weitere adden 
																			// bsp alex.getAdressenliste().add(new Adresse( "stp2","hauptstraße", 12, 3012));
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
		this.email = email;
		this.svnr = svnr;
	}
	
	//Methoden, getter und setter
	public long getSvnr() {
		return svnr;
	}
	public String getVorname() {
		return vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public String getEmail() {
		return email;
	}
	public String getGeburtsdatum() {
		return geburtsdatum;
	}
	public ArrayList<Adresse> getAdressenliste() {
		return adressenliste;
	}
	public void setAdressenliste(ArrayList<Adresse> adressenliste) {
		this.adressenliste = adressenliste;
	}
	public void addadresse(String ort, String strasse, Integer hausnummer, Integer plz)
	{
		this.adressenliste.add(new Adresse(ort,strasse,hausnummer,plz));
	}
}
