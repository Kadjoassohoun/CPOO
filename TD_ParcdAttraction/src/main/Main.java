package main;


import java.util.logging.Logger;
import model.impl.ParcAttraction;


public final class Main{


	public static void main(String [] args)
	{
		ParcAttraction p = new ParcAttraction("Parc de Nanterre", 180, 38.5, 28.5);

		p.vendreBillet(24, Tarif.ILLIMITE);
		p.vendreBillet(19, Tarif.ILLIMITE5);
		p.vendreBillet(32, Tarif.REDUIT);
		p.vendreBillet(23, Tarif.REDUIT5);

		System.out.println(p.toString());
		System.out.println("Chiffre d'affaire : " +p.chriffreAffaire());
		System.out.println("Taux de remplissage : " +p.tauxRemplissage());
	}


}
