package comp1110.ass2;

import java.util.*;

/**
 * This class provides the text interface for the Steps Game
 *
 * The game is based directly on Smart Games' IQ-Steps game
 * (http://www.smartgames.eu/en/smartgames/iq-steps)
 */
public class StepsGame {

    /**
     * Determine whether a piece placement is well-formed according to the following:
     * - it consists of exactly three characters
     * - the first character is in the range A .. H (shapes)
     * - the second character is in the range A .. H (orientations)
     * - the third character is in the range A .. Y and a .. y (locations)
     *
     * @param piecePlacement A string describing a piece placement
     * @return True if the piece placement is well-formed
     */
    static boolean isPiecePlacementWellFormed(String piecePlacement) {
        // FIXME Task 2: determine whether a piece placement is well-forme
        //Check if it consists of exactly three characters
        if (piecePlacement.length() == 3) {

            char[] placementChar = piecePlacement.toCharArray();
            if(placementChar[0] >= 'A' && placementChar[0] <= 'H'){                    //Check the first char
                if(placementChar[1] >= 'A' && placementChar[1] <= 'H'){                //Check the second char
                    return ((placementChar[2] >= 'A' && placementChar[2] <= 'Y') ||    //Check the third char
                            (placementChar[2] >= 'a' && placementChar[2] <= 'y'));
                }
            }
        } return false;
    }


    /**
     * Determine whether a placement string is well-formed:
     *  - it consists of exactly N three-character piece placements (where N = 1 .. 8);
     *  - each piece placement is well-formed
     *  - no shape appears more than once in the placement
     *
     * @param placement A string describing a placement of one or more pieces
     * @return True if the placement is well-formed
     */
    static boolean isPlacementWellFormed(String placement) {
        // FIXME Task 3: determine whether a placement is well-formed
        if (placement == null || placement.equals("")) {
            return false;
        } else if (placement.length() % 3 != 0) {
            return false;
        } else {
            String[] a = new String[placement.length() / 3];

            for (int i = 0; i < placement.length() / 3; i++) {
                a[i] = placement.substring(3 * i, 3 * i + 3);
                if (isPiecePlacementWellFormed(a[i])&& NoDuplicate(placement)) {
                    return true;

                }

                }

            }

        return false;
    }

// write a new method to check whether they are duplicate
    static boolean NoDuplicate (String placement) {
        boolean Duplicate = true;
        char [] b = placement.toCharArray();
        for (int i = 0; i < b.length ; i += 3)
            for (int k = 0; k < b.length ; k += 3)
                if (i!=k && b[i]==b[k])
                    Duplicate = false;
            return Duplicate;
    }


    /**
     * Determine whether a placement sequence is valid.  To be valid, the placement
     * sequence must be well-formed and each piece placement must be a valid placement
     * (with the pieces ordered according to the order in which they are played).
     *
     * @param placement A placement sequence string
     * @return True if the placement sequence is valid
     */
    static boolean isPlacementSequenceValid(String placement) {
        // FIXME Task 5: determine whether a placement sequence is valid
        if (!isPlacementWellFormed(placement)) {
            return false;
        } else {
            // break a string into many pieces
            String[] place = new String[placement.length() / 3];

            for (int i = 0; i < placement.length() / 3; i++) {
                place[i] = placement.substring(3 * i, 3 * i + 3);
            }

            /* check the pieces are not in the outside of the board. */
            // check the home rings are not at the corner
            for (int j = 0; j < place.length; j += 3){
                if (place[j].charAt(2) == 'A' || place[j].charAt(2) == 'J' || place[j].charAt(2) == 'p' || place[j].charAt(2) == 'y' ){
                    return false;
                }
            }

            // check the home rings are not at the edges
            for (int m = 0; m < place.length; m++){
                if ((!isValidPieceString(place[m]))){
                    return false;
                }
            }

            /* check the rings without overlap */
            ArrayList<Integer> result = new ArrayList<>();
            for (int v = 0; v < place.length; v++){
                ArrayList<Integer> list = listArray(place[v]);
                for (int w = 0; w <list.size(); w++){
                    result.add(list.get(w));
                }
            }

            Set<Integer> res = new HashSet<>();
            for (int u = 0; u < result.size(); u++){
                res.add(result.get(u));
            }

            // check the integers are not  repeated
            if (result.size() != res.size()){
                return false;
            }
        }
        return true;
    }

/*
    // convert char to int
    static int charToInt(char n) {
        if (n >= 'A' && n <= 'Y'){
            return (int)n - 64;
        }else
            return (int)n - 71;
    }
*/

    /* add a method to determine whether the pieces are valid when home rings on the edges
     * @param String A piece sequence string
     * @return True if the piece sequence is valid
     */
    static boolean isValidPieceString(String c) {
        // upper edge
        if (c.charAt(2) >= 'B' && c.charAt(2) <= 'I'){
            if (c.charAt(0) == 'B' && c.charAt(1) == 'B' || c.charAt(0) == 'B' && c.charAt(1) == 'H' ||
                    c.charAt(0) == 'E' && c.charAt(1) == 'D' || c.charAt(0) == 'E' && c.charAt(1) == 'F'){
                return  true;
            }else{
                return  false;
            }
        }   // right edge
        else if (c.charAt(2) == 'T' || c.charAt(2) == 'e' || c.charAt(2) == 'o'){
            if (c.charAt(0) == 'B' && c.charAt(1) == 'C' || c.charAt(0) == 'B' && c.charAt(1) == 'E' ||
                    c.charAt(0) == 'E' && c.charAt(1) == 'A' || c.charAt(0) == 'E' && c.charAt(1) == 'G'){
                return  true;
            }else{
                return  false;
            }
        }   // lower edge
        else if (c.charAt(2) >= 'q' && c.charAt(2) <= 'x'){
            if (c.charAt(0) == 'B' && c.charAt(1) == 'D' || c.charAt(0) == 'B' && c.charAt(1) == 'F' ||
                    c.charAt(0) == 'E' && c.charAt(1) == 'B' || c.charAt(0) == 'E' && c.charAt(1) == 'H'){
                return  true;
            }else{
                return  false;
            }
        }   // left edge
        else if (c.charAt(2) == 'K' || c.charAt(2) == 'U' || c.charAt(2) == 'f'){
            if (c.charAt(0) == 'B' && c.charAt(1) == 'A' || c.charAt(0) == 'B' && c.charAt(1) == 'G' ||
                    c.charAt(0) == 'E' && c.charAt(1) == 'C' || c.charAt(0) == 'E' && c.charAt(1) == 'E'){
                return  true;
            }else{
                return  false;
            }
        }return  true;
    }

    static ArrayList<Integer> listArray(String s){
        Map<Character, Integer> list = new HashMap<>();
        char[] position = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y'};

        for (int i = 0; i < position.length; i++){
            list.put(position[i],i);
        }

        int centre = list.get(s.charAt(2));

        int[] pos = {centre-11, centre-10, centre-9,
                      centre-1, centre, centre+1,
                      centre+9, centre+10, centre+11};

        int[][] arrA = {{0, 0, -1},{0, 0, 0}, {0, -1, -1}}; int[][] arrB = {{-1, 0, -1},{-1, 0, 0},{-1, 0, 0}};
        int[][] arrC = {{-1, 0, -1},{-1, 0, 0},{ 0, 0, -1}}; int[][] arrD = {{-1, 0, -1},{0, 0, -1},{-1, 0, 0}};
        int[][] arrE = {{-1, 0, -1},{0, 0, -1},{0, 0, -1}}; int[][] arrF = {{-1, -1, 0},{-1, 0, 0},{0, 0, -1}};
        int[][] arrG = {{-1, 0, 0},{-1, 0, 0},{0, 0, -1}}; int[][] arrH = {{-1, 0, 0}, {0, 0, -1},{-1, 0, 0}};

        boolean a = s.charAt(1) == 'A';
        boolean b = s.charAt(1) == 'B';
        boolean c = s.charAt(1) == 'C';
        boolean d = s.charAt(1) == 'D';
        boolean e = s.charAt(1) == 'E';
        boolean f = s.charAt(1) == 'F';
        boolean g = s.charAt(1) == 'G';
        boolean h = s.charAt(1) == 'H';

        if (s.charAt(0) == 'A'){
            if (a) return selection(arrA, pos);
            else if (b) return selection(rotate(arrA), pos);
            else if (c) return selection(rotate(rotate(arrA)), pos);
            else if (d) return selection(rotate(rotate(rotate(arrA))), pos);
            else if (e) return selection(reverse(arrA), pos);
            else if (f) return selection(rotate(reverse(arrA)), pos);
            else if (g) return selection(rotate(rotate(reverse(arrA))), pos);
            else if (h) return selection(rotate(rotate(rotate(reverse(arrA)))), pos);
        }else if (s.charAt(0) == 'B'){
            if (a) return selection(arrB, pos);
            else if (b) return selection(rotate(arrB), pos);
            else if (c) return selection(rotate(rotate(arrB)), pos);
            else if (d) return selection(rotate(rotate(rotate(arrB))), pos);
            else if (e) return selection(reverse(arrB), pos);
            else if (f) return selection(rotate(reverse(arrB)), pos);
            else if (g) return selection(rotate(rotate(reverse(arrB))), pos);
            else if (h) return selection(rotate(rotate(rotate(reverse(arrB)))), pos);
        }else if (s.charAt(0) == 'C'){
            if (a) return selection(arrC, pos);
            else if (b) return selection(rotate(arrC), pos);
            else if (c) return selection(rotate(rotate(arrC)), pos);
            else if (d) return selection(rotate(rotate(rotate(arrC))), pos);
            else if (e) return selection(reverse(arrC), pos);
            else if (f) return selection(rotate(reverse(arrC)), pos);
            else if (g) return selection(rotate(rotate(reverse(arrC))), pos);
            else if (h) return selection(rotate(rotate(rotate(reverse(arrC)))), pos);
        }else if (s.charAt(0) == 'D'){
            if (a) return selection(arrD, pos);
            else if (b) return selection(rotate(arrD), pos);
            else if (c) return selection(rotate(rotate(arrD)), pos);
            else if (d) return selection(rotate(rotate(rotate(arrD))), pos);
            else if (e) return selection(reverse(arrD),pos);
            else if (f) return selection(rotate(reverse(arrD)),pos);
            else if (g) return selection(rotate(rotate(reverse(arrD))), pos);
            else if (h) return selection(rotate(rotate(rotate(reverse(arrD)))), pos);
        }else if (s.charAt(0) == 'E'){
            if (a) return selection(arrE, pos);
            else if (b) return selection(rotate(arrE), pos);
            else if (c) return selection(rotate(rotate(arrE)), pos);
            else if (d) return selection(rotate(rotate(rotate(arrE))), pos);
            else if (e) return selection(reverse(arrE), pos);
            else if (f) return selection(rotate(reverse(arrE)), pos);
            else if (g) return selection(rotate(rotate(reverse(arrE))), pos);
            else if (h) return selection(rotate(rotate(rotate(reverse(arrE)))), pos);
        }else if (s.charAt(0) == 'F'){
            if (a) return selection(arrF, pos);
            else if (b) return selection(rotate(arrF), pos);
            else if (c) return selection(rotate(rotate(arrF)), pos);
            else if (d) return selection(rotate(rotate(rotate(arrF))), pos);
            else if (e) return selection(reverse(arrF), pos);
            else if (f) return selection(rotate(reverse(arrF)), pos);
            else if (g) return selection(rotate(rotate(reverse(arrF))), pos);
            else if (h) return selection(rotate(rotate(rotate(reverse(arrF)))), pos);
        }else if (s.charAt(0) == 'G'){
            if (a) return selection(arrG, pos);
            else if (b) return selection(rotate(arrG), pos);
            else if (c) return selection(rotate(rotate(arrG)), pos);
            else if (d) return selection(rotate(rotate(rotate(arrG))), pos);
            else if (e) return selection(reverse(arrG), pos);
            else if (f) return selection(rotate(reverse(arrG)), pos);
            else if (g) return selection(rotate(rotate(reverse(arrG))), pos);
            else if (h) return selection(rotate(rotate(rotate(reverse(arrG)))), pos);
        }else if (s.charAt(0) == 'H'){
            if (a) return selection(arrH, pos);
            else if (b) return selection(rotate(arrH), pos);
            else if (c) return selection(rotate(rotate(arrH)), pos);
            else if (d) return selection(rotate(rotate(rotate(arrH))), pos);
            else if (e) return selection(reverse(arrH), pos);
            else if (f) return selection(rotate(reverse(arrH)), pos);
            else if (g) return selection(rotate(rotate(reverse(arrH))), pos);
            else if (h) return selection(rotate(rotate(rotate(reverse(arrH)))), pos);
        }
        return null;
    }

    static ArrayList<Integer> selection (int[][] a, int[] b){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (a[i][j] == 0){
                    arr.add(b[3*i+j]);
                }
            }
        }
        return arr;
    }
    
    static int[][] rotate(int[][] m) {
        int[][] origin = new int[3][3];
        int[][] outcome = new int[3][3];
        origin[0] = m[2];
        origin[2] = m[0];
        origin[1] = m[1];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                outcome[i][j] = origin[j][i];
            }
        }
        return outcome;
    }

    static int[][] reverse(int[][] m){
        int[][]outcome = new int[3][3];
        for (int i = 0; i<3; i++){
            for (int j =0 ; j<3; j++ ){
                outcome[i][j]= m[i][2-j];
            }
        }
        return outcome;
    }


/*
    static ArrayList<Integer> getCoordinate(String n){
        return null;
    }
    */

        /**
         * Given a string describing a placement of pieces and a string describing
         * an (unordered) objective, return a set of all possible next viable
         * piece placements.   A viable piece placement must be a piece that is
         * not already placed (ie not in the placement string), and which will not
         * obstruct any other unplaced piece.
         *
         * @param placement A valid sequence of piece placements where each piece placement is drawn from the objective
         * @param objective A valid game objective, but not necessarily a valid placement string
         * @return An set of viable piece placements
         */
    static Set<String> getViablePiecePlacements(String placement, String objective) {
        // FIXME Task 6: determine the correct order of piece placements
        /* for no more pieces */
        if(placement.length() == objective.length()) {
            return new HashSet<>();
        }

        return null;
    }

    /**
     * Return an array of all solutions to the game, given a starting placement.
     *
     * @param placement  A valid piece placement string.
     * @return An array of strings, each describing a solution to the game given the
     * starting point provided by placement.
     */
    static String[] getSolutions(String placement) {
        // FIXME Task 9: determine all solutions to the game, given a particular starting placement
        return null;
    }
}
