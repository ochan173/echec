package echec;

/**
 * Pion de base
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public class Pion {
    private String m_couleur;

    /**
     * Constructeur d'un pion
     *
     * @param p_couleur couleur d'un pion
     */
    Pion(String p_couleur) {
        m_couleur = p_couleur;
    }

    /**
     * Constructeur d'un pion blanc
     */
    Pion() {
        m_couleur = "blanc";
    }

    String getCouleur() { return  m_couleur; }
}
