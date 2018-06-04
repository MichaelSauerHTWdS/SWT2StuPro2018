/**
 * 
 * @author Benjamin Hesser, Marvin Backes
 * 
 * @version 1.0
 * 
 * @date 30.04.18
 */

import java.util.Scanner;

public class Spieler {
	
	/**
	 * Konstruktor zum Erstellen eines Arrays, welches später mit Spielern gefÃ¼llt wird 
	 * @throws Exception
	 */
	public Spieler () throws Exception {
		
		int spieler[] = new int[10];
		
		// Fehlermeldung, falls Array falsch erstellt?!?!?!?!
		
		for (int i=0;i<=10;i++) {
			
			spieler[i] = 0;
			
		}
		
	}
	
	/**
	 * Anzahl der Spieler einlesen und anschließend erstellen 
	 */
	public static void main() {
		
		int anzahlSpieler = 0;
		
		try {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Bitte geben Sie die Anzahl an Spielern ein!");
			
			anzahlSpieler = scan.nextInt();
			
			if (anzahlSpieler <= 1 || anzahlSpieler > 10) {
				
				throw new Exception("Es dürfen minimal 2 und maximal 10 Spieler mitspielen!");
				
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		/**
		 * Mit Hilfe einer For-Schleife so viele Spieler erstellen, wie es anzahlSpieler gibt
		 */
		for (int i=0;i <= anzahlSpieler;i++) {
			
			
			
		}
	}

}
