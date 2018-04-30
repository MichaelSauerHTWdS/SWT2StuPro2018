
public class Schiff 
{
	private String name;
	private int zustand;
	private int ladung;
	private int typ;
	private String typname;
	
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
		case 1: this.typname = "Snigge";
				break;
		case 2:	this.typname = "";
				break;
		case 3:	this.typname = "";
				break;
		case 4:	this.typname = "";
				break;
		case 5:	this.typname = "";
				break;
		case 6:	this.typname = "";
				break;
		default:
				break;
		}
		antwort = this.name + " ist jetzt eine ";
		
		return antwort;
	}

}
