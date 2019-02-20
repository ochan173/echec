package echec;

import java.util.LinkedHashMap;

/**
 * Classe de l'échiquier
 *
 * @author Olivier Chan
 * @author David Goulet
 */
class Echiquier {
    private LinkedHashMap<String, Pion> m_pions = new LinkedHashMap<>();
    private char[][] m_echiquier = new char[8][8];

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

    /**
     * Initialisation de l'échiquier
     */
    void initialiser() {
       for (int y = 0; y < 8; y++) {
           for (int x = 0; x < 8; x++) {
               if (y == 1)
                   m_echiquier[y][x] = 'P';
               else if (y == 6)
                   m_echiquier[y][x] = 'p';
               else
                   m_echiquier[y][x] = 'X';
           }
       }
    }

    /**
     * Affichage de l'échiquier dans la console
     */
    void afficherEchiquier()
    {
        for (char[] y : m_echiquier) {
            for (char x : y) {
                System.out.print(x);
            }
            System.out.println("\n");
        }
    }

    /**
     * Transforme l'échiquier en string
     * @return L'échiquier en string
     */
    String EchiquierString()
    {
        StringBuilder echiquier = new StringBuilder(72);
        boolean premier = true;

        for (char[] y : m_echiquier) {
            if (!premier)
                echiquier.append('\n');
            for (char x : y) {
                echiquier.append(x);
            }
            premier = false;
        }
        return echiquier.toString();
    }
}
