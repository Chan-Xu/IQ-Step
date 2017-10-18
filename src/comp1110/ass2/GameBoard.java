package comp1110.ass2;

/**
 *  Created by Chan Xu (u6233112)
 */
public class GameBoard {

    /* create the game board.*/
    private int[][] board = new int[5][10];

    /* to let the all numbers in board is 0.(initialization).*/
    GameBoard() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = 0;
            }
        }
    }

    /* get the piece's home ring position in board using number(0 - 49).*/
    private static int getRingIndex(char pos) {
        int index;
        if (pos < 'a')
        {
            index = pos - 'A';
        }else
        {
            index = 25 + pos - 'a';
        }
        return index;
    }

    /* get the coordinates of home ring in board..*/
    private class Coord {
        int x, y;

        Coord(int pos) {
            x = pos / 10;
            y = pos % 10;
        }

        Coord(int X, int Y) {
            this.x = X;
            this.y = Y;
        }
    }


    /**
     * Determine whether the piece can be placed into board.
     *
     * @param pce  An array list which store the piece information(shape & orientation).
     * @param pos  The position of the piece.
     * @return True if the piece can be put into board.
     */
    public boolean isPiecePlaced(Piece pce, char pos) {

        Coord coord = new Coord(getRingIndex(pos));
        int[][] currentShape = pce.shape;

        return placeLowRing(currentShape, coord) && placeHighRing(currentShape, coord);
    }


    /**
     * Helper for isPiecePlaced.
     * Determine whether the low layer of piece can be put into board.
     *
     * @param currentShape  The currentShape of piece after flip/rotate.
     * @param coord  The coordinate of board.
     * @return True if the low layer of piece can be put into board.
     */
    private boolean placeLowRing(int[][] currentShape, Coord coord) {
        return placeRing(currentShape, Piece.Low, coord);
    }


    /**
     * Helper for isPlacePiece.
     * Determine whether the high layer of piece can be put into board.
     *
     * @param currentShape  The currentShape of piece after flip/rotate.
     * @param coord  The coordinate of board.
     * @return True if the high layer of piece can be put into board.
     */
    private boolean placeHighRing(int[][] currentShape, Coord coord) {
        return placeRing(currentShape, Piece.High, coord);
    }


    /**
     * Helper for placeLowRing & placeHighRing..
     * Determine whether the rings can be put into board.
     *
     * @param currentShape  The currentShape of piece after flip/rotate.
     * @param ringType  The low/high ringType.
     * @param coord  The coordinate of board.
     * @return True if the rings can be put into board.
     */
    private boolean placeRing(int[][] currentShape, int ringType, Coord coord) {
        int x = coord.x;
        int y = coord.y;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int cell = currentShape[i + 1][j + 1];
                int currentX = x + i;
                int currentY = y + j;
                if (cell == ringType)
                {
                    if (    0 <= currentX && currentX <= 4 &&
                            0 <= currentY && currentY <= 9)
                    {
                        if (    board[currentX][currentY] == 0 &&
                                checkNeighbours(currentX, currentY, ringType))
                        {
                            board[currentX][currentY] = cell;
                        }else
                        {
                            return false;
                        }
                    }else
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }


    /**
     * Helper for placeRing..
     * Check the neighbours ring.
     *
     * @param currentX
     * @param currentY
     * @param ringType
     * @return True if the neighbours are not high layer ring.
     */
    private boolean checkNeighbours(int currentX, int currentY, int ringType) {
        if (ringType == Piece.Low)
        {
            Coord[] neighbours = new Coord[]
                    {
                            new Coord(currentX - 1, currentY),
                            new Coord(currentX + 1, currentY),
                            new Coord(currentX, currentY + 1),
                            new Coord(currentX, currentY - 1)
                    };

            for (Coord pos : neighbours)
            {
                if (    0 <= pos.x && pos.x <= 4 &&
                        0 <= pos.y && pos.y <= 9 &&
                        board[pos.x][pos.y] == Piece.High)
                {
                    return false;
                }
            }
        }
        return true;
    }
}

