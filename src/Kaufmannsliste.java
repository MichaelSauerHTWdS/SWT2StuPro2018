/**
 * Klasse um eine Menge von Kaufleuten zu verwalten.
 *
 *
 * @author Joshua Pinnecker
 * @date 28.05.18
 * @version 0.1
 */

class Kaufmannsliste{
	static public final int MAX_SPIELERZAHL = 4;
	private Kaufmann[] liste;
	public final int spielerzahl;

	public Kaufmannsliste(int spielerzahl){
		if (spielerzahl > MAX_SPIELERZAHL || spielerzahl < 0)
			throw new IllegalArgumentException();
		liste = new Kaufmann[spielerzahl];
		this.spielerzahl = spielerzahl;
		}	
}
	
	
	
	
