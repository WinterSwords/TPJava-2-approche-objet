package TP_J3_4.fr.diginamic.maison;

import TP_J3_4.fr.diginamic.maison.Piece;

public class Salon extends Piece{
	public Salon(int etage, double superficie) {
		super(etage, superficie);
	}
	@Override
	public String getType() {
		return "Salon";
	}
}