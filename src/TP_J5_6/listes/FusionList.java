package TP_J5_6.listes;

import java.util.ArrayList;

public class FusionList {
	public static void main(String[] args) {
		ArrayList<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		ArrayList<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		
		//Développements à réaliser ci-dessous
		ArrayList<String> liste3 = new ArrayList<String>();
		for(int i=0;i<liste1.size();i++) {
			liste3.add(liste1.get(i));
		}
		for(int i=0;i<liste2.size();i++) {
			liste3.add(liste2.get(i));
		}
		System.out.println(liste3);
		
		
		ArrayList<String> liste4 = new ArrayList<String>();
		liste4.addAll(liste1);
		liste4.addAll(liste2);
		System.out.println(liste4);
	}
}