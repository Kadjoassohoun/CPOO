package model.exceptions;

import java.lang.Exception;


public final class ParcPleine extends Exception {

	public ParcPleine(){

		super();
	}

	public ParcPleine(String msg){

		super(msg);
	}
}