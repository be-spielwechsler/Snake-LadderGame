package com.snl;

import com.snl.pieces.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnakeBiteTest {
    public Board board = new Board();
    SnakeAndLadder game = new SnakeAndLadder();

    @Test
    public void checkSnakeBiteNo36() {
        int position = 33, diceValue = 3, newPosition;
        game.makeMove(position, diceValue);
        newPosition = game.p.getPlayerPosition();
        assertEquals(19, newPosition);
    }

    @Test
    public void checkSnakeBiteNo65() {
        int position = 61, diceValue = 4, newPosition;
        game.makeMove(position, diceValue);
        newPosition = game.p.getPlayerPosition();
        assertEquals(35, newPosition);
    }

    @Test
    public void checkSnakeBiteNo87() {
        int position = 84, diceValue = 3, newPosition;
        game.makeMove(position, diceValue);
        newPosition = game.p.getPlayerPosition();
        assertEquals(32, newPosition);
    }

    @Test
    public void checkSnakeBiteNo97() {
        int position = 95, diceValue = 2, newPosition;
        game.makeMove(position, diceValue);
        newPosition = game.p.getPlayerPosition();
        assertEquals(21, newPosition);
    }


}