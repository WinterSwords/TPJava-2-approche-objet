package TP_J3_4.fr.diginamic.entites;

public class Theatre {
	String nom = new String();
	int capaciteMax;
	int inscrit;
	double recette;
	
	public Theatre(String nom, int capaciteMax) {
		this.nom = nom;
		this.capaciteMax = capaciteMax;
	}

	public void inscrit(int nbClient, double prix) {
		if(inscrit+nbClient<=capaciteMax) {
			inscrit+=nbClient;
			recette+=prix*nbClient;
		}else {
			System.out.println("Capacité insuffisante, reste "+(capaciteMax-inscrit)+" places");
		}
	}

	public int getInscrit() {
		return inscrit;
	}
	public double getRecette() {
		return recette;
	}
}