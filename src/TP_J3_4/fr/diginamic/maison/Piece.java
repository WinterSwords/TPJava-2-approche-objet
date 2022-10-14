package TP_J3_4.fr.diginamic.maison;

public abstract class Piece {
	int etage;
	double superficie;
	
	public Piece(int etage, double superficie) {
		this.etage = etage;
		this.superficie = superficie;
	}
	public abstract String getType();
}