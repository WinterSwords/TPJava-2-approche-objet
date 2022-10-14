package TP_J3_4.fr.diginamic.salaire;

public class Pigiste extends Intervenant{
	double salaire;
	double nbJour;
	
	public Pigiste(double salaire, double nbJour, String nom, String prenom) {
		super(nom,prenom);
		this.salaire = salaire;
		this.nbJour = nbJour;
	}

	@Override
	public String afficherDonnees() {
		return super.afficherDonnees()+", Nombre de jour travaillé : "+nbJour+", Salaire journalier : "+salaire;
	}
	public double getSalaire() {
		return salaire*nbJour;
	}
}