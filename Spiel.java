
/*
 * test
 */
//test lol
//hi Benjamin
public class Spiel {
	private int game = 0;
	public Spiel()
	{
		setGame(0);
	}
	
	public void hello()
	{
		System.out.print("Hello World");
	}
	
	public void start()
	{
		Spiel spiel = new Spiel();
		spiel.setGame(1);
		spiel.hello();
	}
	
	public int main()
	{
		start();
		return 0;
	}

	public int getGame() {
		return game;
	}

	public void setGame(int game) {
		this.game = game;
	}
}
