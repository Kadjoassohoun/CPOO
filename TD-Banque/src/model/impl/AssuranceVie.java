package model.impl;

import java.util.Calendar;
 
/**
* Model a check account
*/

public  final class AssuranceVie extends Compte {

	//private final Calendar creatD;

	private final float interestR;

	public AssuranceVie(String owner, double initialBalance, float interestR){

		super(owner, initialBalance);
		//this.creatD = Calendar.getInstance();
	}

	public AssuranceVie(String owner){
		super(owner);
		this.creatD = Calendar.getInstance();
	} 
	
	/* public Calendar getCreatD() {

		return this.creatD;
	}
	*/

	@Override
	public double withdraw(double amount){
		double previous = this.getBalance();
		if(this.creatD.compareTo(Calendar.getInstance())) {
			this.setBalance(previous - amount);
		}
		return this.getBalance();

	}

	@Override
	public double deposite(double amount){
		double previous = this.getBalance();
		this.setBalance(previous + amount);
		return this.getBalance();
	}
}
