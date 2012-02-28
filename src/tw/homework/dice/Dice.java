package tw.homework.dice;

import java.util.Random;

public class Dice {
    public int points() {
        int dicePoints = (int)(Math.random()*6)+1;
        return dicePoints;
    }
}
