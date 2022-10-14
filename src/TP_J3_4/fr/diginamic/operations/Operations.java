package TP_J3_4.fr.diginamic.operations;

public class Operations {
	public static String Calcul(double a, double b, char op) {
		switch (op) {
			case '+': return ""+(a+b);
			case '-': return ""+(a-b);
			case '*':
			case 'x': return ""+(a*b);
			case '/':
			case ':':
			case '÷': return ""+(a/b);
			default : return "Erreur d'opérateur";
		}
	}
}