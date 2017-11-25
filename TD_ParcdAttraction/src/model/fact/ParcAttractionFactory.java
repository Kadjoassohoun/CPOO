package model.fact;

import model.decl.ParcAttractionItf;
import model.impl.ParcAttraction;

public final class ParcAttractionFactory {

  public ParcAttractionItf createParcAttraction(String nomP, int cap, double tarif, double nbc)
  {

  	return new ParcAttraction(nomP, cap, tarif, nbc);
  }
  
}