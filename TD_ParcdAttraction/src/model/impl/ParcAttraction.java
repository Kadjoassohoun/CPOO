package model.impl;

import java.lang.StringBuilder;
import java.util.logging.Logger;
import model.exceptions.ParcPlein;

import model.decl.ParcAttractionItf;
import model.decl.Tarif;


public class ParcAttraction implements ParcAttractionItf{

	private static final Logger LOG = Logger.getLogger(ParcAttraction.class.getCanonicalName());

	private final String nom;
	private final int capacite;
	private final double prix;
	private final double nbcategorie;
	private int illimite = 0;
	private int illimite5 = 0;
	private int reduit = 0;
	private int reduit5 = 0;


	public ParcAttraction(String nomP, int cap, double tarif, double nbc)
	{
		this.nom = nomP;
		this.capacite = cap;
		this.prix = tarif;
		this.nbcategorie = nbc;

	}

	public int nbPlacesDispo()
	{
		return capacite - ( illimite + illimite5 + reduit + reduit5);
	}

	public void vendreBillet( int nb, Tarif tarif) throws Parcplein{

		try{

			if( nb > nbPlacesDispo())
			{
				System.out.printf(" pas de place disponible");
			}
			else
			{
				switch(tarif)
				{
					case illimite:

					illimite = illimite + nb;
					break;

					case illimite5:

					illimite5 = illimite5 + nb;
					break;

					case reduit:

					reduit = reduit + nb;
					break;

					case reduit5:

					reduit5 = reduit5 + nb;
					break;

					default:

					system.out.prinft(" Categorie de bien inconnu");
				}
			}

		}catch (Parcplein e){

		LOG.severe("le parc d'attraction est deja plein ");
	}
}

	public void reinitialise()
	{
		illimite = 0;
		illimite5 = 0;
		reduit = 0;
		reduit5 = 0;
	}

	public double chriffreAffaire()
	{
		double ca;
		ca = illimite * prix + illimite5 * nbcategorie + reduit * (0.7 * prix) + reduit5 * (0.7 * nbcategorie);
			
		return ca;
	}

	public void tauxRemplissage()
	{
		return (double) ((( illimite + illimite5 + reduit + reduit5) / capacite) * 100 );
	}


    @Override
	public String toString()
	{

		StringBuffer sb = new StringBuffer();

		sb.append(this.nom).append(",").append("\n")
		                    .append(" capacite d'accueil : ").append(capacite).append(",")
		                    .append("\n").append(Tarif.ILLIMITE.getNom() + ":")
		                    .append(prix).append("euros").append(",").append("\n")
		                    .append(Tarif.ILLIMITE5.getNom() + ":").append(nbcategorie)
		                    .append("euros").append(",").append("\n").append(illimite)
		                    .append("Billet vendus au tarif illimité").append(",")
		                    .append("\n").append(illimite5)
		                    .append("Billet vendus au tarif illimité de 5").append(",")
		                    .append("\n").append(reduit)
		                    .append("billet vendus au tarif reduit ").append(",")
		                    .append("\n").append(reduit5)
		                    .append("Billet vendus au tarif reduit 5").append(",")
		                    .append("\n");


		  return sb.toString;

	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int res = 1;
		res = res * prime + ((nom == null ) ? 0 : nom.hashCode());

		return res;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if(obj == null)
		{
			return false;
		}

		if(getClass != obj.getClass())
		{
			return false;
		}

		ParcAttraction p = (ParcAttraction) obj;

		if( nom == null)
		{
			if(p.nom != null)
			{
				return false;
			}

			else if(!nom.equals(p.nom))

			{
				return false;

			}
			return true;
		}

	}

}