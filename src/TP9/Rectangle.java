package TP9;

public class Rectangle extends ObjetGeometrique{
	double longueur;
	double largeur;
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
		surface=longueur*largeur;
		perimetre=2*longueur+2*largeur;
	}	
}