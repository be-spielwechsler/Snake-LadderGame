package com.snl;

import com.snl.pieces.Board;
import com.snl.pieces.Dice;

import java.util.Scanner;

public class SnakeAndLadder {
    public Board board;
    public Player p;
    public Dice dice;

    public SnakeAndLadder() {
        board = new Board();
        p = new Player();
        dice = new Dice();
    }

    public void makeMove(int position, int diceValue) {
        // dice.rollDice();
        //  int diceValue = dice.getRollValue();
        p.setPlayerPosition(position);
        p.movePlayer(diceValue);
        snakeCheck();
        ladderCheck();
        System.out.println("New Position:" + p.getPlayerPosition());
    }

    public void snakeCheck() {
        if (board.isSnakeMouthPresent(p.getPlayerPosition())) {
            p.setPlayerPosition(board.getSnakeTail(p.getPlayerPosition()));
        }
    }

    public void ladderCheck() {
        if (board.isLadderBasePresent(p.getPlayerPosition())) {
            p.setPlayerPosition(board.getLadderTop(p.getPlayerPosition()));
        } else if (board.isLadderTopPresent(p.getPlayerPosition())) {
            p.setPlayerPosition(board.getLadderBase(p.getPlayerPosition()));
        }
    }

    public boolean isGameOver() {
        if (p.getPlayerPosition() == 100)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        SnakeAndLadder game = new SnakeAndLadder();
        int position, diceValue;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Current Position:");
        position = sc.nextInt();
        System.out.println("Enter Dice Outcome:");
        diceValue = sc.nextInt();
        if (diceValue <= 6)
            game.makeMove(position, diceValue);
        else
            System.out.println("invalid dice value");
        // position= Player.getPlayerPosition();
        if (game.isGameOver()) {
            System.out.println("Game is over");
        }
       /* else {
            while (true) {
                System.out.println("Enter Dice Outcome:");
                diceValue = sc.nextInt();
                game.makeMove(position, diceValue);
                position= Player.getPlayerPosition();
                if (game.isGameOver()) {
                    System.out.println("Game is over");
                    break;
                }
            }
        }
        */
    }
}
