package echec.Pieces;

public class TestTour extends TestPiece {
    @Override
    protected Piece creerPiece(Piece.Couleur p_couleur)  {
        return Tour.obtenirPiece(p_couleur);
    }
    public void testRepresentation() {
        Piece tour = creerPiece(Piece.Couleur.Blanc);
        assertEquals('t', tour.getRepresentation());
    }
}
