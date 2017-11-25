package model.decl;

import java.lang.Exception;

import model.decl.Tarif;
import model.exceptions.Parcplein;

public interface ParcAttraction{

	int nbPlacesDispo();

	void vendreBillet( int nb, Tarif tarif) throws Parcplein;

	void reinitialise();

	double chriffreAffaire();

	void tauxRemplissage();
}