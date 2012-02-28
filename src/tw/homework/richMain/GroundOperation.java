package tw.homework.richMain;

import tw.homework.ground.Ground;
import tw.homework.player.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroundOperation {

    public void judgeGroundType(Player player, int currentLocation, int randomInt, InitialInfo initialInfo, Ground[] ground) throws IOException {
        int newLocation = currentLocation + randomInt;
//        int greaterThan69Location;
//        if(newLocation > 69){
//            greaterThan69Location = newLocation % 69 -1;
//        }

//        boolean hasRoadBlock = false;


//        先检查是否有路障
//        int codeOfRoadBlock = hasRoadBlock();

        for(int i = currentLocation; i <= newLocation; i++){
            if(!ground[i].isGroundRoadBlock() && !ground[i].isGroundBomb()){    //该位置没有路障和炸弹，继续判断下一个位置
//                if()是新的位置 ，判断是否空地
                if(i == newLocation){
                    // 判断是否地
                   //判断是否医院/道具屋/礼品屋/监狱/魔法屋
                   groundOrSpecialPlace(player, ground, newLocation);
                }
                else{
                    continue;
                }
            }
            if(ground[i].isGroundRoadBlock()){    //该位置是路障
                if(!(ground[i].getBlockOfPlayer()).equals(player.getPlayerCode())){   //路障不是本人的
                    System.out.println("编号为" + i + "的ground有路障");
                    if(player.getToolRobotNum() != 0){   //有机器娃娃
                        System.out.println("是否使用机器娃娃？使用请输入命令:robot 输入其他命令默认为不使用");
                        BufferedReader buffer = new BufferedReader(new InputStreamReader(
                                System.in));
                        String order = buffer.readLine();

                        if(order.equalsIgnoreCase("robot")){
                            //使用robot, 清扫十步以内的炸弹和路障
                            robotOperation(currentLocation, ground, player);
                            //设置当前位置
                            player.setPlayerLocation(newLocation);
                            break;
                        }
                        else { //不使用robot
                            player.setPlayerLocation(i); //编号为路障处编号
                            //本次路障失效
                            ground[i].setGroundRoadBlock(false);
                            ground[i].setBlockOfPlayer(null);
                            break;
                        }
                    }
                    else {  //没有机器娃娃
                        player.setPlayerLocation(i); //编号为路障处编号
                        //  本次路障失效
                        ground[i].setGroundRoadBlock(false);
                        ground[i].setBlockOfPlayer(null);
                        break;
                    }

                }
                else{     //路障是本人的，不影响，继续判断下一个位置
                    continue;
                }
            }
            if(ground[i].isGroundBomb()){    //该位置是炸弹
                if(!(ground[i].getBombOfPlayer()).equals(player.getPlayerCode())){   //炸弹不是本人的
                    System.out.println("编号为" + i + "的ground有炸弹");
                    if(player.getToolRobotNum() != 0){   //有机器娃娃
                        System.out.println("是否使用机器娃娃？使用请输入命令:robot 输入其他命令默认为不使用");
                        BufferedReader buffer = new BufferedReader(new InputStreamReader(
                                System.in));
                        String order = buffer.readLine();

                        if(order.equalsIgnoreCase("robot")){
                            //使用robot, 清扫十步以内的炸弹和路障
                            robotOperation(currentLocation, ground, player);
                            //设置当前位置
                            player.setPlayerLocation(newLocation);
                            break;    //结束循环
                        }
                        else { //不使用robot
                            //本次路障失效
                            ground[i].setGroundRoadBlock(false);
                            ground[i].setBlockOfPlayer(null);
                            goToHospital(ground, player);   //住院
                            break;     //结束循环
                        }
                    }
                    else {  //没有机器娃娃
                        //本次路障失效
                        ground[i].setGroundRoadBlock(false);
                        ground[i].setBlockOfPlayer(null);
                        goToHospital(ground, player);      //住院
                        break;     //结束循环
                    }
                }
                else{     //路障是本人的，不影响，继续判断下一个位置
                    continue;
                }
            }

        }

//        没有路障炸弹 或者 当前为
    }


    private void groundOrSpecialPlace(Player player, Ground[] ground, int newLocation) {
        // 判断是否地
        //判断是否医院/道具屋/礼品屋/监狱/魔法屋
//        不使用ground[newLocation].getGroundType().equalsIgnoreCase("H")的原因是：玩家的符号会覆盖这些特殊地点的符号
        switch (newLocation){
            case 14:   player.goToHospital(player); break;      //          医院 ---- 住院
            case 28:   player.goToToolHouse(player); break;     //          道具屋
            case 35:   player.goToGiftHouse(player); break;     //           礼品屋
            case 49:   player.goToPrison(player); break;        //           监狱
            case 63:   player.goToMagicHouse(player); break;      //           魔法屋
        }


        if( newLocation >= 64 && newLocation <= 69 )  {
//             矿地
            player.goToAreaMine(player);
        }


        if( (newLocation >= 1 && newLocation <= 13) || (newLocation >= 15 && newLocation <= 27) )  {
//            地段一 地段二
            player.goToArea12(player);
        }


        if( newLocation >= 29 && newLocation <= 34 )  {
//            地段三
            player.goToArea3(player);
        }


        if( (newLocation >= 36 && newLocation <= 48 ) ||(newLocation >= 50 && newLocation <= 62 ))   {
//            地段四 地段五
            player.goToArea45(player);
        }

    }


    //  玩家碰到炸弹住院
    private void goToHospital(Ground[] ground, Player player) {
//住院三天
          player.setPlayerLocation(14);
    }

    //    robot清扫前方路面上10步以内（包括10）的 其它道具，如炸弹、路障
    private void robotOperation(int currentLocation, Ground[] ground, Player player) {
        //To change body of created methods use File | Settings | File Templates.
        for(int i = currentLocation; i <= currentLocation + 10; i++){
            if(ground[i].isGroundRoadBlock()){
//                有路障不是本人的
                if(!(ground[i].getBlockOfPlayer()).equals(player.getPlayerCode())){
                    ground[i].setGroundRoadBlock(false);
                    ground[i].setBlockOfPlayer(null);
                }
            }
            if(ground[i].isGroundBomb()){
//                有炸弹不是本人的
                if(!(ground[i].getBlockOfPlayer()).equals(player.getPlayerCode())){
                    ground[i].setGroundBomb(false);
                    ground[i].setBombOfPlayer(null);
                }
            }
        }
//        System.out.println(player.getToolRobotNum());
        player.setToolRobotNum(player.getToolRobotNum() - 1);
//        System.out.println(player.getToolRobotNum());

    }
}
