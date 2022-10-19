package TP_J7.fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1-o2;
	}
}