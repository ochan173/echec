package echec.Pieces;

public class TestRoi extends TestPiece {
    @Override
    protected Piece creerPiece(Piece.Couleur p_couleur) {
        return Roi.obtenirPiece(p_couleur);
    }
    public void testRepresentation() {
        Piece roi = creerPiece(Piece.Couleur.Blanc);
        assertEquals('r', roi.getRepresentation());
    }
}
