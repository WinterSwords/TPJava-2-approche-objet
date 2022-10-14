package TP3.entites2;

import TP3.entites.AdressePostale;

public class Personne {
	public AdressePostale adresse;
	public String prenom;
	public String nom;
	
	public Personne(String prenom, String nom,AdressePostale adresse2) {
		this.adresse = adresse2;
		this.prenom = prenom;
		this.nom = nom;
	}
	public Personne(String prenom, String nom) {
		this.adresse = null;
		this.prenom = prenom;
		this.nom = nom;
	}
	public void afficheNom() {
		System.out.println(nom.toUpperCase()+" "+prenom);
	}
	public AdressePostale getAdresse() {
		return adresse;
	}
	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}