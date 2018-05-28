/**
 * Klasse Spiel.
 * Dies ist die Hauptklasse, die die Methode main ausfuehrt.
 * Sie verwaltet den Spielfluss.
 *
 * @date 28.05.18
 * @author Joshua Pinnecker
 * @version 0.2
 */
import java.util.Scanner;

/**
 * Klasse Spiel
 */
public class Spiel {
	private Kaufmannsliste kaufmannsliste;
	private int game = 0;

	
	public Spiel()
	{
		initialize();
	}
	
	private initialize() {
		Scanner lesen = new Scanner();
		
		System.out.println("Wieviele Spieler nehmen teil? ");
		lesen.nextInt()

	}

	public void hello()
	{
		System.out.print("Hello World");
	}
	
	public void start()
	{
		Scanner lesen = new Scanner();
		
		
		
	}
	
	public int main()
	{
		Spiel spiel = new Spiel();
		spiel.start();
		return 0;
	}






	public int getGame() {
		return game;
	}

	public void setGame(int game) {
		this.game = game;
	}
}
