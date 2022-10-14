package TP7.fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
	double taux;

	public CompteTaux(int numeroCompte, double solde, double taux) {
		super(numeroCompte, solde);
		this.taux = taux;
	}
	@Override //Indique une redifinision de méthode
	public String toString() {
		return super.toString()+" à un taux de "+taux+"%";
	}
}