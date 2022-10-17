package TP_J1_2.TP9;

public class Cercle extends ObjetGeometrique{
	double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
		surface=Math.PI*Math.pow(rayon, 2);
		perimetre=2*Math.PI*rayon;
	}
}