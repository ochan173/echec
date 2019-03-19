package echec.Pieces;

public class TestCavalier extends TestPiece {
    @Override
    protected Piece creerPiece(Piece.Couleur p_couleur) {
        return Cavalier.obtenirPiece(p_couleur);
    }
    public void testRepresentation() {
        Piece cavalier = creerPiece(Piece.Couleur.Blanc);
        assertEquals(Cavalier.REP_CAVALIER , super.m_piece.getRepresentation());
    }
    public void testType() {
        assertEquals(Piece.TypePiece.Cavalier, super.m_piece.getTypePiece());
    }
}
