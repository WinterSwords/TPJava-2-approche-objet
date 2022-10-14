package TP_J5_6.listes;

public class Ville {
	String ville;
	int nbHabitant;
	public Ville(String ville, int nbHabitant) {
		this.ville = ville;
		this.nbHabitant = nbHabitant;
	}
	public String toString(){
		return "nom : "+ville+", Habitant : "+nbHabitant;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getNbHabitant() {
		return nbHabitant;
	}
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
}