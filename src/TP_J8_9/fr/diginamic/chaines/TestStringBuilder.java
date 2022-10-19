package TP_J8_9.fr.diginamic.chaines;

public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		long debut = System.currentTimeMillis();
		for(int i=1;i<=100000;i++) {
			s.append(i);
		}
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
		
		String s2 = "";
		debut = System.currentTimeMillis();
		for(int i=1;i<=100000;i++) {
			s2+=i;
		}
		fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
	}
}