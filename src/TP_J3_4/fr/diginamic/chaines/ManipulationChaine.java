package TP_J3_4.fr.diginamic.chaines;

import TP_J3_4.fr.diginamic.entites.Salarie;

public class ManipulationChaine {
	public static void main(String[] args) {
		String chaine= "Durand;Marcel;2523.5";
		
		char premierCaractere= chaine.charAt(0);
		System.out.println("Premier caractère: "+ premierCaractere);
		System.out.println("Longueur de la chaine: "+ chaine.length());
		System.out.println("Premier ';' au caractère n°"+ chaine.indexOf(';'));
		
		String nom= chaine.substring(0, chaine.indexOf(';'));
		System.out.println(nom.toUpperCase());
		System.out.println(nom.toLowerCase());
		
		String tabPers[]=chaine.split(";");
		System.out.println(tabPers[0]);
		System.out.println(tabPers[1]);
		System.out.println(tabPers[2]);
		
		Salarie durand = new Salarie(tabPers[0],tabPers[1],Double.parseDouble(tabPers[2].replace(" ","")));
	}
}