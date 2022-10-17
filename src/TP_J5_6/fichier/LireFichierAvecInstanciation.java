package TP_J5_6.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LireFichierAvecInstanciation {
	public static void main(String[] args) throws IOException {
		//Q4
		ArrayList<Ville> ville = new ArrayList<>();
		//Q5
		String ch = "C:\\Users\\Goré Gunval\\3D Objects\\moi\\Programmation\\Diginamic\\Projet en ligne (sur GitHub)\\TP Java\\2-approche-objet\\Doc TP\\J5 & J6 - Collections et fichiers\\TP\\recensement.csv";
		Path path = Paths.get(ch);
		
		List<String> donnees=Files.readAllLines(path,StandardCharsets.UTF_8);
		
		for(int i=1;i<100;i++) {
			String[] tokens = donnees.get(i).trim().split(";");
			int pop = Integer.parseInt(tokens[9].replaceAll("\\s", ""));
			ville.add(new Ville(tokens[6],tokens[2],tokens[1], pop));
		}
	}
}