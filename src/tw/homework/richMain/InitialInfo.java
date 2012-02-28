package tw.homework.richMain;

import tw.homework.ground.Ground;
import tw.homework.player.Player;

import java.io.IOException;
import java.util.ArrayList;

/**
 * 初始化玩家信息
 * 初始化地图信息
 * 打印地图
 */
public class InitialInfo {
    public Player[] initialPlayerInfo(ArrayList<String> inputPlayerCodeList, int inputInitialMoney) {
        //To change body of created methods use File | Settings | File Templates.
        int inputNumOfPlayer = inputPlayerCodeList.size();
        Player[] player = new Player[inputNumOfPlayer];

        for(int i = 0; i < inputNumOfPlayer; i++){
            player[i] = new  Player();
            player[i].setPlayerMoney(inputInitialMoney);
            player[i].setPlayerCode(inputPlayerCodeList.get(i));
            if(inputPlayerCodeList.get(i).equals("1")){
                player[i].setPlayerName("钱夫人");
                player[i].setPlayerSymbol("Q");
            }
            else if(inputPlayerCodeList.get(i).equals("2")){
                player[i].setPlayerName("阿土伯");
                player[i].setPlayerSymbol("A");
            }
            else if(inputPlayerCodeList.get(i).equals("3")){
                player[i].setPlayerName("孙小美");
                player[i].setPlayerSymbol("S");
            }
            else if(inputPlayerCodeList.get(i).equals("4")){
                player[i].setPlayerName("金贝贝");
                player[i].setPlayerSymbol("J");
            }
            System.out.println(player[i].getPlayerName());
            System.out.println(player[i].getPlayerMoney());
        }

        return player;
    }

    //    对地进行初始化
    public Ground[]  initialMapInfo(){
        int i;
        Ground[] ground = new Ground[70];
        //ground[0] = new Ground(0, "S");
        for( i = 0; i <= 69; i++){
            ground[i] = new Ground(i);
            switch(i){
                case 0:  ground[i].setGroundType("S"); break;
                case 14: ground[i].setGroundType("H"); break;
                case 28: ground[i].setGroundType("T"); break;
                case 35: ground[i].setGroundType("G"); break;
                case 49: ground[i].setGroundType("P"); break;
                case 63: ground[i].setGroundType("M"); break;
            }
            if( i > 63 && i < 70 ){
                ground[i].setGroundType("$");
            }
            else {
                ground[i].setGroundType("0");
                if( (i >= 1 && i <= 13) || (i>= 15 && i<= 27)){
                    ground[i].setGroundPrice(200);
                }
                else if( i >= 29 && i <= 34){
                    ground[i].setGroundPrice(500);
                }
                else if( (i >= 36 && i <= 48) || (i>= 50 && i<= 62)){
                    ground[i].setGroundPrice(300);
                }
            }
        }
        return ground;
    }

    //二维数组记录 打印 地图
    public  void printMap(Ground[] ground) {
        int int1 = 8;
        int int2 = 29;
        String[][] array = new String[int1][int2];
        int i = 0;
        int j = 0;
        // 从左到右横的开始
        for ( ; j < int2; j++) {
            array[i][j] = ground[j].getGroundType();
        }
        // 从上到下纵
        for (int k = 1; k < int1; k++) {
            array[k][int2 - 1] = ground[j++].getGroundType();
        }
        // 从右到左横
        for (int l = int2 - 2; l >= i; l--) {
            array[int1 - 1][l] = ground[j++].getGroundType();
        }
        // 从下到上纵
        for (int m = int1 - 2; m > 0; m--) {
            array[m][0] = ground[j++].getGroundType();
        }
        // 输出数组
        for (int ii = 0; ii < int1; ii++) {
            for (int jj = 0; jj < int2; jj++) {
                if(array[ii][jj] != null && array[ii][jj].length() != 0){
                    System.out.print(array[ii][jj] + " ");
                }
                else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

//    public static void main(String[] args) throws IOException {
//        InitialInfo ip = new InitialInfo();
//        ArrayList<String> inputPlayerCodeList = new ArrayList<String>();
//        inputPlayerCodeList.add("2");
//        inputPlayerCodeList.add("3");
//
//        System.out.println(inputPlayerCodeList);
//        System.out.println(inputPlayerCodeList.size());
//        ip.initialPlayerInfo(inputPlayerCodeList, 1000);
//    }


}
