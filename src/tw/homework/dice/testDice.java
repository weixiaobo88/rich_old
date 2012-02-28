package tw.homework.dice;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class testDice {
    @Test
    public void testDicePointsBetween1and6(){
        Dice dice = new Dice();
        int randomInt = dice.points();
        assertTrue(randomInt > 0 && randomInt < 7);
        System.out.println(randomInt);
    }
}
