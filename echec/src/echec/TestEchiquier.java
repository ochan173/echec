package echec;

import echec.Pieces.*;
import junit.framework.TestCase;

/**
 * Classe de test pour l'échiquier
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public class TestEchiquier extends TestCase {
    private Echiquier m_echiquier;

    /**
     * Initialisation des variables avant chaque test
     */
    public void setUp() {
        m_echiquier = new Echiquier();
    }

    /**
     * Test la création d'un échiquier
     */
    public void testCreer() {
        Piece pionBlanc = Pion.obtenirPiece(Piece.Couleur.Blanc);
        Piece pionNoir = Pion.obtenirPiece(Piece.Couleur.Noir);

        m_echiquier.ajouterPion(pionBlanc, "a1");
        assertEquals(pionBlanc, m_echiquier.getPion("a1"));
        assertEquals(1, m_echiquier.getNombrePieces());

        m_echiquier.ajouterPion(pionNoir, "c3");
        assertEquals(pionNoir, m_echiquier.getPion("c3"));
        assertEquals(pionBlanc, m_echiquier.getPion("a1"));
        assertEquals(2, m_echiquier.getNombrePieces());
    }

    /**
     * Test pour l'affichage de l'échiquier
     */
    public void testAfficher() {
        m_echiquier.initialiser();
        m_echiquier.afficherEchiquier();

        String echiquier = "TCFDRFCT\nPPPPPPPP\nXXXXXXXX\nXXXXXXXX\nXXXXXXXX\nXXXXXXXX\npppppppp\ntcfdrfct";
        assertEquals(echiquier, m_echiquier.EchiquierString());

        int cptPions = 0;
        echiquier = m_echiquier.EchiquierString();

        for (int i = 0; i < m_echiquier.EchiquierString().length(); i++) {
            if (echiquier.charAt(i) == 'p' || echiquier.charAt(i) == 'P') {
                cptPions++;
            }
        }
        assertEquals(16, cptPions);

        int cptPieces = 0;
        for (int i = 0; i < m_echiquier.EchiquierString().length(); i++) {
            if (echiquier.charAt(i) != 'X' &&  echiquier.charAt(i) != '\n') {
                cptPieces++;
            }
        }
        assertEquals(32, cptPieces);

        m_echiquier.placerPiece(Cavalier.obtenirPiece(Piece.Couleur.Noir),"D4");
        assertEquals('C', m_echiquier.elementAtPosition("D4"));
    }

    /**
     * Test pour obtenir une pièce selon sa position
     */
    public void testPieceSelonPosition() {
        Piece fou = Fou.obtenirPiece(Piece.Couleur.Noir);
        m_echiquier.placerPiece(fou, "E1");

        assertEquals(fou, m_echiquier.getPiece("E1"));

        Piece reine = Reine.obtenirPiece(Piece.Couleur.Blanc);
        m_echiquier.placerPiece(reine, "A5");

        assertEquals(reine, m_echiquier.getPiece("A5"));
    }

    /**
     * Test du total de pièces selon son type et sa couleur
     */
    public void testNbPieces() {
        assertEquals(0,  m_echiquier.nbPiecesSelonTypeCouleur(Piece.TypePiece.Tour, Piece.Couleur.Noir));

        m_echiquier.placerPiece(Tour.obtenirPiece(Piece.Couleur.Noir), "D4");
        m_echiquier.placerPiece(Tour.obtenirPiece(Piece.Couleur.Noir), "D5");

        int nbToursNoirs = m_echiquier.nbPiecesSelonTypeCouleur(Piece.TypePiece.Tour, Piece.Couleur.Noir);
        assertEquals(2, nbToursNoirs);
    }

    /**
     * Test du total des valeurs des pièces
     */
    public void testTotalValeur() {
        assertEquals(0.0, m_echiquier.getTotalPoints(Piece.Couleur.Blanc));

        m_echiquier.placerPiece(Tour.obtenirPiece(Piece.Couleur.Noir), "D4");
        m_echiquier.placerPiece(Reine.obtenirPiece(Piece.Couleur.Noir), "E4");
        m_echiquier.placerPiece(Fou.obtenirPiece(Piece.Couleur.Noir), "F4");

        assertEquals(0.0, m_echiquier.getTotalPoints(Piece.Couleur.Blanc));
        assertEquals(17.0, m_echiquier.getTotalPoints(Piece.Couleur.Noir));

        m_echiquier.placerPiece(Cavalier.obtenirPiece(Piece.Couleur.Blanc), "A4");
        m_echiquier.placerPiece(Reine.obtenirPiece(Piece.Couleur.Blanc), "E1");
        m_echiquier.placerPiece(Pion.obtenirPiece(Piece.Couleur.Blanc), "C4");

        assertEquals(12.5, m_echiquier.getTotalPoints(Piece.Couleur.Blanc));
        assertEquals(17.0, m_echiquier.getTotalPoints(Piece.Couleur.Noir));
    }

    /**
     * Test pour déplacer des pièces sur l'échiquier
     */
    public void testDeplacer() {
        Piece roi = Roi.obtenirPiece(Piece.Couleur.Noir);
        m_echiquier.placerPiece(roi, "C3");
        m_echiquier.deplacerPiece("C3", "C4", roi);
        assertEquals(roi, m_echiquier.getPiece("C4"));
        m_echiquier.deplacerPiece("C4", "B3", roi);
        assertEquals(roi, m_echiquier.getPiece("B3"));
        assertFalse(m_echiquier.deplacerPiece("B3", "E3", roi));

        Piece reine = Reine.obtenirPiece(Piece.Couleur.Blanc);
        m_echiquier.placerPiece(reine, "F2");
        m_echiquier.deplacerPiece("F2", "F5", reine);
        assertEquals(reine, m_echiquier.getPiece("F5"));
        m_echiquier.deplacerPiece("F5", "D7", reine);
        assertEquals(reine, m_echiquier.getPiece("D7"));
        assertFalse(m_echiquier.deplacerPiece("D7", "F6", reine));
    }
}
