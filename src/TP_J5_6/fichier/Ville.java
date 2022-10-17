package TP_J5_6.fichier;

public class Ville {
	String nom;
	String codeDep;
	String nomRegion;
	int hab;
	
	public Ville(String nom, String codePostal, String nomRegion, int hab) {
		this.nom = nom;
		this.codeDep = codePostal;
		this.nomRegion = nomRegion;
		this.hab = hab;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCodePostal() {
		return codeDep;
	}
	public void setCodePostal(String codePostal) {
		this.codeDep = codePostal;
	}
	public String getNomRegion() {
		return nomRegion;
	}
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
	public int getHab() {
		return hab;
	}
	public void setHab(int hab) {
		this.hab = hab;
	}
}