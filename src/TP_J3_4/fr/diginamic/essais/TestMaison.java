package TP_J3_4.fr.diginamic.essais;

import TP_J3_4.fr.diginamic.maison.Chambre;
import TP_J3_4.fr.diginamic.maison.Maison;

public class TestMaison {
	public static void main(String[] args) {
		Chambre c = new Chambre(1,8);
		Chambre c2 = new Chambre(1,-5);
		
		Maison m1 = new Maison();
		m1.ajouterPiece(c);
		m1.ajouterPiece(c2);
		System.out.println(m1.getSuperficieTotale());
	}
}