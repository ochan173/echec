package echec.Pieces;

/**
 * Test tour
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public class TestTour extends TestPiece {
    @Override
    protected Piece creerPiece(Piece.Couleur p_couleur)  {
        return Tour.obtenirPiece(p_couleur);
    }

    /**
     * Test de la représentation d'une tour
     */
    public void testRepresentation() {
        assertEquals(Tour.REP_TOUR, super.m_piece.getRepresentation());
    }

    /**
     * Test le type d'une tour
     */
    public void testType() {
        assertEquals(Piece.TypePiece.Tour, super.m_piece.getTypePiece());
    }

    /**
     * Test le pointage d'une tour
     */
    public void testPointage() {
        assertEquals(Piece.TypePiece.Tour.getPointage(), super.m_piece.getTypePiece().getPointage());
    }
}
