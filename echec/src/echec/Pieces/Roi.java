package echec.Pieces;

/**
 * Pièce de type roi
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public class Roi extends Piece {

    /**
     * Représentation d'un roi
     */
    protected static final char REP_ROI = 'r';

    private Roi (Couleur p_couleur) {
        super(p_couleur);
        super.setRepresentation(REP_ROI, p_couleur);
    }

    @Override
    public TypePiece getTypePiece() {
        return TypePiece.Roi;
    }

    /**
     * Fonction qui valide si un déplacement du roi est valide
     * @param p_position nouvelle position
     * @return True si le déplacement est valide sinon False
     */
    public boolean deplacementValide(String p_position) {
        if (!super.deplacementValide(p_position)) {
            return false;
        }

        int x = colonne.valueOf(Character.toString(p_position.charAt(0)).toUpperCase()).ordinal();
        int y = Integer.parseInt(String.valueOf(p_position.charAt(1)));

        if (Math.abs(x - m_positionX) < 2 && Math.abs(y - m_positionY) < 2) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Constructeur nommé d'un roi
     * @param p_couleur couleur de la pièce
     * @return un roi
     */
    public static Piece obtenirPiece(Couleur p_couleur) {
        return new Roi(p_couleur);
    }
}
