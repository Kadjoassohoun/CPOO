package model.impl; 

import java.lang.String;
import java.util.Objetcs

import model.decl.SalleCinemaItf;



public class Employe implements SalleCinemaItf
{


	private  string nom;
	private  double salairehoraireBase;
	private  int nbHeure;

	public Employe( string nom, double salairehoraireBase, int nbHeure)
	{
		this.nom = nom;
		this.salairehoraireBase = salairehoraireBase;
		this.nbHeure = nbHeure;
	}

	public void calculSalaire( double salairehoraireBase, int nbHeure)
	{
		salairehoraireBase * nbheure;
	}

	public String getNom()
	{
		return this.nom;
	}

	public double getSalairehorairebase()
	{
		return this.salairehoraireBase;
	}

	public int getNbheure()
	{
		return this.nbheure;
	}


}
