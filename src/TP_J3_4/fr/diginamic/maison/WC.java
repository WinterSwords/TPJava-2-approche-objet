package TP_J3_4.fr.diginamic.maison;

import TP_J3_4.fr.diginamic.maison.Piece;

public class WC extends Piece{
	public WC(int etage, double superficie) {
		super(etage, superficie);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getType() {
		return "WC";
	}
}