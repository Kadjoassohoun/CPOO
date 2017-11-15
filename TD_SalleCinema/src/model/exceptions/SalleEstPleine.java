package model.exceptions;

import java.lang.Exception;


public final class SalleEstPleine extends Exception {

	public SalleEstPleine(){

		super();
	}

	public SalleEstPleine(String message){

		super(message);
	}
}