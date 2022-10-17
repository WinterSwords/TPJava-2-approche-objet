package TP_J1_2.TP5.fr.diginamic.banque;

import TP_J1_2.TP5.fr.diginamic.banque.entites.Compte;

public class TestCompte {
	public static void main(String[] args) {
		Compte c1 = new Compte(1,200);
		System.out.println(c1);
		//Affiche "TP5.fr.diginamic.banque.entites.Compte@3e57cd70"
		//Besoin de redéfinir la méthode toString()
	}
}