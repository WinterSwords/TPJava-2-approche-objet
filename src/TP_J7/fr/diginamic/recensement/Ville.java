package TP_J7.fr.diginamic.recensement;

public class Ville extends Departement{
	int codeCommune;
	String nomCommune;
	Integer population;
	
	public Ville(int codeRegion, String nomRegion, String nomdepartement, int codeCommune, String nomCommune, int population) {
		super(codeRegion, nomRegion, nomdepartement);
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.population = population;
	}
	
	public String toString() {
		return "Ville :" +codeCommune+"("+nomCommune+"), departement :"+nomDepartement+", Région :"+codeRegion+"("+nomRegion+")";
	}

	public int getPopulation() {
		return population;
	}
	public int getCodeCommune() {
		return codeCommune;
	}
	public void setCodeCommune(int codeCommune) {
		this.codeCommune = codeCommune;
	}
	public String getNomCommune() {
		return nomCommune;
	}
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
}