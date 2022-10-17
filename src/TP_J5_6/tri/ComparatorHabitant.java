package TP_J5_6.tri;

import java.util.Comparator;
import TP_J5_6.listes.Ville;

public class ComparatorHabitant implements Comparator<Ville> {
	@Override
	public int compare(Ville v1, Ville v2) {
		return v1.getNbHabitant()-v2.getNbHabitant();//tri par habitant
	}
}