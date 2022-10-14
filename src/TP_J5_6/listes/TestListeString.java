package TP_J5_6.listes;

import java.util.ArrayList;

public class TestListeString {
	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<String>();
			liste.add("Nice");
			liste.add("Carcassonne");
			liste.add("Narbonne");
			liste.add("Lyon");
			liste.add("Foix");
			liste.add("Pau");
			liste.add("Marseille");
			liste.add("Tarbes");
		String motLong="";
		for(int i=0;i<liste.size();i++) {
			if (motLong.length()<liste.get(i).length()) {
				motLong=liste.get(i);
			}
		}
		for(int i=0;i<liste.size();i++) {
			liste.set(i, liste.get(i).toUpperCase());
		}
		for(int i=0;i<liste.size();i++) {
			if(liste.get(i).charAt(0)=='N') {
				liste.remove(i--);
			}
		}
		System.out.println("Valeurs de la liste : "+liste);
	}
}