package com.snl;

import com.snl.pieces.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LadderClimbTest {
    public Board board = new Board();
    SnakeAndLadder game = new SnakeAndLadder();

    @Test
    public void checkLadderClimbNo07() {
        int position = 4, diceValue = 3, newPosition;
        game.makeMove(position, diceValue);
        newPosition = game.p.getPlayerPosition();
        assertEquals(33, newPosition);
    }

    @Test
    public void checkLadderClimbNo37() {
        int position = 34, diceValue = 3, newPosition;
        game.makeMove(position, diceValue);
        newPosition = game.p.getPlayerPosition();
        assertEquals(85, newPosition);
    }

    @Test
    public void checkLadderClimbNo51() {
        int position = 50, diceValue = 1, newPosition;
        game.makeMove(position, diceValue);
        newPosition = game.p.getPlayerPosition();
        assertEquals(72, newPosition);
    }

    @Test
    public void checkLadderClimbNo63() {
        int position = 60, diceValue = 3, newPosition;
        game.makeMove(position, diceValue);
        newPosition = game.p.getPlayerPosition();
        assertEquals(99, newPosition);
    }
}