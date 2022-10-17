package TP_J5_6.listes;

import java.util.ArrayList;

public class TestListeString {
	public static void main(String[] args) {
		//Q2
		ArrayList<String> liste = new ArrayList<String>();
			liste.add("Nice");
			liste.add("Carcassonne");
			liste.add("Narbonne");
			liste.add("Lyon");
			liste.add("Foix");
			liste.add("Pau");
			liste.add("Marseille");
			liste.add("Tarbes");
		//Q3
		String motLong="";
		for(int i=0;i<liste.size();i++) {//ville la plus long (caracteres)
			if (motLong.length()<liste.get(i).length()) {
				motLong=liste.get(i);
			}
		}
		//Q4
		for(int i=0;i<liste.size();i++) {//Mettre les villes en majuscule
			liste.set(i, liste.get(i).toUpperCase());
		}
		//Q5
		for(int i=0;i<liste.size();i++) {//supprimé les villes qui commencent par 'N'
			if(liste.get(i).charAt(0)=='N') {
				liste.remove(i--);
			}
		}
		//Q6
		System.out.println("Valeurs de la liste : "+liste);
	}
}