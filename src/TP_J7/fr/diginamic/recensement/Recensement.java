package TP_J7.fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Recensement {
	ArrayList<Ville> liste = new ArrayList<>();
	
	public void ajoutVilleFichier(String file) throws IOException {
		Path path = Paths.get(file);
		List<String> donnees=Files.readAllLines(path,StandardCharsets.UTF_8);

		for(int i=1;i<donnees.size();i++) {
			String[] tokens = donnees.get(i).trim().split(";");
			int codeR = Integer.parseInt(tokens[0].replaceAll("\\s", ""));
			int codeC = Integer.parseInt(tokens[5].replaceAll("\\s", ""));
			int pop = Integer.parseInt(tokens[9].replaceAll("\\s", ""));
			liste.add(new Ville(codeR, tokens[1], tokens[2], codeC, tokens[6], pop));
		}
	}
	
	
	public void ajoutVilleUnique(int codeR, String nomR, String nomD, int codeC, String nomC, int pop) {
		liste.add(new Ville(codeR, nomR, nomD, codeC, nomC, pop));
	}
	
	public void afficherDonnees() {
		System.out.println(liste);
	}
	
	public String[] PlusPeuple10Region() {
		HashMap<String, Integer> listeRegion = new HashMap<>();
		int info=0;
		for(Ville v : liste) {//Récupérer la population par Région
			for(String h : listeRegion.keySet()) {
				if(v.getNomRegion()==h) {
					listeRegion.replace(h, listeRegion.get(h), listeRegion.get(h)+v.getPopulation());
					info = 1;
					break;
				}
			}
			if(info==0){
				listeRegion.put(v.nomRegion, v.getPopulation());
			}
			info=0;
		}
		//Collections.sort(listeRegion.values(),new ComparatorHabitant());//utilise compare de ComparatorHabitant
		
		String[] tabRegion = new String[10];
		String temp="";
		for(String cleListe : listeRegion.keySet()) {
			for(int i=0;i<10;i++) {
				System.out.println("cleListe :"+cleListe);
				//if(listeRegion.get(tabRegion[i]) < listeRegion.get(cleListe) || tabRegion[i]==null) {
					temp=tabRegion[i];
					tabRegion[i]=cleListe;
					cleListe=temp;
				//}
			}
		}
		return tabRegion;
	}
	public String[] PlusPeuple10Department() {
		return null;
	}
}