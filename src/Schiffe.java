/**
 * @mainpage Hanse Kontor 
 * @details	java-Klasse zur Erzeugung und Verwaltung von Schiffen
 *
 * @file 	Schiff.java
 * @version 1.1
 * @date	2018
 * @author	Matthias Langenfeld, Bjoern Offermann
 * 		Joshua Pinnecker
 */

//import java.io.*;
import java.util.*;

/**
 * @name Name des Schiffes
 * @class Schiff
 * @brief Hier werden die wichtigsten Parameter des Schiffes definiert
 */
public class Schiffe
{
	private int anzahlmax = 10; 
	private int aktuell;
	private Schiff schiff_liste[];

	/**
	 * @brief Konstruktor 
	 * @param name Schiffsname
	 */
	public Schiffe() 
	{
		schiff_liste = new Schiff[anzahlmax];
		aktuell = 0;
	}
	
	public void addSchiff(String name)
	{
		if (aktuell < anzahlmax)
		{
			schiff_liste[aktuell] = new Schiff(name);
			aktuell++;
		}
	}

}
