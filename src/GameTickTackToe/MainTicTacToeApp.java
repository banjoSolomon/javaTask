package GameTickTackToe;

import java.util.Scanner;

public class MainTicTacToeApp {
    public static void main(String[] args) {
        TickTackToes game = new TickTackToes();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tic Tac Toe!");

        while (!isGameOver(game)) {
            printGameStatus(game);


            System.out.println("Player " + game.getCurrentPlayer() + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            try {
                makeMove(game, row, col);

            } catch (InvalidMoveException e) {
                System.out.println("Invalid move! Please try again.");
            }
        }

        printGameResult(game);


    }
    private static void printGameStatus(TickTackToes game) {
        System.out.println("Current Board:");
        TickTackToes.TickTackToeValues[][] board = game.getBoard();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void makeMove(TickTackToes game, int row, int col) throws InvalidMoveException {

        game.makeMove(row, col);


        if (isGameOver(game)) {
            printGameStatus(game);
            printGameResult(game);
        }
    }

    private static boolean isGameOver(TickTackToes game) {
        return game.checkForWinner(TickTackToes.TickTackToeValues.X)
                || game.checkForWinner(TickTackToes.TickTackToeValues.O)
                || game.drawGame();
    }

    private static void printGameResult(TickTackToes game) {
        if (game.checkForWinner(TickTackToes.TickTackToeValues.X)) {
            System.out.println("Player X wins!");
        } else if (game.checkForWinner(TickTackToes.TickTackToeValues.O)) {
            System.out.println("Player O wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}




