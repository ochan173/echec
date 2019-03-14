package echec;

import echec.Pieces.TestCompletPiece;
import echec.Pieces.TestPiece;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Classe qui exécute tous les tests
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public class TestComplet extends TestCase {
    /**
     * Suite des test à exécuter
     * @return la suite à exécuter
     */
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(TestEchiquier.class);
        suite.addTestSuite(TestCompletPiece.class);
        return suite;
    }
}
