/*
Author: Richard Mai
Kontakt: manhkhang@gmx.de
 */


import java.util.Scanner;

public class Kontor {


    /*
    @param int capacity, Kapazitätsvariable
     */


    private int capacity;



    public Kontor(int capacity)
    {
        this.capacity = capacity;
    }

    /*
        Importiert Guetern in die Kontor-Klasse, mit entscheidung welcher ware
     */
    public void importGơods( )
    {
        try
        {
            Scanner lesen = new Scanner(System.in);
            String test = lesen.nextLine();
            if(test.equals("b"))
            {
                throw new Exception("Hiiiii");
            }
            System.out.println(test.toString());
            System.out.println("Ich bin Hier");

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main (String[] args)
    {
        Kontor kontor = new Kontor(200);
        kontor.importGơods();

    }

}
