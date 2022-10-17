package TP_J1_2.TP8.fr.diginamic.banque.entites;

public class Credit extends Operation {
	public Credit(String dateOperation, double montant) {
		super(dateOperation, montant);
	}
	public String getType() {
		return "Crédit";
	}
	public String toString() {
		return getType()+" : +"+super.toString();
	}
}