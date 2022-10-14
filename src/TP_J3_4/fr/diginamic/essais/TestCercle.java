package TP_J3_4.fr.diginamic.essais;

import TP_J3_4.fr.diginamic.entites.Cercle;
import TP_J3_4.fr.diginamic.untils.CercleFactory;

public class TestCercle {
	public static void main(String[] args) {
		{// part Exercice Cercle
			Cercle[] tabCercle = new Cercle[2];
			tabCercle[0]=new Cercle (2);
			tabCercle[1]=new Cercle (4);
			
			for(int i = 0;i<tabCercle.length;i++) {
				System.out.println("Perimètre : "+tabCercle[i].perimetre()+", Aire : "+tabCercle[i].surface());
			}	
		}
		{// part Exercice CercleFactory
			Cercle c1 = CercleFactory.CercleBuild(2);
		}
	}
}