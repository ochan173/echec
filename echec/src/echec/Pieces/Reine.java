package echec.Pieces;

/**
 * Pièce de type reine
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public class Reine extends Piece {

    /**
     * Représentation d'une reine
     */
    protected static final char REP_REINE = 'd';

    private Reine(Couleur p_couleur) {
        super(p_couleur);
        super.setRepresentation(REP_REINE, p_couleur);
    }

    @Override
    public TypePiece getTypePiece() {
        return TypePiece.Reine;
    }

    /**
     * Fonction qui s'assure que le déplacement d'une reine est valide
     * @param p_position nouvelle position
     * @return True si le déplacement est valide sinon False
     */
    public boolean deplacementValide(String p_position) {
        if (!super.deplacementValide(p_position)) {
            return false;
        }

        int x = colonne.valueOf(Character.toString(p_position.charAt(0)).toUpperCase()).ordinal();
        int y = Integer.parseInt(String.valueOf(p_position.charAt(1)));

        //En diagonale
        if (Math.abs(x - m_positionX) == Math.abs(y - m_positionY)) {
            return true;
        }
        //Même colonne
        else if (x == m_positionX) {
            return true;
        }
        //Même rangée
        else if (y == m_positionY) {
            return true;
        }

        return false;
    }

    /**
     * Constructeur nommé d'une reine
     * @param p_couleur couleur de la pièce
     * @return une reine
     */
    public static Piece obtenirPiece(Couleur p_couleur) {
            return new Reine(p_couleur);
    }
}
