package TP_J1_2.TP1.entites;

public class TestAdressePostale {
	public static void main(String[] args) {
		AdressePostale adresse1 = new AdressePostale();
		adresse1.codePostale=35120;
		adresse1.numeroDeRue=123;
		adresse1.libelleRue="Place de la Contrescarpe";
		adresse1.ville="Cork";
		
		AdressePostale adresse2 = new AdressePostale();
		adresse2.codePostale=35400;
		adresse2.numeroDeRue=88;
		adresse2.libelleRue="La claye";
		adresse2.ville="Reykjavik";
	}
}