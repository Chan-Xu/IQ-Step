package comp1110.ass2;

public class Piece {

    // '0' means no ring; '1' means the lower ring; '2' means the upper ring.
    // represent 8 pieces
    private static final int[][][] pieces = {
       {
            {1, 2, 0},
            {2, 1, 2},
            {1, 0, 0}
    }, {
            {0, 2, 0},
            {0, 1, 2},
            {0, 2, 1}
    }, {
            {0, 2, 0},
            {0, 1, 2},
            {1, 2, 0}
    }, {
            {0, 2, 0},
            {2, 1, 0},
            {0, 2, 1}
    }, {
            {0, 2, 0},
            {2, 1, 0},
            {1, 2, 0}
    }, {
            {0, 0, 1},
            {0, 1, 2},
            {1, 2, 0}
    }, {
            {0, 2, 1},
            {0, 1, 2},
            {1, 2, 0}
    }, {
            {0, 2, 1},
            {2, 1, 0},
            {0, 2, 1}
    }
    };


    Piece(String pieceState) {
    }
}



