package echec.Pieces;

/**
 * Pièce de type pion
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public class Pion extends Piece {

    /**
     * Représentation d'un pion
     */
    protected static final char REP_PION = 'p';

    private Pion(Couleur p_couleur) {
        super(p_couleur);
        super.setRepresentation(REP_PION, p_couleur);
    }

    @Override
    public TypePiece getTypePiece() {
        return TypePiece.Pion;
    }

    /**
     * Constructeur nommé d'un pion
     * @param p_couleur couleur de la pièce
     * @return un pion
     */
    public static Piece obtenirPiece(Couleur p_couleur) {
        return new Pion(p_couleur);
    }
}
