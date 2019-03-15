package echec.Pieces;

public class Pion extends Piece {

    private final char REP_PION = 'p';

    private Pion(Couleur p_couleur) {
        super(p_couleur);
        super.setRepresentation(REP_PION, p_couleur);
    }

    @Override
    public TypePiece getTypePiece() {
        return TypePiece.Pion;
    }

    public static Piece obtenirPiece(Couleur p_couleur) {
        return new Pion(p_couleur);
    }
}
