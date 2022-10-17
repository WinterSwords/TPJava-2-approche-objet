package TP6.fr.diginamic.banque;

import TP6.fr.diginamic.banque.entites.Compte;

public class TestCompte {
	public static void main(String[] args) {
		Compte c1 = new Compte(1,200);
		System.out.println(c1.toString());
		System.out.println(c1);//pareil toString automatique
	}
}