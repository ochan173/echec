package echec.Pieces;

import junit.framework.TestCase;

/**
 * Classe de tests pour une pièce
 */
public abstract class TestPiece extends TestCase {

    abstract protected Piece creerPiece(Piece.Couleur p_couleur);

    /**
     * Tests pour la création d'une pièce
     */
    public void testCreer() {
        Piece piece1 = creerPiece(Piece.Couleur.Blanc);
        assertEquals(Piece.Couleur.Blanc, piece1.getCouleur());
        assertTrue(piece1.estBlanc());
        piece1.setRepresentation('B', piece1.getCouleur());
        assertEquals('b', piece1.getRepresentation());

        piece1.setPosition("a1");
        assertEquals("a1", piece1.getPosition());

        Piece piece2 = creerPiece(Piece.Couleur.Noir);
        assertEquals(Piece.Couleur.Noir, piece2.getCouleur());
        assertFalse(piece2.estBlanc());
        piece2.setRepresentation('n', piece2.getCouleur());
        assertEquals('N', piece2.getRepresentation());
        piece2.setPosition("b1");
        assertEquals("b1", piece2.getPosition());
    }
}
