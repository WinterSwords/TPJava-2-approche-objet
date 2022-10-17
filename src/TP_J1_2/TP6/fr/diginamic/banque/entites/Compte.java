package TP_J1_2.TP6.fr.diginamic.banque.entites;

public class Compte {
	int numeroCompte;
	int solde;
	public Compte(int numeroCompte, int solde) {
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}
	public String toString() {
		return "Le compte n°"+numeroCompte+" à une solde de "+solde;
	}
}