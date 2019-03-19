package echec.Pieces;

/**
 * Test de la pièce reine
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public class TestReine extends TestPiece {
    @Override
    protected Piece creerPiece(Piece.Couleur p_couleur) {
        return Reine.obtenirPiece(p_couleur);
    }

    /**
     * Test la représentation d'une reine
     */
    public void testRepresentation() {
        assertEquals(Character.toLowerCase(Reine.REP_REINE), super.m_piece.getRepresentation());
    }

    /**
     * Test le type d'une reine
     */
    public void testType() {
        assertEquals(Piece.TypePiece.Reine, super.m_piece.getTypePiece());
    }

    /**
     * Test le pointage d'une reine
     */
    public void testPointage() {
        assertEquals(Piece.TypePiece.Reine.getPointage(), super.m_piece.getTypePiece().getPointage());
    }

    /**
     * Test des déplacemetns valide pour d'une reine
     */
    public void testDeplacement() {
        super.m_piece = Reine.obtenirPiece(Piece.Couleur.Noir);
        m_piece.setPosition("E5");
        assertTrue(m_piece.deplacementValide("E1"));
        assertTrue(m_piece.deplacementValide("G5"));
        assertFalse(m_piece.deplacementValide("G1"));
    }
}
