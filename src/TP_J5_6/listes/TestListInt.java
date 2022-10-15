package TP_J5_6.listes;

import java.util.ArrayList;

public class TestListInt {
	public static void main(String[] args) {
		ArrayList<Integer> liste = new ArrayList<Integer>();
			liste.add(-1);
			liste.add(5);
			liste.add(7);
			liste.add(3);
			liste.add(-2);
			liste.add(4);
			liste.add(8);
			liste.add(5);
			
		System.out.println("Valeurs de la liste : "+liste);
		
		System.out.println("Longueur de la liste : "+liste.size());
		
		int max=0;
		for(int i=0;i<liste.size();i++) {
			if(max<liste.get(i)){
				max=liste.get(i);
			}
		}
		System.out.println("valeur max : "+max);
		
		int min=0;
		for(int i=0;i<liste.size();i++) {
			if(min>liste.get(i)){
				min=liste.get(i);
			}
		}
		liste.remove(Integer.valueOf(min));
		
		for(int i=0;i<liste.size();i++) {
			liste.set(i, Math.abs(liste.get(i)));
		}
		System.out.println("Liste : "+liste);
	}
}