package TP_J3_4.fr.diginamic.maison;

public class Maison {
	Piece[] tabMaison = new Piece[0];
	
	public void ajouterPiece(Piece piece){
		if(piece==null) {
			System.out.println("ajout d'une piece null");
		}else if(piece.superficie<0 || piece.etage<0) {
			System.out.println("Refus des données transmis");
		}else {
			Piece[] tabTemp = new Piece[tabMaison.length+1];
			for(int i=0;i<tabMaison.length;i++) {
				tabTemp[i]=tabMaison[i];
			}
			tabTemp[tabMaison.length]=piece;
			tabMaison=tabTemp;
		}
	}
	public double getSuperficieTotale(){
		double cumul=0;
		for(int i=0;i<tabMaison.length;i++) {
			cumul+=tabMaison[i].superficie;
		}
		return cumul;
	}
	public double getSuperficieParEtage(int etage){
		double cumul=0;
		for(int i=0;i<tabMaison.length;i++) {
			if(tabMaison[i].etage==etage) {
				cumul+=tabMaison[i].superficie;
			}
		}
		return cumul;
	}
	public double getSuperficieParTypePiece(String type){
		double cumul=0;
		for(Piece piece : tabMaison) {
			if(piece.getType().equals(type)) {
				cumul+=piece.superficie;
			}
		}
		return cumul;
	}
	public int getNbPieceParTypePiece(String type){
		int cumul=0;
		for(Piece piece : tabMaison) {
			if(piece.getType()==type) {
				cumul++;
			}
		}
		return cumul;
	}
}