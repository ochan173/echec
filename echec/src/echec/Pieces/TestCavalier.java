package echec.Pieces;

public class TestCavalier extends TestPiece {
    @Override
    protected Piece creerPiece(Piece.Couleur p_couleur) {
        return Cavalier.obtenirPiece(p_couleur);
    }
    public void testRepresentation() {
        Piece cavalier = creerPiece(Piece.Couleur.Blanc);
        assertEquals('c', cavalier.getRepresentation());
    }
}
