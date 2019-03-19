package echec.Pieces;

/**
 * Test Roi
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public class TestRoi extends TestPiece {

    @Override
    protected Piece creerPiece(Piece.Couleur p_couleur) {
        return Roi.obtenirPiece(p_couleur);
    }

    /**
     * Test la représentation du roi
     */
    public void testRepresentation() {
        assertEquals(Roi.REP_ROI, super.m_piece.getRepresentation());
    }

    /**
     * Test le type du roi
     */
    public void testType() {
        assertEquals(Piece.TypePiece.Roi, super.m_piece.getTypePiece());
    }

    /**
     * Test le pointage du roi
     */
    public void testPointage() {
        assertEquals(Piece.TypePiece.Roi.getPointage(), super.m_piece.getTypePiece().getPointage());
    }
}
