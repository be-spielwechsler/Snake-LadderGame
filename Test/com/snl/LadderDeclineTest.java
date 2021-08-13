package com.snl;

import com.snl.pieces.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LadderDeclineTest {
    public Board board = new Board();
    SnakeAndLadder game = new SnakeAndLadder();

    @Test
    public void checkLadderClimbNo33() {
        int position = 30, diceValue = 3, newPosition;
        game.makeMove(position, diceValue);
        newPosition = game.p.getPlayerPosition();
        assertEquals(7, newPosition);
    }

    @Test
    public void checkLadderClimbNo85() {
        int position = 84, diceValue = 1, newPosition;
        game.makeMove(position, diceValue);
        newPosition = game.p.getPlayerPosition();
        assertEquals(37, newPosition);
    }

    @Test
    public void checkLadderClimbNo72() {
        int position = 71, diceValue = 1, newPosition;
        game.makeMove(position, diceValue);
        newPosition = game.p.getPlayerPosition();
        assertEquals(51, newPosition);
    }

    @Test
    public void checkLadderClimbNo99() {
        int position = 98, diceValue = 1, newPosition;
        game.makeMove(position, diceValue);
        newPosition = game.p.getPlayerPosition();
        assertEquals(63, newPosition);
    }
}