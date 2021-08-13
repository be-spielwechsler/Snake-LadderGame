package com.snl.pieces;

public class Snake {
    final Tile snakeMouth;
    final Tile snakeTail;

    Snake(Tile snakeMouth, Tile snakeTail) {
        this.snakeMouth = snakeMouth;
        this.snakeTail = snakeTail;
    }

    public Tile getSnakeMouth() {
        return snakeMouth;
    }

    public Tile getSnakeTail() {
        return snakeTail;
    }
}