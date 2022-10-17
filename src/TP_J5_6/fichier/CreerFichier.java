package TP_J5_6.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
	public static void main(String[] args) throws IOException {
		String ch = "C:\\Users\\Goré Gunval\\3D Objects\\moi\\Programmation\\Diginamic\\Projet en ligne (sur GitHub)\\TP Java\\2-approche-objet\\Doc TP\\J5 & J6 - Collections et fichiers\\TP\\recensement.csv";
		Path path = Paths.get(ch);
		
		if(!Files.isReadable(path)) {
			System.out.println("Fichier illisible");
			System.exit(0);
		}
		List<String> donnees=Files.readAllLines(path,StandardCharsets.UTF_8);

		List<String> donnees2 = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			donnees2.add(donnees.get(i));
		}
		
		Path newFile = Paths.get(path.getParent()+"\\recensement99.csv");
		Files.write(newFile, donnees2);
	}
}