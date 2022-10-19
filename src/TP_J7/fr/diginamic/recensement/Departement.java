package TP_J7.fr.diginamic.recensement;

public class Departement extends Region{
	String nomDepartement;
	
	public Departement(int codeRegion, String nomRegion, String nomDepartement) {
		super(codeRegion,nomRegion);
		this.nomDepartement = nomDepartement;
	}

	public String getNomDepartement() {
		return nomDepartement;
	}
	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}
}