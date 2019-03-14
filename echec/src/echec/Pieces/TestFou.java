package echec.Pieces;

public class TestFou extends TestPiece {
    @Override
    protected Piece creerPiece(Piece.Couleur p_couleur) {
        return Fou.obtenirPiece(p_couleur);
    }
    public void testRepresentation() {
        Piece fou = creerPiece(Piece.Couleur.Noir);
        assertEquals('F', fou.getRepresentation());
    }
}
