package echec.Pieces;

public class TestFou extends TestPiece {
    @Override
    protected Piece creerPiece(Piece.Couleur p_couleur) {
        return Fou.obtenirPiece(p_couleur);
    }
    public void testRepresentation() {
        assertEquals(Character.toLowerCase(Fou.REP_FOU), super.m_piece.getRepresentation());
    }
    public void testType() {
        assertEquals(Piece.TypePiece.Fou, super.m_piece.getTypePiece());
    }
    public void testPointage() {
        assertEquals(Piece.TypePiece.Fou.getPointage(), super.m_piece.getTypePiece().getPointage());
    }
}
