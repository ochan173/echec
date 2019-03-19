package echec.Pieces;

public class TestTour extends TestPiece {
    @Override
    protected Piece creerPiece(Piece.Couleur p_couleur)  {
        return Tour.obtenirPiece(p_couleur);
    }
    public void testRepresentation() {
        assertEquals(Tour.REP_TOUR, super.m_piece.getRepresentation());
    }
    public void testType() {
        assertEquals(Piece.TypePiece.Tour, super.m_piece.getTypePiece());
    }
}
