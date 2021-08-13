package com.snl.pieces;

public class Board {
    Tile[] tiles;
    Snake[] snakes;
    Ladder[] ladders;

    public Board() {
        tiles = new Tile[101];
        for (int tile = 1; tile <= 100; tile++) {
            tiles[tile] = new Tile(tile);
        }
        setSnakes();
        setLadder();
    }

    void setSnakes() {
        snakes = new Snake[4];
        snakes[0] = new Snake(tiles[36], tiles[19]);
        snakes[1] = new Snake(tiles[65], tiles[35]);
        snakes[2] = new Snake(tiles[87], tiles[32]);
        snakes[3] = new Snake(tiles[97], tiles[21]);
    }

    void setLadder() {
        ladders = new Ladder[4];
        ladders[0] = new Ladder(tiles[33], tiles[7]);
        ladders[1] = new Ladder(tiles[85], tiles[37]);
        ladders[2] = new Ladder(tiles[72], tiles[51]);
        ladders[3] = new Ladder(tiles[99], tiles[63]);
    }

    public boolean isSnakeMouthPresent(int tileId) {
        for (int snake = 0; snake < 4; snake++)
            if (snakes[snake].getSnakeMouth().getTileIndex() == tileId)
                return true;
        return false;
    }

    public int getSnakeTail(int tileId) {
        for (int snake = 0; snake < 4; snake++)
            if (snakes[snake].getSnakeMouth().getTileIndex() == tileId)
                return snakes[snake].getSnakeTail().getTileIndex();
        return -1;
    }

    public boolean isLadderTopPresent(int tileId) {
        for (int ladder = 0; ladder < 4; ladder++)
            if (ladders[ladder].getLadderTop().getTileIndex() == tileId)
                return true;
        return false;
    }

    public boolean isLadderBasePresent(int tileId) {
        for (int ladder = 0; ladder < 4; ladder++)
            if (ladders[ladder].getLadderBase().getTileIndex() == tileId)
                return true;
        return false;
    }

    public int getLadderTop(int tileId) {
        for (int ladder = 0; ladder < 4; ladder++)
            if (ladders[ladder].getLadderBase().getTileIndex() == tileId)
                return this.ladders[ladder].getLadderTop().getTileIndex();
        return -1;
    }

    public int getLadderBase(int tileId) {
        for (int ladder = 0; ladder < 4; ladder++)
            if (ladders[ladder].getLadderTop().getTileIndex() == tileId)
                return this.ladders[ladder].getLadderBase().getTileIndex();
        return -1;
    }
}
