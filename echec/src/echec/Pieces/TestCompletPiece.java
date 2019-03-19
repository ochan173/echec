package echec.Pieces;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Classe qui execute tous les tests pour les pièces
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public class TestCompletPiece extends TestCase {
    /**
     * Suite des test à exécuter
     * @return la suite à exécuter
     */
    public static TestSuite suite() {
        TestSuite testSuite = new TestSuite();
        testSuite.addTestSuite(TestCavalier.class);
        testSuite.addTestSuite(TestFou.class);
        testSuite.addTestSuite(TestTour.class);
        testSuite.addTestSuite(TestPion.class);
        testSuite.addTestSuite(TestRoi.class);
        testSuite.addTestSuite(TestReine.class);
        return testSuite;
    }
}
