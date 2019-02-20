package echec;

import junit.framework.TestCase;

/**
 * Classe de tests pour un pion
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public class TestPion extends TestCase {
    /**
     * Méthode qui teste la création d'un pion
     */
    public void testCreer() {
        Pion pionNoir = new Pion("noir");
        Pion pionBlanc = new Pion();

        assertEquals("blanc", pionBlanc.getCouleur());
        assertEquals("noir", pionNoir.getCouleur());

        assertEquals('p', pionBlanc.obtenirRepresentation());
        assertEquals('P', pionNoir.obtenirRepresentation());
    }
}
