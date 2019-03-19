package echec.Pieces;

public class TestPion extends TestPiece {
    @Override
    protected Piece creerPiece(Piece.Couleur p_couleur) {
        return Pion.obtenirPiece(p_couleur);
    }
    public void testRepresentation() {
        assertEquals(Pion.REP_PION, super.m_piece.getRepresentation());
    }
    public void testType() {
        assertEquals(Piece.TypePiece.Pion, super.m_piece.getTypePiece());
    }
}
