package echec.Pieces;

public class TestReine extends TestPiece {
    @Override
    protected Piece creerPiece(Piece.Couleur p_couleur) {
        return Reine.obtenirPiece(p_couleur);
    }
    public void testRepresentation() {
        Piece reine = creerPiece(Piece.Couleur.Noir);
        assertEquals('D', reine.getRepresentation());
    }
}
