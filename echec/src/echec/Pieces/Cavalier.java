package echec.Pieces;

/**
 * Pièce de type cavalier
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public class Cavalier extends Piece {
    /**
     * Représentation d'un cavalier
     */
    public static final char REP_CAVALIER = 'c';

    private Cavalier(Couleur p_couleur) {
        super(p_couleur);
        super.setRepresentation(REP_CAVALIER, p_couleur);
    }

    @Override
    public TypePiece getTypePiece() {
        return TypePiece.Cavalier;
    }

    /**
     * Constructeur nommé pour obtenir un cavalier
     * @param p_couleur couleur de la pièce
     * @return un nouveau cavalier
     */
    public static Piece obtenirPiece(Couleur p_couleur) {
        return new Cavalier(p_couleur);
    }
}
