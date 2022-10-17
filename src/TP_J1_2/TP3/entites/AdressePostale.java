package TP_J1_2.TP3.entites;

public class AdressePostale {
	int codePostale;
	int numeroDeRue;
	String libelleRue;
	String ville;
	public AdressePostale() {
		this.codePostale = 0;
		this.numeroDeRue = 0;
		this.libelleRue = null;
		this.ville = null;
	}
	public AdressePostale(int codePostale, String ville, int numeroDeRue, String libelleRue) {
		this.codePostale = codePostale;
		this.numeroDeRue = numeroDeRue;
		this.libelleRue = libelleRue;
		this.ville = ville;
	}
}