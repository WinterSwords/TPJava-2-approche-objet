package TP_J3_4.fr.diginamic.essais;

import TP_J3_4.fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
	public static void main(String[] args) {
		CalculMoyenne calcMoy = new CalculMoyenne();
		System.out.println(calcMoy.Calcul());
		calcMoy.Ajout(4);
		calcMoy.Ajout(8);
		System.out.println(calcMoy.Calcul());
	}
}