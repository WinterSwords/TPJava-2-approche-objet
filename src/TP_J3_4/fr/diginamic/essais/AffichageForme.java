package TP_J3_4.fr.diginamic.essais;

import TP_J3_4.fr.diginamic.formes.*;

public class AffichageForme {
	public void afficher(Forme forme) {
		System.out.println("Périmètre : "+forme.calculerPerimetre()+", Aire : "+forme.calculerSurface());
	}
}