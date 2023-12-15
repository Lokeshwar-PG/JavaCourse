package com.Day4;

import java.util.Arrays;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class SnakesAndLadders {
    static int[] ladders = {4, 12, 14, 22, 41, 54};
    static int[] ladderSteps = {52, 38, 41, 36, 38, 34};
    static int[] snakes = {28, 37, 48, 75, 94, 96};
    static int[] snakeSteps = {18, 34, 32, 43, 23, 54};
    public static void main(String[] args) {

        int totalRolls = 0;
        int currentPosition = 0;
        Random random = new Random();

        System.out.println("The die rolling numbers and current position: ");

        while(currentPosition != 100) {
            int dieNumber = random.nextInt(6)+1;
            System.out.print("["+currentPosition+"] ");
            System.out.print(dieNumber+" ");

            if((currentPosition + dieNumber) == 100) {
                totalRolls++;
                System.out.println("["+(currentPosition+dieNumber)+"]");
                break;
            }
            else if((currentPosition + dieNumber) < 100) {
                currentPosition = currentPosition + dieNumber;
                totalRolls++;
            }
            else if((currentPosition + dieNumber) > 100) {
                totalRolls++;
            }

            if(isLadder(currentPosition)>=0) {
                System.out.println("|"+currentPosition+"|");
                currentPosition+=ladderSteps[isLadder(currentPosition)];
            }
            if(isSnake(currentPosition)>=0) {
                System.out.println("{"+currentPosition+"}");
                currentPosition-=snakeSteps[isSnake(currentPosition)];
            }
        }

        System.out.println("\nYou have reached your destination in " + totalRolls + " rolls");
    }

    public static int isLadder(int value) {
        for(int i=0; i<ladders.length; i++) {
            if(ladders[i] == value) {
                return i;
            };
        }
        return -1;
    }
    public static int isSnake(int value) {
        for(int i=0; i<snakes.length; i++) {
            if(snakes[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
