package TickTackToe;

import GameTickTackToe.InvalidMoveException;
import GameTickTackToe.TickTackToes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TickTacToeTest {
    private TickTackToes game;

    @BeforeEach
    public void setUp() {
        game = new TickTackToes();
    }

    @Test
    public void testTheGameIsEmpty() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                assertEquals(TickTackToes.TickTackToeValues.EMPTY, game.getBoard()[row][col]);
            }
        }
    }

    @Test
    public void testTwoPlayerCanPlayTheGame() {
        assertEquals(TickTackToes.TickTackToeValues.X, game.getCurrentPlayer());
        game.makeMove(0, 0);
        assertEquals(TickTackToes.TickTackToeValues.O, game.getCurrentPlayer());
    }

    @Test
    public void testForValidMove() {
        assertEquals(TickTackToes.TickTackToeValues.EMPTY, game.getBoard()[0][0]);
        game.makeMove(0, 0);
        assertEquals(TickTackToes.TickTackToeValues.X, game.getBoard()[0][0]);
        assertEquals(TickTackToes.TickTackToeValues.O, game.getCurrentPlayer());
    }

    @Test
    public void testGameProgress() {
        assertEquals(TickTackToes.TickTackToeValues.EMPTY, game.getBoard()[0][0]);
        game.makeMove(0, 0);
        assertEquals(TickTackToes.TickTackToeValues.X, game.getBoard()[0][0]);
        assertEquals(TickTackToes.TickTackToeValues.O, game.getCurrentPlayer());

        game.makeMove(1, 1);
        assertEquals(TickTackToes.TickTackToeValues.O, game.getBoard()[1][1]);
        assertEquals(TickTackToes.TickTackToeValues.X, game.getCurrentPlayer());

        game.makeMove(0, 1);
        assertEquals(TickTackToes.TickTackToeValues.X, game.getBoard()[0][1]);
        assertEquals(TickTackToes.TickTackToeValues.O, game.getCurrentPlayer());
    }

    @Test
    public void testWinningCondition() {
        game.makeMove(0, 0);
        game.makeMove(1, 1);
        game.makeMove(0, 1);
        game.makeMove(1, 2);
        game.makeMove(0, 2);

        assertTrue(game.checkForWinner(TickTackToes.TickTackToeValues.X));
    }

    @Test
    public void testForDraw() {
        game.makeMove(0, 0);
        game.makeMove(0, 1);
        game.makeMove(0, 2);
        game.makeMove(1, 0);
        game.makeMove(1, 1);
        game.makeMove(1, 2);
        game.makeMove(2, 0);
        game.makeMove(2, 1);
        game.makeMove(2, 2);

        // assertFalse(game.checkForWinner(TickTackToes.TickTackToeValues.X));
        // assertFalse(game.checkForWinner(TickTackToes.TickTackToeValues.O));
        assertTrue(game.drawGame());
    }

    @Test
    public void testGameStateAfterMove() {
        assertEquals(TickTackToes.TickTackToeValues.X, game.getCurrentPlayer());
        assertEquals(TickTackToes.TickTackToeValues.EMPTY, game.getBoard()[0][0]);
        game.makeMove(0, 0);

        assertEquals(TickTackToes.TickTackToeValues.O, game.getCurrentPlayer());
        assertEquals(TickTackToes.TickTackToeValues.X, game.getBoard()[0][0]);
        game.makeMove(1, 1);

        assertEquals(TickTackToes.TickTackToeValues.X, game.getCurrentPlayer());
        assertEquals(TickTackToes.TickTackToeValues.O, game.getBoard()[1][1]);
    }

    @Test
    public void testSwitchingPlayers(){
        assertEquals(TickTackToes.TickTackToeValues.X, game.getCurrentPlayer());
        game.makeMove(0,0);
        assertEquals(TickTackToes.TickTackToeValues.O, game.getCurrentPlayer());
        game.makeMove(1,1);
        assertEquals(TickTackToes.TickTackToeValues.X, game.getCurrentPlayer());

    }

    @Test
    public void testInvalidMove(){
        assertThrows(InvalidMoveException.class, ()-> game.makeMove(3,0));
        assertThrows(InvalidMoveException.class, ()-> game.makeMove(0,3));
        assertThrows(InvalidMoveException.class, () -> game.makeMove(-1, 0));
        assertThrows(InvalidMoveException.class, () -> game.makeMove(0, -1));
        game.makeMove(0, 0);
        assertThrows(InvalidMoveException.class, () -> game.makeMove(0, 0));
    }







}









