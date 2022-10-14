package TP_J3_4.fr.diginamic.essais;

import TP_J3_4.fr.diginamic.operations.Operations;

public class TestOperateur {
	public static void main(String[] args) {
		System.out.println(Operations.Calcul(2, 4, '+'));
		System.out.println(Operations.Calcul(2, 4, '-'));
		System.out.println(Operations.Calcul(2, 4, '*'));
		System.out.println(Operations.Calcul(2, 4, '/'));
		System.out.println(Operations.Calcul(2, 4, '$'));
	}
}