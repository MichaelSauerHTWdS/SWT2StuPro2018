/**
 * Klasse Hafen
 * Anlaufspunkt fuer Schiffe ueber Seeroute
 * Jeder Hafen hat exakt eine Werft und einen Kontor
 * 
 * @author Joshua Pinnecker
 * @date 07.05.2018
 * @version V0.1
 */


public class Hafen /* extends GeoObjekte */{

	//private Kontor;
	//private Werft;
	private name; //Stadtname

	/**
 	* Konstruktor
 	*/
	public Hafen(String name){
		if(!(name instanceof String)) throw Exception e;

		this.name = name;
	}
}
