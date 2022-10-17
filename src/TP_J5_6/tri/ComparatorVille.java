package TP_J5_6.tri;

import java.util.Comparator;

import TP_J5_6.listes.Ville;
public class ComparatorVille implements Comparator<Ville> {
	@Override
	public int compare(Ville v1, Ville v2) {
		return v1.getVille().compareTo(v2.getVille());//tri par nom de ville
	}
}