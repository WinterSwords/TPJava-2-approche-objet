package TP_J1_2.TP7.fr.diginamic.banque.entites;

public class Compte {
	int numeroCompte;
	double solde;
	
	public Compte(int numeroCompte, double solde) {
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}
	public String toString() {
		return "Le compte n°"+numeroCompte+" à une solde de "+solde;
	}
}