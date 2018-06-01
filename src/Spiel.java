import java.util.Scanner;
/**
 * Klasse Spiel.
 * Dies ist die Hauptklasse, die die Methode main ausfuehrt.
 * Sie verwaltet den Spielfluss.
 *
 * @date 28.05.18
 * @author Joshua Pinnecker
 * @version 0.2
 */
public class Spiel {
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
		for (Kaufmann kaufmann : kaufmannsliste.liste) {
			kaufmann = new Kaufmann();
		}
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
