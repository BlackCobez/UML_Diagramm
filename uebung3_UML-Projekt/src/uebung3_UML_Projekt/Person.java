package uebung3_UML_Projekt;
import java.sql.Date;

public class Person {
	private long svnr;
	private String vorname;
	private String nachname;
	private Date geburtsdatum;
	private String email;
	
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
