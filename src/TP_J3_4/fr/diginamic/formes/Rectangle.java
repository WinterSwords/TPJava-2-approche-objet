package TP_J3_4.fr.diginamic.formes;

public class Rectangle extends Forme{
	double longueur;
	double largeur;
	
	public Rectangle() {
		super();
	}
	public Rectangle(double lon, double lar) {
		longueur=lon;
		largeur=lar;
	}
	public double calculerSurface() {
		return longueur*largeur;
	}
	public double calculerPerimetre() {
		return 2*(longueur+largeur);
	}
}