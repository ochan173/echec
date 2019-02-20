package echec;

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
        Pion pionBlanc = new Pion();
        Pion pionNoir = new Pion("noir");

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

        String echiquier = "XXXXXXXX\nPPPPPPPP\nXXXXXXXX\nXXXXXXXX\nXXXXXXXX\nXXXXXXXX\npppppppp\nXXXXXXXX";
        assertEquals(echiquier, m_echiquier.EchiquierString());

        int cptPions = 0;
        echiquier = m_echiquier.EchiquierString();

        for (int i = 0; i < m_echiquier.EchiquierString().length(); i++) {
            if (echiquier.charAt(i) == 'p' || echiquier.charAt(i) == 'P')
                cptPions++;
        }

        assertEquals(16, cptPions);
    }
}
