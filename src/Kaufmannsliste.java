/**
 * Klasse um eine Menge von Kaufleuten zu verwalten.
 *
 *
 * @date 28.05.18
 * @author Joshua Pinnecker
 * @version 0.1
 */
class Kaufmannsliste{
	static private final String ILLEGAL_SPIELERZAHL = "Die Anzahl teilnehmender Spieler muss 2, 3 oder 4 sein.";
	static private final int MAX_SPIELERZAHL = 4;
	private Kaufmann[] liste;
	private final int spielerzahl;

	public Kaufmannsliste(int spielerzahl){
		if (spielerzahl > MAX_SPIELERZAHL || spielerzahl < 2)
			throw new IllegalArgumentException(ILLEGAL_SPIELERZAHL);
		liste = new Kaufmann[spielerzahl];
		this.spielerzahl = spielerzahl;
		}

	public int getSpielerzahl(){
		return spielerzahl;
	}
}
	
	
	
	
