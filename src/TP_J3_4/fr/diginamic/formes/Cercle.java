package TP_J3_4.fr.diginamic.formes;

public class Cercle extends Forme{
	double rayon;
	
	public Cercle(double ray) {
		rayon=ray;
	}
	
	public double calculerSurface() {
		return 2*rayon*Math.PI;
	}
	public double calculerPerimetre() {
		return Math.PI*Math.pow(rayon, 2);
	}
}