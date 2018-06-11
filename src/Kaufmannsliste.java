/**
 * Klasse um eine Menge von Kaufleuten zu verwalten.
 *
 *
 * @date 28.05.18
 * @author Joshua Pinnecker
 * @version 1
 */
class Kaufmannsliste{
	static private final String ILLEGAL_SPIELERZAHL = "Die Anzahl teilnehmender Spieler muss 2, 3 oder 4 sein!";
	static private final int MAX_SPIELERZAHL = 4;
	private Kaufmann[] liste;

	public Kaufmannsliste(int spielerzahl){
		if (spielerzahl > MAX_SPIELERZAHL || spielerzahl < 2)
			throw new IllegalArgumentException(ILLEGAL_SPIELERZAHL);
		liste = new Kaufmann[spielerzahl];
		}

	public int getSpielerzahl(){
		return liste.length;
	}

	public String toString() {
		String returnString = "";
		for (Kaufmann kaufmann : liste)
			returnString += (kaufmann.toString() + "\n");
		return returnString;
	}

	/**
	 * Fuegt einen neuen Kaufmann an der Stelle i ein.
	 * @param i Index an dem der Kaufmann eingefuegt wird.
     *          TODO: Ueberpruefung auf korrekten Index
	 */
	public void add(int i) {
		liste[i] =  new Kaufmann();
		liste[i].eingabe();
	}
}
	
	
	
	
