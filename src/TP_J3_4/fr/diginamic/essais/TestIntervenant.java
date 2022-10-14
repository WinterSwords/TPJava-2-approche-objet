package TP_J3_4.fr.diginamic.essais;

import TP_J3_4.fr.diginamic.salaire.*;

public class TestIntervenant {
	public static void main(String[] args) {
		Pigiste p = new Pigiste(80,10,"Eorg","Nyx");
		Salarie s = new Salarie(1000,"CDD","Roge","Ouranos");
		
		System.out.println(p.getSalaire());
		System.out.println(s.getSalaire());
		
		System.out.println(p.afficherDonnees());
		System.out.println(s.afficherDonnees());
	}
}