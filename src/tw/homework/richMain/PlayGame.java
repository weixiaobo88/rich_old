package tw.homework.richMain;

import tw.homework.dice.Dice;
import tw.homework.ground.Ground;
import tw.homework.inputValidation.InputValidation;
import tw.homework.player.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PlayGame {

    public void playingGame(Player[] player, ArrayList<String> inputPlayerCodeList, InitialInfo initialInfo, Ground[] ground) throws IOException {
//        BufferedReader buffer = new BufferedReader(new InputStreamReader(
//                System.in));
//        String order = buffer.readLine();
        InputValidation inputValidation = new InputValidation();
        Dice dice = new Dice();
        int currentLocation;

        int numOfPlayers = inputPlayerCodeList.size();
//        boolean inHospital = true;
        ArrayList<String> playerHospitalOrPrison = new ArrayList<String>();    //医院或者监狱的玩家编号
        int daysOfHospital = 3;
        for(int i = 0; i < numOfPlayers; i ++){
//            if(playerHospitalOrPrison.size() != 0){
//                for(int j = 0; j < playerHospitalOrPrison.size(); j++){
//                    if(player[i].getPlayerCode().equals(playerHospitalOrPrison.get(j))){
//                        if(daysOfHospital-- > 0){
//                            i = (i + 1) % numOfPlayers;
//                        }
//
//                        break;
//                    }
//                }
//            }
            //当前玩家编号 ,住院，下一个玩家
//            currentPlayerCode(player,i, playerHospitalOrPrison);

            System.out.print(player[i].getPlayerName() + ">");
            currentLocation = player[i].getPlayerLocation();
//            使用道具，卖房产，查询
//                printGuide(player[i]);

            BufferedReader buffer = new BufferedReader(new InputStreamReader(
            System.in));
            String order = buffer.readLine();
            //  判断输入命令是否正确
            inputValidation.testOrder(order, "roll");

            int randomInt = dice.points();

//                判断是否有路障
//                isRoadBlock();
//                判断是否空地等
//                isGround();
//                判断是否医院/道具屋/礼品屋/监狱/魔法屋
            GroundOperation groundOperation = new GroundOperation();
            groundOperation.judgeGroundType(player[i], currentLocation, randomInt, initialInfo, ground);

            if(player[i].getPlayerLocation() == 14 || player[i].getPlayerLocation() == 49){
                //当前玩家行走 到 医院 监狱
                playerHospitalOrPrison.add(player[i].getPlayerCode());
            }

        }




    }

    private void printGuide(Player player) throws IOException {
        //To change body of created methods use File | Settings | File Templates.
//        BufferedReader buffer = new BufferedReader(new InputStreamReader(
//                System.in));
//        String order = buffer.readLine();
        System.out.println("*******************");
        System.out.println("****1 使用道具****");
        System.out.println("****2 出售    ****");
        System.out.println("****3 查询    ****");
        System.out.println("******************");

//        if(order.equals("1")){
////            先判断是否有道具，列表，输出
//            if(player.getToolBombNum()!=0){
//
//            }
//        }
//        else if(order.equals("2")){
////            先判断是否有房产，列表，输出
//        }
//        else if(order.equals("3")){
////            查询
//        }
    }


//    public static void main(String args[]){
//        PlayGame playGame = new PlayGame();
//
//    }
}
