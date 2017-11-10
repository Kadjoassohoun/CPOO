package model.fact;

import model.dec.SalleCinemaItf;
import model.impl.SalleCinema;

public final class SalleFactory {

  public SalleCinemaItf createSalleCinema(String film, int nbPlaces, double prix)
  {

  	return new SalleCinema(film, nbPlaces, prix);
  }
  
}