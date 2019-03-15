package echec.Pieces;

public class Fou extends Piece {

    private final char REP_FOU = 'f';

    private Fou(Couleur p_couleur) {
        super(p_couleur);
        super.setRepresentation(REP_FOU, p_couleur);
    }

    @Override
    public TypePiece getTypePiece() {
        return TypePiece.Fou;
    }

    public static Piece obtenirPiece(Couleur p_couleur) {
        return new Fou(p_couleur);
    }
}
