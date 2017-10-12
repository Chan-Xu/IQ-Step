package comp1110.ass2;

public class GameBoard {

    private int[][] board = new int[5][10];

    GameBoard(){
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                board[i][j] = 0;
            }
        }
    }

    public boolean isPlacePiece (Piece pce, char pos){
        int index = 0;
        int[][] currentShape = pce.shape;

        if (pos < 'a')
        {
            index = pos - 'A';
        }else if (pos > 'Y')
        {
            index = 25 + (pos - 'a');
        }

        int x = index / 10;
        int y = index % 10;

        for (int i = -1; i <= 1; i++)
        {
            for (int j = -1; j <= 1; j++)
            {
                int cellNumber = currentShape[i+1][j+1];
                int currentX = x + i;
                int currentY = y + j;
                if (cellNumber != 0)
                {
                    if (0 <= currentX && currentX <= 4 &&
                        0 <= currentY && currentY <= 9)
                    {
                        if (cellNumber > board[currentX][currentY])
                        {
                            board[currentX][currentY] = cellNumber;
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
        }return true;
    }
}
