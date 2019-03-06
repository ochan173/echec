package echec;

/**
 * Classe qui attribue un pointage à une pièce
 *
 * @author Olivier Chan
 * @author David Goulet
 */
class PointagePieces {
    /**
     * Méthode qui attribue un nombre de points à une pièce
     * selon son type
     *
     * @param p_piece pièce dont on veut la valeur en points
     * @return un nombre de points
     */
     static double getNbPointsPourPièce(Piece p_piece) {
        switch (p_piece.getType()) {
            case Pion: return 1;
            case Tour: return 5;
            case Fou: return 3;
            case Cavalier: return 2.5;
            case Reine: return 9;
            default: return  2;
        }
    }

}
