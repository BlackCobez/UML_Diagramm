//
// 	Testumgebung(Versuchsanstalt) HTL für Schule
// 	Hier werden versuche an semtlichen Lebewesen innerhalb der öffentlichen Einrichtung durchgeführt.
//
package uebung3_UML_Projekt;
import java.util.ArrayList;

public class HTL_main {

	public static void main(String[] args) {
	
		Person alex = new Person("Alex","Steger", "03-10-1999","alex.steger@htlstp.at", 2222, "stp","hauptstraße", 11, 3011);
		alex.getAdressenliste().add(new Adresse( "stp2","hauptstraße", 12, 3012));
		
		Person monika = new Person("Monika","Wandl", "03-10-1999","alex.steger@htlstp.at", 2222, "stp","hauptstraße", 11, 3011);
		monika.getAdressenliste().add(new Adresse( "stp2","hauptstraße", 12, 3012));
		
		for(Adresse a : monika.getAdressenliste())
		{
			a.printAdresse();
		}
		for(Adresse a : alex.getAdressenliste())
		{
			a.printAdresse();
		}
	}
}
