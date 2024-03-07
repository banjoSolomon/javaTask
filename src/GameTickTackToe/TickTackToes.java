package GameTickTackToe;

import java.util.Arrays;

public class TickTackToes {




    public enum TickTackToeValues {
        X, O, EMPTY
    }


    private TickTackToeValues[][] board;
    private TickTackToeValues currentPlayer;



    public boolean drawGame() {
        for(int row = 0; row < 3; row++)
            for(int col = 0; col < 3; col++)
                if(board[row][col]== TickTackToeValues.EMPTY){

                    return false;
                }
        return true;

    }
    public boolean checkForWinner(TickTackToeValues player) {
        for(int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;

            if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
                return true;

            if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
                return true;

            if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
                return true;

        }
        return false;
    }

    public TickTackToeValues getCurrentPlayer() {
        return currentPlayer;
    }

    public TickTackToeValues[][] getBoard() {
        return board;
    }


    public TickTackToes() {
        board = new TickTackToeValues[3][3];
        for (TickTackToeValues[] tickTackToeValues : board) {
            Arrays.fill(tickTackToeValues, TickTackToeValues.EMPTY);

        }
        currentPlayer = TickTackToeValues.X;
    }

    public void makeMove(int row, int col) {
        if (board[row][col] == TickTackToeValues.EMPTY) {
            board[row][col] = currentPlayer;
            currentPlayer = (currentPlayer == TickTackToeValues.X) ? TickTackToeValues.O : TickTackToeValues.X;

        }
    }
}