package TP_J3_4.fr.diginamic.essais;

import TP_J3_4.fr.diginamic.formes.*;

public class TestForm {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(4,5);
		Cercle c = new Cercle(4);
		Carre s = new Carre (5);
		
		AffichageForme a = new AffichageForme();
		a.afficher(r);
		a.afficher(c);
		a.afficher(s);
	}
}