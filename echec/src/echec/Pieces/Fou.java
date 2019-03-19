package echec.Pieces;

/**
 * Pièce de type fou
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public class Fou extends Piece {

    /**
     * Représentation d'un fou
     */
    public static final char REP_FOU = 'f';

    private Fou(Couleur p_couleur) {
        super(p_couleur);
        super.setRepresentation(REP_FOU, p_couleur);
    }

    @Override
    public TypePiece getTypePiece() {
        return TypePiece.Fou;
    }

    /**
     * Constructeur nommé d'un fou
     * @param p_couleur couleur de la pièce
     * @return un fou
     */
    public static Piece obtenirPiece(Couleur p_couleur) {
        return new Fou(p_couleur);
    }
}
