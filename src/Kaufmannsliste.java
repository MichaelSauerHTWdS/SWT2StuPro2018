/**
 * Klasse um eine Menge von Kaufleuten zu verwalten.
 *
 *
 * @author Joshua Pinnecker
 * @date 28.05.18
 * @version 0.1
 */

class Kaufmannsliste{
	static public final String ILLEGAL_SPIELERZAHL = "Die Anzahl teilnehmender Spieler muss 2, 3 oder 4 sein.";
	static public final int MAX_SPIELERZAHL = 4;
	private Kaufmann[] liste;
	public final int spielerzahl;

	public Kaufmannsliste(int spielerzahl){
		if (spielerzahl > MAX_SPIELERZAHL || spielerzahl < 2)
			throw new IllegalArgumentException(ILLEGAL_SPIELERZAHL);
		liste = new Kaufmann[spielerzahl];
		this.spielerzahl = spielerzahl;
		}	
}
	
	
	
	
