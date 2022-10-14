package TP_J3_4.fr.diginamic.essais;

import TP_J3_4.fr.diginamic.entites.Theatre;

public class TestTheatre {
	public static void main(String[] args) {
		Theatre tnb = new Theatre("TNB",20);
		tnb.inscrit(16, 10);
		tnb.inscrit(8, 10);
		tnb.inscrit(4, 10);
		System.out.println("Nombre de visiteurs : "+tnb.getInscrit()+", Bénéfice : "+tnb.getRecette());
	}
}