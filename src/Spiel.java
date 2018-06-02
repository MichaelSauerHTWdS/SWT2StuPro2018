import java.util.Scanner;
/**
 * Klasse Spiel.
 * Dies ist die Hauptklasse, die die Methode main ausfuehrt.
 * Sie verwaltet den Spielfluss.
 *
 * @date 28.05.18
 * @author Joshua Pinnecker
 * @version 0.3
 */
public class Spiel {
	static private final String line = "---------------------------";
	private Kaufmannsliste kaufmannsliste;
	private int game = 0;

	
	public Spiel()
	{
		initialize();
	}
	
	private void initialize() {
		Scanner lesen = new Scanner(System.in);

		System.out.println("Wieviele Spieler nehmen teil?");
		kaufmannsliste = new Kaufmannsliste(lesen.nextInt());
		System.out.println("Es nehmen " + kaufmannsliste.getSpielerzahl() + " Spieler teil.");

		boolean error;
		for (int i = 0; i < kaufmannsliste.getSpielerzahl(); i++) {
			do {
			    error = false;
				try {
					System.out.println("\nSpieler " + (i+1) + " erstellen Sie Ihren Kaufmann.\n" + line);
					kaufmannsliste.add(i);
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
					error = true;
				}
			} while (error);
		}
		System.out.println("\nEs spielen folgende Kaufleut\'\n" + line);
		System.out.println(kaufmannsliste.toString());
	}

	public void hello()
	{
		System.out.print("Hello World");
	}
	
	private void start()
	{

	}
	
	public static void main(String args[])
	{
		Spiel spiel = new Spiel();
		spiel.start();
	}






	public int getGame() {
		return game;
	}

	public void setGame(int game) {
		this.game = game;
	}
}
