package TP_J7.fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws IOException {
		Recensement r = new Recensement();
		r.ajoutVilleFichier("C:\\Users\\Goré Gunval\\3D Objects\\moi\\Programmation\\Diginamic\\Projet en ligne (sur GitHub)\\TP Java\\2-approche-objet\\Doc TP\\7 - Langage Java - Approche Objet\\J7 - TP\\TP Java - 16 Recensement fichier (2016).csv");
		
		r.afficherDonnees();
		
		String[] plusPeupleRegion = r.PlusPeuple10Region();
		for(int i=0;i<10;i++) {
			System.out.println(plusPeupleRegion[i]);
		}
		
		Scanner scanner = new Scanner(System.in);
		int q=0;
		while(q!=9) {
			System.out.println("1. Population d’une ville donnée\n2. Population d’un département donné");
			System.out.println("3. Population d’une région donnée\n4. Afficher les 10 régions les plus peuplées");
			System.out.println("5. Afficher les 10 départements les plus peuplés\n6. Afficher les 10 villes les plus peuplées d’un département");
			System.out.println("7. Afficher les 10 villes les plus peuplées d’une région\n8. Afficher les 10 villes les plus peuplées de France");
			System.out.println("9. Sortir");
			
			System.out.println("Entrez le numéro de la donnée voulue");
			q=scanner.nextInt();
			
			switch (q) {
			case 1: {
				
			}
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:break;
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + q);
			}
		}
		System.out.println("Au revoir ! Passez une agreable journée.");
	}
}