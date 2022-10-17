package TP7.fr.diginamic.banque;

import TP7.fr.diginamic.banque.entites.*;

public class TestCompte {
	public static void main(String[] args) {
		CompteTaux c1 = new CompteTaux(1,200,0.5);
		System.out.println(c1);//quand que c1 prinln execute c1.toString
		
		Compte[] tabCompte = new Compte[2];
		tabCompte[0]=new Compte(2,400);
		tabCompte[1]=new CompteTaux(3,256,0.75);
		for(int i=0;i<tabCompte.length;i++) {
			System.out.println(tabCompte[i]);
		}
	}
}