package uebung3_UML_Projekt;
import java.sql.Date;

public class Person {
	//Beziehung
	
	//Variablen
	private long svnr;
	private String vorname;
	private String nachname;
	private Date geburtsdatum;
	private String email;
	
	//Konstruktor
	public Person(String vorname, String nachname, Date geburtsdatum, String email, long svnr)
	{
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
		this.email = email;
		this.svnr = svnr;
	}
	//testkonstruktor
	public Person(String vorname)
	{
		this.vorname = vorname;
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
	public Date getGeburtsdatum() {
		return geburtsdatum;
	}

}
