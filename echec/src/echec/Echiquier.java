package echec;

import echec.Pieces.Piece;

import java.util.LinkedHashMap;

/**
 * Classe de l'échiquier
 *
 * @author Olivier Chan
 * @author David Goulet
 */
class Echiquier {
    private LinkedHashMap<String, Piece> m_pieces = new LinkedHashMap<>();
    private char[][] m_echiquier = new char[8][8];

    private enum colonne {A, B, C, D, E, F, G, H}

    /**
     * Construdteur de base
     */
    Echiquier() {
    }

    /**
     * Méthode pour obtenir le char d'une pièce selon sa position
     *
     * @param p_position postion de la pièce
     * @return char correspondant à la pièce
     */
    char elementAtPosition(String p_position) {
        return m_echiquier[colonne.valueOf(p_position.charAt(0) + "").ordinal()][Integer.parseInt(p_position.charAt(1)+"")];
    }

    /**
     * Méthode pour créer une pièce et la placer sur l'échiquer
     *
     * @param p_couleur couleur de la pièce
     * @param p_type type de la pièce
     * @param p_position position de la pièce
     */
    void placerPiece(Piece.Couleur p_couleur, Piece.TypePiece p_type, String p_position) {
        Piece piece = Piece.obtenirPiece(p_couleur ,p_type);

        m_echiquier[colonne.valueOf(p_position.charAt(0) + "").ordinal()][Integer.parseInt(p_position.charAt(1)+"")]
                = piece.getRepresentation();

        m_pieces.put(p_position, piece);
    }

    /**
     * Méthode pour placer une pièce sur l'échiquier
     *
     * @param p_piece pièce à placer
     * @param p_position position de la pièce
     */
    void placerPiece(Piece p_piece, String p_position) {
        m_echiquier[colonne.valueOf(p_position.charAt(0) + "").ordinal()][Integer.parseInt(p_position.charAt(1)+"")]
                = p_piece.getRepresentation();

        m_pieces.put(p_position, p_piece);
    }

    /**
     * Méthode pour obtenir le nombre de pièces selon leur couleur et leur type
     *
     * @param p_type type des pièces
     * @param p_couleur couleur des pièces
     * @return le nombre de pièces
     */
    int nbPiecesSelonTypeCouleur(Piece.TypePiece p_type, Piece.Couleur p_couleur) {
        int cpt = 0;

        for (Piece piece : m_pieces.values()) {
            if (piece.getType() == p_type && piece.getCouleur() == p_couleur) {
                cpt++;
            }
        }

        return cpt;
    }

    /**
     *Méthode pour obtenir le total de points d'une couleur
     *
     * @param p_couleur couleur des pièces
     * @return total des points
     */
    double getTotalPoints(Piece.Couleur p_couleur) {
        double total = 0;

        for (Piece piece : m_pieces.values()) {
            if (piece.getCouleur() == p_couleur) {
                total += PointagePieces.getNbPointsPourPièce(piece);
            }
        }

        return total;
    }

    /**
     * Permet d'ajouter un pion dans l'échiquer
     *
     * @param p_pion     pion ajouté
     * @param p_position position du pion ajouté
     */
    void ajouterPion(Piece p_pion, String p_position) {
        m_pieces.put(p_position, p_pion);
    }

    /**
     * Permet d'aller chercher un pion dans l'échiquier
     * selon une position
     *
     * @param p_position position ciblée
     * @return le pion à la position
     */
    Piece getPion(String p_position) {
        if (m_pieces.containsKey(p_position))
            return m_pieces.get(p_position);
        else
            return null;
    }

    Piece getPiece(String p_position) {
        return m_pieces.get(p_position);
    }

    /**
     * Nombre de pieces contenues dans l'échiquier
     *
     * @return Le nombre de pièces
     */
    int getNombrePieces() {
        return m_pieces.size();
    }

    /**
     * Initialisation de l'échiquier
     */
    void initialiser() {

        Piece[] piecesBlanc = Piece.genererPieces(Piece.Couleur.Blanc);
        Piece[] piecesNoir = Piece.genererPieces(Piece.Couleur.Noir);
        Piece[] pionsBlanc = Piece.genererPions(Piece.Couleur.Blanc);
        Piece[] pionsNoir = Piece.genererPions(Piece.Couleur.Noir);

        for (int i = 0; i < 8; i++) {
            if(i == 7) {
                for (int j = 0; j < 8; j++) {
                    m_echiquier[i][j] = piecesBlanc[j].getRepresentation();
                }
            }
            else if(i == 6) {
                for (int j = 0; j < 8; j++) {
                    m_echiquier[i][j] = pionsBlanc[j].getRepresentation();
                }
            }
            else if(i == 0) {
                for (int j = 0; j < 8; j++) {
                    m_echiquier[i][j] = piecesNoir[j].getRepresentation();
                }
            }
            else if(i == 1) {
                for (int j = 0; j < 8; j++) {
                    m_echiquier[i][j] = pionsNoir[j].getRepresentation();
                }
            }
            else {
                for (int j = 0; j < 8; j++) {
                    m_echiquier[i][j] = 'X';
                }
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
