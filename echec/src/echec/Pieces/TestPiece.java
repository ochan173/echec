package echec.Pieces;

import junit.framework.TestCase;

/**
 * Test de base pour les pièces
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public abstract class TestPiece extends TestCase {

    /**
     * Pièce utilisée pour les tests enfants
     */
    Piece m_piece;

    /**
     * Classe de tests pour une pièce
     */
    abstract protected Piece creerPiece(Piece.Couleur p_couleur);

    protected void setUp() {
        m_piece = creerPiece(Piece.Couleur.Blanc);
    }

    /**
     * Test la création d'une pièce
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

    /**
     * Test déplacement de base
     */
    public void testDeplacementValide() {
        m_piece.setPosition("D7");
        assertFalse(m_piece.deplacementValide("D7"));
        assertFalse(m_piece.deplacementValide("V2"));
        assertTrue(m_piece.deplacementValide("E8"));
    }

    /**
     * Test les couleurs
     */
    public void testCouleur() {
        assertTrue(m_piece.estBlanc());
        assertFalse(m_piece.estNoir());
        m_piece = creerPiece(Piece.Couleur.Noir);
        assertTrue(m_piece.estNoir());
        assertFalse(m_piece.estBlanc());
    }
    }


