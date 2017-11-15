package model.decl;


import java.exceptions.SalleEstPleine;

public interface SalleCinemaItf{


	void vendrePlace() throws SalleEstPleine;

	double tauxRemplissage();

	void estPleine();

	int nbPlacesDisponibles();

	double ChiffresdAffaires();

	String getFilm();

	int getNbPlaces();

	double getPrix();

	int getNbPlaceVendues();
}


