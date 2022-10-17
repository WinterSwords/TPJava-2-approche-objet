package TP_J3_4.fr.diginamic.maison;

public class WC extends Piece{
	public WC(int etage, double superficie) {
		super(etage, superficie);
	}
	@Override
	public String getType() {
		return "WC";
	}
}