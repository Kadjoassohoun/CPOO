package model.decl;



public interface SalleCinemaItf{


	void vendrePlace();

	double tauxRemplissage();

	void estPleine();

	int nbPlacesDisponibles();

	double ChiffresdAffaires();

	String getFilm();

	int getNbPlaces();

	double getPrix();

	int getNbPlaceVendues();
}


