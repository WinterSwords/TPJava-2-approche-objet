package TP_J1_2.TP9;

public class ObjetGeometrique {
	double perimetre;
	double surface;
	
	double perimetre() {
		return perimetre;
	}
	double surface() {
		return surface;
	}
	public String toString(){
		return "Perimètre : "+perimetre+", Aire : "+surface;
	}
}