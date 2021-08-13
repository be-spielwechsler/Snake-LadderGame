package com.snl;

import com.snl.pieces.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOverTest {
    public Board board = new Board();
    SnakeAndLadder game = new SnakeAndLadder();

    @Test
    public void checkGameOverOn100() {
        int position = 98, diceValue = 2, newPosition;
        game.makeMove(position, diceValue);
        newPosition = game.p.getPlayerPosition();
        assertEquals(100, newPosition);
    }

    @Test
    public void checkGameNotOverOnAbove100() {
        int position = 98, diceValue = 3, newPosition;
        game.makeMove(position, diceValue);
        newPosition = game.p.getPlayerPosition();
        assertEquals(98, newPosition);
    }

}