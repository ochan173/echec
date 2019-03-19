package echec.Pieces;

public class TestReine extends TestPiece {
    @Override
    protected Piece creerPiece(Piece.Couleur p_couleur) {
        return Reine.obtenirPiece(p_couleur);
    }
    public void testRepresentation() {
        assertEquals(Character.toLowerCase(Reine.REP_REINE), super.m_piece.getRepresentation());
    }
    public void testType() {
        assertEquals(Piece.TypePiece.Reine, super.m_piece.getTypePiece());
    }
}
