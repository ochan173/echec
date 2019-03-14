package echec.Pieces;

public class Roi extends Piece {

    private final char REP_ROI = 'r';

    private Roi (Couleur p_couleur) {
        super(p_couleur);
        super.setRepresentation(REP_ROI, p_couleur);
    }

    public static Piece obtenirPiece(Couleur p_couleur) {
        return new Roi(p_couleur);
    }
}
