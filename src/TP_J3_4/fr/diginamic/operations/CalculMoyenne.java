package TP_J3_4.fr.diginamic.operations;

public class CalculMoyenne {
	double[] tabDouble=new double[0];
	public void Ajout(double a) {
		double[] tabTemp=new double[tabDouble.length+1];
		for(int i=0;i<tabDouble.length;i++) {
			tabTemp[i]=tabDouble[i];
		}
		tabTemp[tabDouble.length]=a;
		tabDouble=tabTemp;
	}
	public double Calcul() {
		double cumul=0;
		for(int i=0;i<tabDouble.length;i++) {
			cumul+=tabDouble[i];
		}
		if(tabDouble.length>0) {
			return (cumul/tabDouble.length);
		}else {
			return 0;
		}
	}
}