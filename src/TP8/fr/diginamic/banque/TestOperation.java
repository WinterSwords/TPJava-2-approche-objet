package TP8.fr.diginamic.banque;

import TP8.fr.diginamic.banque.entites.*;

public class TestOperation {
	public static void main(String[] args) {
		Operation[] tablOp = new Operation[4];
		tablOp[0] = new Credit("10 semptembre", 50);
		tablOp[1] = new Debit("15 janvier", 500);
		tablOp[2] = new Credit("29 septembre", 2);
		tablOp[3] = new Debit("35 Mars", 40);
		
		for (int i = 0; i < tablOp.length; i++) {
			System.out.println(tablOp[i]);
		}
	}
}