package com.snl.pieces;

public class Ladder {
    final Tile ladderTop;
    final Tile ladderBase;

    Ladder(Tile ladderTop, Tile ladderBase) {
        this.ladderTop = ladderTop;
        this.ladderBase = ladderBase;
    }

    public Tile getLadderBase() {
        return ladderBase;
    }

    public Tile getLadderTop() {
        return ladderTop;
    }
}