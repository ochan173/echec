package echec.Pieces;

public class Reine extends Piece {

    private final char REP_REINE = 'd';

    private Reine(Couleur p_couleur) {
        super(p_couleur);
        super.setRepresentation(REP_REINE, p_couleur);
    }

    @Override
    public TypePiece getTypePiece() {
        return TypePiece.Reine;
    }

    public static Piece obtenirPiece(Couleur p_couleur) {
        return new Reine(p_couleur);
    }
}
