package TP_J1_2.TP5.fr.diginamic.banque.entites;

public class Compte {
	int numeroCompte;
	double solde;
	public Compte(int numeroCompte, double solde) {
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}
	public int getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
}