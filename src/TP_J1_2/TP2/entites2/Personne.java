package TP_J1_2.TP2.entites2;

import TP_J1_2.TP2.entites.AdressePostale;

public class Personne {
	public AdressePostale adresse = new AdressePostale();
	public String prenom;
	public String nom;
	
	public Personne(String prenom, String nom, AdressePostale adresse) {
		this.adresse = adresse;
		this.prenom = prenom;
		this.nom = nom;
	}
	public Personne(String prenom, String nom) {
		this.adresse = null;
		this.prenom = prenom;
		this.nom = nom;
	}
}