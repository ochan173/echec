package echec.Pieces;

/**
 * Piece de type Tour
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public class Tour extends Piece {

    public static final char REP_TOUR = 't';

    private Tour(Couleur p_couleur) {
        super(p_couleur);
        super.setRepresentation(REP_TOUR, p_couleur);
    }

    @Override
    public TypePiece getTypePiece() {
        return TypePiece.Tour;
    }

    /**
     * Obtention d'une piece tour
     * @param p_couleur couleur de la piece
     * @return une tour de couleur
     */
    public static Piece obtenirPiece(Couleur p_couleur) {
        return new Tour(p_couleur);
    }
}
