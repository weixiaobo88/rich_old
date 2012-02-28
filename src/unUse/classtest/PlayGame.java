package tw.homework.classtest;

import tw.homework.inputValidation.InputValidation;
import tw.homework.player.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PlayGame {
    public void playingGame(Player[] player, ArrayList<String> inputPlayerCodeList) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(
                System.in));
        String order = buffer.readLine();
        InputValidation inputValidation = new InputValidation();

        int numOfPlayers = inputPlayerCodeList.size();

        for(int i = 0; i < numOfPlayers; i ++){
            System.out.print(player[i].getPlayerName() + ">");
            //  判断输入命令是否正确
            inputValidation.testOrder(order, "roll");
//            int currentLocation = player[i]
        }
    }

//    public static void main(String args[]){
//        PlayGame playGame = new PlayGame();
//
//    }
}
