package TP_J5_6.fichier;

public class Ville {
	String nomVille;
	String codeDep;
	String nomRegion;
	int hab;
	
	public Ville(String nomVille, String codePostal, String nomRegion, int hab) {
		this.nomVille = nomVille;
		this.codeDep = codePostal;
		this.nomRegion = nomRegion;
		this.hab = hab;
	}
	
	public String getNom() {
		return nomVille;
	}
	public void setNom(String nomVille) {
		this.nomVille = nomVille;
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