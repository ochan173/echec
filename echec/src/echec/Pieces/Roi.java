package echec.Pieces;

public class Roi extends Piece {

    public static final char REP_ROI = 'r';

    private Roi (Couleur p_couleur) {
        super(p_couleur);
        super.setRepresentation(REP_ROI, p_couleur);
    }

    @Override
    public TypePiece getTypePiece() {
        return TypePiece.Roi;
    }

    public boolean deplacementValide(String p_position) {
        if (!super.deplacementValide(p_position)) {
            return false;
        }

        int x = colonne.valueOf(Character.toString(p_position.charAt(0)).toUpperCase()).ordinal();
        int y = Integer.parseInt(String.valueOf(p_position.charAt(1)));

        int a = Math.abs(x - m_positionX);
        int b = Math.abs(y - m_positionY);
        if (a < 2 && b < 2) {
            return true;
        }
        else {
            return false;
        }
    }

    public static Piece obtenirPiece(Couleur p_couleur) {
        return new Roi(p_couleur);
    }
}
