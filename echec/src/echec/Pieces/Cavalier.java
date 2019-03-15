package echec.Pieces;

public class Cavalier extends Piece {

    private final char REP_CAVALIER = 'c';

    private Cavalier(Couleur p_couleur) {
        super(p_couleur);
        super.setRepresentation(REP_CAVALIER, p_couleur);
    }

    @Override
    public TypePiece getTypePiece() {
        return TypePiece.Cavalier;
    }

    public static Piece obtenirPiece(Couleur p_couleur) {
        return new Cavalier(p_couleur);
    }
}
