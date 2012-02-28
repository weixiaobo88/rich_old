package tw.homework.orderOperation;

import tw.homework.dice.Dice;
import tw.homework.ground.Ground;
import tw.homework.player.Player;

/**
 * 命令操作
 */
public class OrderOperation {

    public int orderOperationMethod(String orderStr, int currentLocation, Ground[] ground, Player player) {
        int steps = 0;
//        输入命令Block n  拆分命令
//        输入命令bomb n  拆分命令
        int assetsCode;
        int toolCode;
        if(orderStr.equalsIgnoreCase("roll")){
            Dice dice = new Dice();
            return dice.points();
        }
        if(orderStr.equalsIgnoreCase("robot")){
            robotOperation(currentLocation, ground);
//            System.out.println(player.getToolRobotNum());
            player.setToolRobotNum(player.getToolRobotNum()-1);
//            System.out.println(player.getToolRobotNum());
        }
        if(orderStr.equalsIgnoreCase("query")){
            
        }
        return 0;
    }

//    robot清扫前方路面上10步以内（包括10）的 其它道具，如炸弹、路障
    private void robotOperation(int currentLocation, Ground[] ground) {
        //To change body of created methods use File | Settings | File Templates.
        for(int i = currentLocation; i <= currentLocation + 10; i++){
            ground[i].setGroundBomb(false);
            ground[i].setGroundRoadBlock(false);
        }
    }
}
