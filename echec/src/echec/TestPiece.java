package echec;

import junit.framework.TestCase;

/**
 * Classe de tests pour une pièce
 */
public class TestPiece extends TestCase {
    /**
     * Tests pour la création d'une pièce
     */
    public void testCreer() {
        Piece piece1 = Piece.obtenirPiece(Piece.Couleur.Blanc, Piece.TypePiece.Cavalier);
        Piece piece2 = Piece.obtenirPiece(Piece.Couleur.Noir, Piece.TypePiece.Reine);

        assertEquals(Piece.Couleur.Blanc, piece1.getCouleur());
        assertEquals(Piece.TypePiece.Cavalier, piece1.getType());
        assertEquals('c', piece1.getRepresentation());
        assertTrue(piece1.estBlanc());

        assertEquals(Piece.Couleur.Noir, piece2.getCouleur());
        assertEquals(Piece.TypePiece.Reine, piece2.getType());
        assertEquals('D', piece2.getRepresentation());
        assertFalse(piece2.estBlanc());
    }
}
