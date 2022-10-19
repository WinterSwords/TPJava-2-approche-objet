package TP_J7.fr.diginamic.recensement;

public class Region {
	int codeRegion;
	String nomRegion;
	
	public Region(int codeRegion, String nomRegion) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
	}
	
	public int getCodeRegion() {
		return codeRegion;
	}
	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}
	public String getNomRegion() {
		return nomRegion;
	}
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
}