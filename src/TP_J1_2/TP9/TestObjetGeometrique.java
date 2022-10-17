package TP_J1_2.TP9;

public class TestObjetGeometrique {
	public static void main(String[] args) {
		ObjetGeometrique[] tablOb = new ObjetGeometrique[2];
		tablOb[0] = new Cercle(2);
		tablOb[1] = new Rectangle(2,5);
		
		for (int i = 0; i < tablOb.length; i++) {
			System.out.println(tablOb[i]);
		}
	}
}