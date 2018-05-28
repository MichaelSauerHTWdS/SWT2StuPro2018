
import java.util.Scanner;

public class Spieler {
	
	public Spieler () throws Exception {
		
		int spieler[] = new int[10];
		
		// Fehlermeldung, falls Array falsch erstellt?!?!?!?!
		
		for (int i=0;i<=10;i++) {
			
			spieler[i] = 0;
			
		}
		
	}
	
	public static void main() {
		
		int anzahlSpieler;
		
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
	
		
		
		
	}

}
