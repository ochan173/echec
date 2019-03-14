package echec.Pieces;

public class TestPion extends TestPiece {
    @Override
    protected Piece creerPiece(Piece.Couleur p_couleur) {
        return Pion.obtenirPiece(p_couleur);
    }
    public void testRepresentation() {
        Piece pion = creerPiece(Piece.Couleur.Blanc);
        assertEquals('p', pion.getRepresentation());
    }
}
