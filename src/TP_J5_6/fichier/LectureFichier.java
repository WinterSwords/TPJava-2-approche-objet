package TP_J5_6.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier {
	public static void main(String[] args) throws IOException {
		String ch = "C:\\Users\\Goré Gunval\\3D Objects\\moi\\Programmation\\Diginamic\\Projet en ligne (sur GitHub)\\TP Java\\2-approche-objet\\Doc TP\\J5 & J6 - Collections et fichiers\\TP\\recensement.csv";
		Path path = Paths.get(ch);
		
		if(!Files.isReadable(path)) {
			System.out.println("Fichier illisible");
			System.exit(0);
		}
		
		List<String> donnees=Files.readAllLines(path,StandardCharsets.UTF_8);
		System.out.println(donnees);
		for(String d : donnees) {
			System.out.println(d);
		}
	}
}