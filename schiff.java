
public class Schiff 
{
	private String name;
	private int zustand;
	private int ladung;
	private int typ;
	private String typname;
	private int maxlad;
	
	public Schiff(String name) 
	{
		this.zustand = 100;
		this.ladung = 0;
		this.typ = 2;
		this.name = name;		
	}
	
	public String umbau(int typ) 
	{
		String antwort;
		this.typ = typ;
		
		switch (typ) 
		{
		case 1: this.typname = "Schnigge";
				break;
		case 2:	this.typname = "Kogge";
				break;
		case 3:	this.typname = "Holk";
				break;
		case 4:	this.typname = "Kraweel";
				break;
		case 5:	this.typname = "Karacke";
				break;
		case 6:	this.typname = "Linienschiff";
				break;
		default:
				break;
		}
		antwort = this.name + " ist jetzt eine " + this.typname;
		
		return antwort;
	}

}
