package TP_J5_6.listes;

import java.util.ArrayList;

public class TestVille {
	public static void main(String[] args) {
		ArrayList<Ville> liste = new ArrayList<Ville>();
			liste.add(new Ville("Nice", 343000));
			liste.add(new Ville("Carcasonne", 47800));
			liste.add(new Ville("Narbonne", 53400));
			liste.add(new Ville("Lyon", 484000));
			liste.add(new Ville("Foix", 9700));
			liste.add(new Ville("Pau", 77200));
			liste.add(new Ville("Marseille", 850700));
			liste.add(new Ville("Tarbes", 40600));
		
		// Part 1
		Ville maxHab=new Ville(liste.get(0).ville,liste.get(0).nbHabitant);
		for(int i=1;i<liste.size();i++) {
			if(maxHab.nbHabitant<liste.get(i).nbHabitant) {
				maxHab.setNbHabitant(liste.get(i).nbHabitant);
				maxHab.setVille(liste.get(i).ville);
			}
		}
		System.out.println("Ville la plus peuplé : "+maxHab.getVille());
		
		// Part 2
		int index=0;
		Ville minHab=new Ville(liste.get(0).ville,liste.get(0).nbHabitant);
		for(int i=0;i<liste.size();i++) {
			if(minHab.nbHabitant>liste.get(i).nbHabitant) {
				minHab.setNbHabitant(liste.get(i).nbHabitant);
				minHab.setVille(liste.get(i).ville);
				index=i;
			}
		}
		liste.remove(index);
		
		// Part 3
		for(int i=0;i<liste.size();i++) {
			if(100000<liste.get(i).nbHabitant) {
				liste.get(i).setVille(liste.get(i).ville.toUpperCase());
			}
		}
		
		// Part 4
		System.out.println("Liste : "+liste);
	}
}