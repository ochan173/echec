package echec.Pieces;

/**
 * Classe de base d'une pièce
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public abstract class Piece {
    /**
     * Énumération des couleurs que peut prendre une pièce
     */
    public enum Couleur { Blanc, Noir }

    private Couleur m_couleur;
    private char m_representation;
    private String m_position;

    protected Piece(Couleur p_couleur) {
        m_couleur = p_couleur;
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

     Couleur getCouleur() {
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
