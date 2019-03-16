package echec.Pieces;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestCompletPiece extends TestCase {
    public static TestSuite suite() {
        TestSuite testSuite = new TestSuite();
        testSuite.addTestSuite(TestPiece.class);
        testSuite.addTestSuite(TestCavalier.class);
        testSuite.addTestSuite(TestFou.class);
        testSuite.addTestSuite(TestTour.class);
        testSuite.addTestSuite(TestPion.class);
        testSuite.addTestSuite(TestRoi.class);
        testSuite.addTestSuite(TestReine.class);
        return testSuite;
    }
}
