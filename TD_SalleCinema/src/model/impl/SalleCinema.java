package model.impl;

import java.lang.String;
import java.util.Object;
import java.lang.StringBuilder
import java.util.logging.Logger;

import model.dec.SalleCinemaItf;
import model.exceptions.SalleEstPleine;

/*
*  model Salle de cinema
*/

public  class SalleCinema implements SalleCinemaItf
{

    private static final Logger LOG = Logger.getLogger(SalleCinema.class.getCanonicalName());

    private  String film;
    private  double prix;
    public final int nbPlaces;      
    private int nbPlaceVendues;

    public SalleCinema ( String film, int nbPlaces, double prix)
    {
        this.film = film;
        this.nbPlaces = nbPlaces;
        this.nbPlaceVendues = 0;
        this.prix = prix;
    }

    public void vendrePlace() throws SalleEstPleine {

        try{
            if (nbPlacesDisponible() == 0)
            {

                throw new SallePleine("Salle remplie");
            }

        }catch(SalleEstPleine ex){

            LOG.severe("La salle est déjà remplie, elle contient " +nbPlacesVendues()+ " personnes");

            throw ex;
        } finally {

            this.nbPlaceVendues++;
        }
    }

    public double tauxRemplissage()
    {
        double a = (double) nbPlaceVendues;
        double b = (double) nbPlaces;
        return (a / b) * 100.0;
    }

    public void estPleine()
    {
    	if(this.nbPlaceVendues == this.nbPlaces)
        {
    		LOG.severe("La salle de cinema est pleine");
        }

        else{

            LOG.severe("Il reste " +nbPlacesDisponibles()+ "places disponibles dans la salle");
        }
    }


    public int nbPlacesDisponibles()
    {
    	return (this.nbPlaces - this.nbPlaceVendues);
    }

    public double ChiffresdAffaires()
    {
        return (this.nbPlaceVendues * this.prix);
    }

    
    public String getFilm()
    {
    	return this.film;
    }

    
    public double getPrix()
    {
    	return this.prix;
    }

    
    public int getNbPlaces()
    {
    	return this.nbPlaces;
    }

    
    public int getNbPlaceVendues()
    {
    	return this.nbPlaceVendues;
    }
    
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Film projeté : ").append(this.film).append("\n")
                .append("Tarif : ").append(this.prix).append("€\n")
                .append("Nombre de places : ").append(this.nbPlaces).append("\n")
                .append("Nombre de places disponibles : ").append(nbPlacesDisponibles()).append("\n")
                .append("Taux de remplissage : ").append(tauxRemplissage()).append("\n")
                .append("Chiffre d'affaires : ").append(chiffredAffaires()).append("\n");
        return sb.toString();
    }



}
