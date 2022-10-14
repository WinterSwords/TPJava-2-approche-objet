package TP_J3_4.fr.diginamic.salaire;

public class Salarie extends Intervenant{
	double salaire;
	String contrat;
	
	public Salarie(double salaire, String contrat, String nom, String prenom) {
		super(nom,prenom);
		this.salaire = salaire;
		this.contrat = contrat;
	}
	

	@Override
	public String afficherDonnees() {
		return super.afficherDonnees()+", Type de contrat : "+contrat+", Salaire mensuel : "+salaire;
	}
	public double getSalaire() {
		return salaire;
	}
}