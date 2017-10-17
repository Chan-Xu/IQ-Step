package comp1110.ass2;

public class GameBoard {

    private int[][] board = new int[5][10];

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

    GameBoard() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = 0;
            }
        }
    }

    public boolean isPlacePiece(Piece pce, char pos) {

        Coord coord = new Coord(getRingIndex(pos));
        int[][] currentShape = pce.shape;

        return placeLowRing(currentShape, coord) && placeHighRing(currentShape, coord);
    }

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

    private boolean placeLowRing(int[][] currentShape, Coord coord) {
        return placeRing(currentShape, Piece.Low, coord);
    }

    private boolean placeHighRing(int[][] currentShape, Coord coord) {
        return placeRing(currentShape, Piece.High, coord);
    }

    private boolean placeRing(int[][] currentShape, int ringType, Coord coord) {
        int x = coord.x, y = coord.y;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int cell = currentShape[i + 1][j + 1];
                int currentX = x + i, currentY = y + j;
                if (cell == ringType)
                {
                    if (0 <= currentX && currentX <= 4
                            && 0 <= currentY && currentY <= 9)
                    {
                        if (board[currentX][currentY] == 0 &&
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

    private boolean checkNeighbours(int currentX, int currentY, int pegType) {
        if (pegType == Piece.Low) {
            Coord[] neighbours = new Coord[]
                    {
                            new Coord(currentX - 1, currentY),
                            new Coord(currentX + 1, currentY),
                            new Coord(currentX, currentY + 1),
                            new Coord(currentX, currentY - 1)
                    };

            for (Coord pos : neighbours)
            {
                if (0 <= pos.x && pos.x <= 4
                        && 0 <= pos.y && pos.y <= 9
                        && board[pos.x][pos.y] == Piece.High)
                {
                    return false;
                }
            }
        }
        return true;
    }
}

