package TP_J5_6.listes;

public class Ville implements Comparable<Ville>{
	String ville;
	int nbHabitant;
	public Ville(String ville, int nbHabitant) {
		this.ville = ville;
		this.nbHabitant = nbHabitant;
	}
	public String toString(){
		return "\nnom : "+ville+", Habitant : "+nbHabitant;
	}
	
	//compareTo : Ajout TP 13
	@Override
	public int compareTo(Ville autreVille) {
		 //return this.ville.compareTo(autreVille.getVille());//tri par nom
		return nbHabitant-autreVille.getNbHabitant();//tri par habitant
	}
	
	//Get et set
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