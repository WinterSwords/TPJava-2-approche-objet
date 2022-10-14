package TP_J3_4.fr.diginamic.entites;

public class Cercle {
	double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	public double perimetre() {
		return 2*Math.PI*rayon;
	}
	public double surface() {
		return Math.PI*Math.pow(rayon, 2);
	}
}