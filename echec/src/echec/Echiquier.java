package echec;

import echec.Pieces.*;

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
     * Méthode pour placer une pièce sur l'échiquier
     *
     * @param p_piece pièce à placer
     * @param p_position position de la pièce
     */
    void placerPiece(Piece p_piece, String p_position) {
        m_echiquier[colonne.valueOf(p_position.charAt(0) + "").ordinal()][Integer.parseInt(p_position.charAt(1)+"")]
                = p_piece.getRepresentation();

        m_pieces.put(p_position, p_piece);
        m_pieces.get(p_position).setPosition(p_position);
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
            if (piece.getTypePiece() == p_type && piece.getCouleur() == p_couleur) {
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
                total += piece.getTypePiece().getPointage();
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

    /**
     * Permet d'aller chercher une pièce dans l'échiquier
     * selon une position
     *
     * @param p_position position ciblée
     * @return la pièce à la position
     */
    Piece getPiece(String p_position) {
        return m_pieces.get(p_position);
    }

    /**
     * Méthode qui valide le déplacement d'une pièce sur l'échiquier
     *
     * @param p_positionDepart position de départ de la pièce
     * @param p_nouvellePosition nouvelle position de la pièce
     * @param p_piece pièce à déplacer
     * @return True si le déplacement est valide sinon False
     */
    boolean deplacerPiece(String p_positionDepart, String p_nouvellePosition, Piece p_piece) {
        if (!positionValide(p_nouvellePosition, p_piece)) {
            return false;
        }

        if (!m_pieces.containsKey(p_positionDepart) || m_pieces.get(p_positionDepart).getRepresentation() != p_piece.getRepresentation()) {
            return false;
        }

        m_pieces.get(p_positionDepart).setPosition(p_nouvellePosition);
        m_pieces.put(p_nouvellePosition, m_pieces.get(p_positionDepart));
        m_pieces.remove(p_positionDepart);

        return true;
    }

    private boolean positionValide(String p_position, Piece p_piece) {
        if (p_position.length() != 2) {
            return false;
        }

        boolean colonneValide = false;

        for (colonne c : colonne.values()) {
            if (c.name().charAt(0) == p_position.charAt(0)) {
                colonneValide = true;
                break;
            }
        }

        if (!colonneValide) {
            return false;
        }

        int rangee = Integer.parseInt(String.valueOf(p_position.charAt(1)));

        if (rangee < 1 || rangee > 8) {
            return false;
        }

        if (!p_piece.deplacementValide(p_position)) {
            return false;
        }

        return true;
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

        Piece[] piecesBlanc = genererPieces(Piece.Couleur.Blanc);
        Piece[] piecesNoir = genererPieces(Piece.Couleur.Noir);
        Piece[] pionsBlanc = genererPions(Piece.Couleur.Blanc);
        Piece[] pionsNoir = genererPions(Piece.Couleur.Noir);

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
     * Génère une colelction de pions pour remplir l'échiquier
     * @param p_couleur couleur que les pions auront
     * @return une collection de pions
     */
    private Piece[] genererPions(Piece.Couleur p_couleur) {
        Piece[] pionsList = new Pion[8];
        for(int i = 0; i < pionsList.length; i++) {
            pionsList[i] = Pion.obtenirPiece(p_couleur);
        }
        return pionsList;
    }

    /**
     * Génère une collection des différents type de pièces utilisées dans l'échiquier
     * @param p_couleur couleur des pièces
     * @return la collection des pièces d'un échiquier
     */
    private Piece[] genererPieces(Piece.Couleur p_couleur) {
        Piece[] listPieces = {
                Tour.obtenirPiece(p_couleur),
                Cavalier.obtenirPiece(p_couleur),
                Fou.obtenirPiece(p_couleur),
                Reine.obtenirPiece(p_couleur),
                Roi.obtenirPiece(p_couleur),
                Fou.obtenirPiece(p_couleur),
                Cavalier.obtenirPiece(p_couleur),
                Tour.obtenirPiece(p_couleur)
        };
        return listPieces;
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
