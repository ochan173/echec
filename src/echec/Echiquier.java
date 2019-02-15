package echec;

import java.util.LinkedHashMap;

/**
 * Classe de l'échiquier
 *
 * @author Olivier Chan
 * @author David Goulet
 */
public class Echiquier {
    private LinkedHashMap<String, Pion> m_pions = new LinkedHashMap<>();

    /**
     * Construdteur de base
     */
    Echiquier() {
    }

    /**
     * Permet d'ajouter un pion dans l'échiquer
     *
     * @param p_pion     pion ajouté
     * @param p_position position du pion ajouté
     */
    void ajouterPion(Pion p_pion, String p_position) {
        m_pions.put(p_position, p_pion);
    }

    /**
     * Permet d'aller chercher un pion dans l'échiquier
     * selon une position
     *
     * @param p_position position ciblée
     * @return le pion à la position
     */
    Pion getPion(String p_position) {
        if (m_pions.containsKey(p_position))
            return m_pions.get(p_position);
        else
            return null;
    }

    /**
     * Nombre de pieces contenues dans l'échiquier
     *
     * @return Le nombre de pièces
     */
    int getNombrePieces() {
        return m_pions.size();
    }
}
