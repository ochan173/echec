package echec.Pieces;

public class TestRoi extends TestPiece {

    @Override
    protected Piece creerPiece(Piece.Couleur p_couleur) {
        return Roi.obtenirPiece(p_couleur);
    }

    public void testRepresentation() {
        assertEquals(Roi.REP_ROI, super.m_piece.getRepresentation());
    }
    public void testType() {
        assertEquals(Piece.TypePiece.Roi, super.m_piece.getTypePiece());
    }
    public void testPointage() {
        assertEquals(Piece.TypePiece.Roi.getPointage(), super.m_piece.getTypePiece().getPointage());
    }
}
