package echec;

/**
 * Pion de base
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public class Pion {
    private String m_couleur;
    private char m_representation;

    /**
     * Constructeur d'un pion
     *
     * @param p_couleur couleur d'un pion
     */
    Pion(String p_couleur) {
        m_couleur = p_couleur;

        if (p_couleur.equals("blanc"))
            m_representation = 'p';
        else
            m_representation = 'P';
    }

    /**
     * Constructeur d'un pion blanc
     */
    Pion() {
        m_couleur = "blanc";
        m_representation = 'p';
    }

    /**
     * Méthode pour la représentation d'un pion
     * @return la représentation
     */
    char obtenirRepresentation() { return m_representation; }

    String getCouleur() { return  m_couleur; }
}
