package echec.Pieces;

/**
 * Test la pièce fou
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public class TestFou extends TestPiece {
    @Override
    protected Piece creerPiece(Piece.Couleur p_couleur) {
        return Fou.obtenirPiece(p_couleur);
    }

    /**
     * Test la représentation d'un fou
     */
    public void testRepresentation() {
        assertEquals(Character.toLowerCase(Fou.REP_FOU), super.m_piece.getRepresentation());
    }

    /**
     * Test le type d'un fou
     */
    public void testType() {
        assertEquals(Piece.TypePiece.Fou, super.m_piece.getTypePiece());
    }

    /**
     * Test pointage d'un fou
     */
    public void testPointage() {
        assertEquals(Piece.TypePiece.Fou.getPointage(), super.m_piece.getTypePiece().getPointage());
    }
}
