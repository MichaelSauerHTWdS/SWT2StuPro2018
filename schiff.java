
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
				this.maxlad = 40;
				break;
		case 2:	this.typname = "Kogge";
				this.maxlad = 100;
				break;
		case 3:	this.typname = "Holk";
				this.maxlad = 150;
				break;
		case 4:	this.typname = "Kraweel";
				this.maxlad = 400;
				break;
		case 5:	this.typname = "Karacke";
				this.maxlad = 600;
				break;
		case 6:	this.typname = "Linienschiff";
				this.maxlad = 1000;
				break;
		default:
				break;
		}
		antwort = this.name + " ist jetzt eine " + this.typname;
		
		return antwort;
	}
	
	public String beladen(int anzahl) 
	{
		String antwort;
		
		if (anzahl + this.ladung <= maxlad) 
		{
			this.ladung = this.ladung + anzahl;
			antwort = "Beladung erfolgreich. Es sind noch " + (this.maxlad - this.ladung) + " Einheiten frei.";
		}
		else
		{
			antwort = "Nicht genuegend Platz";
		}
		
		return antwort;
	}

}
