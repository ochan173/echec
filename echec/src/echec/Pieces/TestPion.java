package echec.Pieces;

/**
 * Test pion
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public class TestPion extends TestPiece {
    @Override
    protected Piece creerPiece(Piece.Couleur p_couleur) {
        return Pion.obtenirPiece(p_couleur);
    }

    /**
     * Test la représentation d'un pion
     */
    public void testRepresentation() {
        assertEquals(Pion.REP_PION, super.m_piece.getRepresentation());
    }

    /**
     * Test le type d'un pion
     */
    public void testType() {
        assertEquals(Piece.TypePiece.Pion, super.m_piece.getTypePiece());
    }

    /**
     * Test le pointage d'un pion
     */
    public void testPointage() {
        assertEquals(Piece.TypePiece.Pion.getPointage(), super.m_piece.getTypePiece().getPointage());
    }
}
