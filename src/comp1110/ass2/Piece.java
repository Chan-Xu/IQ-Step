package comp1110.ass2;

/**
 *  Created by Chan Xu (u6233112)
 */
public class Piece {

    public static final int Null = 0, Low = 1, High = 2;

    /**
     * Represent 8 original pieces.
     * '0' means no ring;
     * '1' means the lower ring;
     * '2' means the upper ring.
    */
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

    int[][] shape = new int[3][3];


    /* To get the piece information after flip/rotate. */
    Piece(String pieceState) {
        int pieceIndex = pieceState.charAt(0) - 'A';
        char pieceOrientation = pieceState.charAt(1);

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                shape[i][j] = pieces[pieceIndex][i][j];
            }
        }
        this.rotateAndFlip(pieceOrientation);
    }


    private void rotateAndFlip(char orientation) {
        this.flip(orientation).rotate(orientation);
    }


    /* Flip the piece.*/
    private Piece flip(char orientation) {
        if (orientation > 'D')
        {
            for (int[] row: shape)
            {
                int tmp = row[0];
                row[0] = row[2];
                row[2] = tmp;
                for (int i = 0; i < 3; i++)
                {
                    if (row[i] == 1)
                    {
                        row[i] = 2;
                    }else if (row[i] == 2)
                    {
                        row[i] = 1;
                    }
                }
            }
        }
        return this;
    }


    /* Rotate the piece.*/
    private void rotate(char orientation) {
        int rotateTimes = (orientation - 'A') % 4;
        for (int n = 0; n < rotateTimes; n++)
        {
            int[][] tmp = new int[3][3];
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    tmp[2-i][j] = shape[i][j];
                }
            }
            for (int i = 0; i < 3; i++)
            {
                for (int j = i; j < 3; j++)
                {
                    int swap = tmp[i][j];
                    tmp[i][j] = tmp[j][i];
                    tmp[j][i] = swap;
                }
            }
            shape = tmp;
        }
    }
}
