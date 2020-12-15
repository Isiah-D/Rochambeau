package com.zaycodes;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Game Rochambeau = new Game();

        int userScore = 0;
        int cpuScore = 0;
        int gameCount = 0;


        while (gameCount < 3) {
            int outcome = Rochambeau.startGame();
            if (outcome == 1) {
                userScore++;
            } else {
                cpuScore++;
            }
            gameCount++;
            if (gameCount == 3) {
                if (userScore > cpuScore) {
                    System.out.println("You have won the game!");
                } else {
                    System.out.println("Computers just aren't human");
                }
            }

        }
    }
}