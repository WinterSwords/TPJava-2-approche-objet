package TP2.entites;

import TP2.entites2.Personne;

public class TestPersonne {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne pers1 = new Personne("Nyx", "Rek");
		AdressePostale adresse1 = new AdressePostale(35120, "Cork", 123, "Place de la Contrescarpe");
		pers1.adresse = adresse1;
		
		AdressePostale adresse2 = new AdressePostale(35400, "Reykjavik", 88, "La claye");
		Personne pers2 = new Personne("Eris", "Eorg", adresse2);
	}
}