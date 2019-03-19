package echec.Pieces;

/**
 * Classe de tests pour un cavalier
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public class TestCavalier extends TestPiece {
    @Override
    protected Piece creerPiece(Piece.Couleur p_couleur) {
        return Cavalier.obtenirPiece(p_couleur);
    }
    /**
     * Méthode pour tester la repésentation d'un cavalier
     */
    public void testRepresentation() {
        assertEquals(Cavalier.REP_CAVALIER , super.m_piece.getRepresentation());
    }
    /**
     * Méthode pour tester le type d'un cavalier
     */
    public void testType() {
        assertEquals(Piece.TypePiece.Cavalier, super.m_piece.getTypePiece());
    }
    /**
     * Méthode pour tester le pointage d'un cavalier
     */
    public void testPointage() {
        assertEquals(Piece.TypePiece.Cavalier.getPointage(), super.m_piece.getTypePiece().getPointage());
    }
}
