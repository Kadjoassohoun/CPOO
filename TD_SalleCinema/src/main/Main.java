package main;


import model.SalleCinema;

public final class Main {
    

    public static void main (String[] args) {

        SalleCinema a = new SalleCinema();

        int nbPlace = 1000;

        int nbPlaceVendues = 455;

        double prix = 100.0;

        a.vendrePlace();
        a.tauxRemplissage();
        a.estPleine();
        a.nbPlacesDisponibles();
        a.ChiffresdAffaires();
        
        

        System.out.println(a.toString());
    }
}