package TP_J3_4.fr.diginamic.untils;

import TP_J3_4.fr.diginamic.*;
import TP_J3_4.fr.diginamic.entites.Cercle;

public class CercleFactory {
	
	public static Cercle CercleBuild(double rayon) {
		Cercle c = new Cercle(rayon);
		return c;
	}
}