package echec;

/**
 * Classe de base d'une pièce
 *
 * @author Olivier Chan
 * @author David Goulet
 */
class Piece {
    /**
     * Énumération des couleurs que peut prendre une pièce
     */
    public enum Couleur { Blanc, Noir }

    /**
     * Énumération des types de pièces
     */
    public enum TypePiece { Pion, Tour, Fou, Cavalier, Reine, Roi }

    private Couleur m_couleur;
    private char m_representation;
    private TypePiece m_type;

    /**
     * Méthode pour obtenir une pièce
     *
     * @param p_couleur couleur de la pièce
     * @param p_type type de la pièce
     * @return une pièce
     */
    static Piece obtenirPiece(Couleur p_couleur, TypePiece p_type) {
        return new Piece(p_couleur, p_type);
    }

    private Piece(Couleur p_couleur, TypePiece p_type) {
        m_couleur = p_couleur;
        m_type = p_type;

        switch (p_type) {
            case Pion: m_representation = 'p';
                break;
            case Tour: m_representation = 't';
                break;
            case Fou: m_representation = 'f';
                break;
            case Cavalier: m_representation = 'c';
                break;
            case Reine: m_representation = 'd';
                break;
            case Roi: m_representation = 'r';
                break;
        }
        if(p_couleur == Couleur.Noir) {
            m_representation = Character.toUpperCase(m_representation);
        }
    }

    /**
     * Méthode qui génère des pièces
     *
     * @param p_couleur couleur des pièces
     * @return un array de pièces
     */
    static Piece[] genererPieces(Couleur p_couleur) {
        Piece[] retour;
        if(p_couleur == Couleur.Blanc) {
            retour = new Piece[]{new Piece(p_couleur, TypePiece.Tour),
                    new Piece(p_couleur, TypePiece.Cavalier),
                    new Piece(p_couleur, TypePiece.Fou),
                    new Piece(p_couleur, TypePiece.Reine),
                    new Piece(p_couleur, TypePiece.Roi),
                    new Piece(p_couleur, TypePiece.Fou),
                    new Piece(p_couleur, TypePiece.Cavalier),
                    new Piece(p_couleur, TypePiece.Tour)};
        }
        else {
            retour = new Piece[]{new Piece(p_couleur, TypePiece.Tour),
                    new Piece(p_couleur, TypePiece.Cavalier),
                    new Piece(p_couleur, TypePiece.Fou),
                    new Piece(p_couleur, TypePiece.Reine),
                    new Piece(p_couleur, TypePiece.Roi),
                    new Piece(p_couleur, TypePiece.Fou),
                    new Piece(p_couleur, TypePiece.Cavalier),
                    new Piece(p_couleur, TypePiece.Tour)};
        }
        return retour;
    }

    /**
     * Méthode pour générer des pions
     *
     * @param p_couleur couleur des pions
     * @return un array de pions
     */
    static Piece[] genererPions(Couleur p_couleur) {
        Piece[] retour = new Piece[8];
        for (int i = 0; i < 8; i++) {
            retour[i] = new Piece(p_couleur, TypePiece.Pion);
        }
        return retour;
    }

     char getRepresentation() {
        return m_representation;
    }

     Couleur getCouleur() {
        return m_couleur;
    }

    TypePiece getType() {
        return  m_type;
    }

    /**
     * Méthode pour savoir si une pièce est de couleur blanche
     *
     * @return Vrai si la pièce est de couleur blanche
     */
     boolean estBlanc() {
        return m_couleur == Couleur.Blanc;
    }

    /**
     * Méthode pour savoir si une pièce est de couleur noir
     *
     * @return Vrai si la pièce est de couleur noir
     */
     boolean estNoir() {
        return m_couleur == Couleur.Noir;
    }
}
