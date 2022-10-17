package TP_J1_2.TP8.fr.diginamic.banque.entites;

public class Operation {
	String dateOperation;
	double montant;
	
	public Operation(String dateOperation, double montant) {
		this.dateOperation = dateOperation;
		this.montant = montant;
	}
	public String getType() {
		return "";
	}
	public String toString() {
		return montant+" sur le compte le "+dateOperation;
	}
}