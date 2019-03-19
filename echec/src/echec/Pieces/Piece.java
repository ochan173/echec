package echec.Pieces;

/**
 * Classe de base d'une pièce
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public abstract class Piece {
    final int TAILLE_ECHIQUIER = 8;

    /**
     * Énumération des couleurs que peut prendre une pièce
     */
    public enum Couleur { Blanc, Noir }

    protected enum colonne {A, B, C, D, E, F, G, H}

    /**
     * Énum qui donne le type de pièces ainsi que son pointage
     */
    public enum TypePiece {
        Cavalier(2.5),
        Fou(3),
        Pion(1),
        Reine(9),
        Roi(2),
        Tour(5);

        private double m_pointage;

        TypePiece(double p_pointage) {
            m_pointage = p_pointage;
        }

        public double getPointage() {
            return m_pointage;
        }
    }

    private Couleur m_couleur;
    private char m_representation;
    protected String m_position;
    protected int m_positionX;
    protected int m_positionY;

    protected Piece(Couleur p_couleur) {
        m_couleur = p_couleur;
    }

    /**
     * Permet d'obtenir le type d'une pièce
     * @return le type de pièce
     */
    public abstract TypePiece getTypePiece();

    public boolean deplacementValide(String p_position) {
        getColonneEtRangeeActuelle();
        int nouveauX = colonne.valueOf(Character.toString(p_position.charAt(0)).toUpperCase()).ordinal();
        int nouveauY = Integer.parseInt(String.valueOf(p_position.charAt(1)));

        if (m_positionX == nouveauX && m_positionY == nouveauY) {
            return false;
        }
        else if (nouveauX > TAILLE_ECHIQUIER || nouveauY > TAILLE_ECHIQUIER) {
            return false;
        }
        return true;
    }

    private void getColonneEtRangeeActuelle() {
        m_positionX = colonne.valueOf(Character.toString(m_position.charAt(0)).toUpperCase()).ordinal();
        m_positionY = Integer.parseInt(String.valueOf(m_position.charAt(1)));
    }

    public String getPosition() {
        return m_position;
    }

    public void setPosition(String p_position) {
        m_position = p_position;
    }

    public char getRepresentation() {
        return m_representation;
    }

    protected void setRepresentation(char p_representation, Couleur p_couleur) {
        if (p_couleur == Couleur.Noir) {
          m_representation = Character.toUpperCase(p_representation);
        }
        else {
            m_representation = Character.toLowerCase(p_representation);
        }
    }

     public Couleur getCouleur() {
        return m_couleur;
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
