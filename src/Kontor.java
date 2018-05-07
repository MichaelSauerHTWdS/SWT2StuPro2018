/**
 * Java Klasse Kontor
 *
 * @version V0.1
 * @date 07.05.2018
*/

import java.util.Scanner;

public class Kontor {
    private int capacity;
    //private Warenklasse;
    /**
     * Konstruktor
    */
    public Kontor(int capacity)
    {
        this.capacity = capacity;
    }

    /*
        Importiert Guetern in die Kontor-Klasse, mit entscheidung welcher ware
     */
    public void importGoods( )
    {
        try
        {
            Scanner lesen = new Scanner(System.in);
            string test = lesen.nextLine();


        }
        catch (Exception e)
        {
            system.out.println(e);
        }
    }

    public int main ()
    {
        Kontor kontor = new Kontor(200);


        return 0;
    }

}
