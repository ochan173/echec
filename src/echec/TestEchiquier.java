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
}
