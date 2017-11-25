package model.decl;

public enum Tarif{

	ILLIMITE("tarif normal illimite"),
	ILLIMITE5("tarif normal illimite 5"),
	REDUIT("Tarif reduit illimite "),
	REDUIT5("Tarif reduit illimite 5");

	private Tarif(String nom)
	{
		this.nom = nom;
	}

	public String getNom()
	{
		return this.nom;
	}

	private final String nom;

}