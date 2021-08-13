package com.snl;

public class Player {
    int playerPosition;

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void movePlayer(int diceValue) {
        if (playerPosition + diceValue <= 100) {
            playerPosition += diceValue;
        }
    }
}
