package TP_J3_4.fr.diginamic.maison;

import TP_J3_4.fr.diginamic.maison.Piece;

public class Chambre extends Piece{
	public Chambre(int etage, double superficie) {
		super(etage, superficie);
	}
	@Override
	public String getType() {
		return "Chambre";
	}
}