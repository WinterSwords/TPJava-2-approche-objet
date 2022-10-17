package TP4.entites;

import TP4.entites2.Personne;

public class TestPersonne {
	public static void main(String[] args) {
		Personne pers1 = new Personne("Nyx","Rek");
		AdressePostale adresse1 = new AdressePostale(35120,"Cork",123,"Place de la Contrescarpe");
		pers1.adresse=adresse1;
		
		AdressePostale adresse2 = new AdressePostale(35400,"Reykjavik",88,"La claye");
		pers1.adresse=adresse2;
		Personne pers2 = new Personne("Eris","Eorg",adresse2);
		
		pers2.afficheNom();
		pers2.setNom("Roge");
		AdressePostale adresse3 = new AdressePostale(12358,"Reykjavik",88,"La claye");
		pers2.setAdresse(adresse3);
	}
}