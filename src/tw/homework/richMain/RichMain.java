package tw.homework.richMain;

import tw.homework.ground.Ground;
import tw.homework.inputValidation.InputValidation;
import tw.homework.player.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RichMain {
    public static void main(String args[]) throws IOException {
//        Scanner in = new Scanner(System.in);
//        String order = in.next();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(
                System.in));
        String order = buffer.readLine();

        int numberOfPlayer = 0;

        InputValidation inputValidation = new InputValidation();
        inputValidation.testOrder(order, "rich");

        System.out.println("欢迎进入大富翁游戏！");

        InitialInfo initialInfo = new InitialInfo();
        Ground[] ground = initialInfo.initialMapInfo();
        initialInfo.printMap(ground);

//            输入玩家编号
        System.out.println("请选择2~4位不重复玩家，输入编号即可。(1.钱夫人; 2.阿土伯; 3.孙小美; 4.金贝贝):：如输入12");
        ArrayList<String> inputPlayerCodeList = inputValidation.testPlayer();
        System.out.println(inputPlayerCodeList);

//        numberOfPlayer = inputPlayerCodeList.size();

//          输入初始资金
        System.out.println("请设置玩家初始资金，范围为1000~50000，默认为10000");
        int inputInitialMoney = inputValidation.testMoney();

//          初始化玩家信息
        InitialInfo initialPlayer = new InitialInfo();
        Player[] player =  initialPlayer.initialPlayerInfo(inputPlayerCodeList,inputInitialMoney);
        System.out.println();

//           显示当前玩家
        PlayGame playGame = new PlayGame();
        playGame.playingGame(player, inputPlayerCodeList, initialInfo, ground);





//            System.out.println(player[1].getPlayerName());
//            System.out.println(player[2].getPlayerName());

//            initializerPlayer(inputPlayerCodeList, );
//输出当前玩家
//            printCurrentPlayer(selectedPlayerCode);



    }




}
