package TP_J1_2.TP1.entites;

import TP_J1_2.TP1.entites2.Personne;

public class TestPersonne {
	public static void main(String[] args) {
		
		Personne pers1 = new Personne();
		AdressePostale adresse1 = new AdressePostale();
		adresse1.codePostale=35120;
		adresse1.numeroDeRue=123;
		adresse1.libelleRue="Place de la Contrescarpe";
		adresse1.ville="Cork";
		pers1.adresse=adresse1;
		pers1.prenom="Nyx";
		pers1.nom="Rek";
		
		Personne pers2 = new Personne();
		AdressePostale adresse2 = new AdressePostale();
		adresse2.codePostale=35400;
		adresse2.numeroDeRue=88;
		adresse2.libelleRue="La claye";
		adresse2.ville="Reykjavik";
		pers2.adresse=adresse2;
		pers2.prenom="Eris";
		pers2.nom="Eorg";
	}
}