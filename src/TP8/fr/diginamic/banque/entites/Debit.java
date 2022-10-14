package TP8.fr.diginamic.banque.entites;

public class Debit extends Operation {
	public Debit(String dateOperation, double montant) {
		super(dateOperation, montant);
	}
	public String getType() {
		return "Débit";
	}
	public String toString() {
		return getType()+" : -"+super.toString();
	}
}