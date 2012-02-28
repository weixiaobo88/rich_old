package unUse.classtest;

import tw.homework.ground.Ground;
import tw.homework.player.Player;
import tw.homework.richMain.InitialInfo;

import java.io.IOException;

public class GroundOperation {

    public void judgeGroundType(Player player, int currentLocation, int randomInt, InitialInfo initialInfo, Ground[] ground) throws IOException {
        int newLocation = currentLocation + randomInt;
        int lastLocation ;
//        是否超过69，新位置需要更改为x-0-xx
        if(newLocation > 69){
            lastLocation = lastLocationCode(player, ground, currentLocation, 69);
            lastLocation = lastLocationCode(player, ground, 0, newLocation - 70);
        }
        else{
            lastLocation = lastLocationCode(player, ground, currentLocation, newLocation);
        }

        if(newLocation == lastLocation){         //无炸弹无路障
            player.setPlayerLocation(newLocation);
            //判断地是不是自己的
            if(ground[newLocation].getGroundOwner() == null){                           //空地
                blanketsOperation(ground[newLocation], player);
            }
            else{
                if(ground[newLocation].getGroundOwner().equals(player.getPlayerCode())){    //地是自己的
                    groundOfownerOperation(ground[newLocation], player);                      //自己地的操作
                }
                else {                                                                     //地是别人的
                    groundOfOthersOperation(ground[newLocation], player);
                }
            }

        }
        else {          //有炸弹或者路障
            if(ground[lastLocation].isGroundRoadBlock()){     //路障
                blockOperation(ground[lastLocation], player);
            }
            else if(ground[lastLocation].isGroundBomb()){   //炸弹
               bombOperation(ground[lastLocation], player);
            }
        }

    }

    private void groundOfOthersOperation(Ground ground, Player player) {
        //地是别人的,根据地的级别给钱

    }

    private int lastLocationCode(Player player, Ground[] ground, int startCode, int endCode) {
        // 有路障或者炸弹，返回路障或者炸弹的位置，如果都没有，就返回最终的编号
        int i;
        for(i = startCode; i <= endCode; i++){
            //hasRoadBlock(ground, i) 返回true/false  // 先检查是否有路障
            if(hasRoadBlock(player, ground, i)){
                break;
            }
            if(hasBomb(player, ground, i)){
                break;
            }

        }
        return i;
    }

    private boolean hasBomb(Player player, Ground[] ground, int i) {
        if(ground[i].isGroundBomb()) {   //有炸弹
            if(ground[i].getBombOfPlayer().equals(player.getPlayerCode())) {  //是本人的
                 return false;
            }
            else {           //不是本人的
                return true;
            }
        }
        return false;  //To change body of created methods use File | Settings | File Templates.
    }

    private boolean hasRoadBlock(Player player, Ground[] ground, int i) {
        if(ground[i].isGroundRoadBlock()) {   //有路障
            if(ground[i].getBlockOfPlayer().equals(player.getPlayerCode())) {  //是本人的
                return false;
            }
            else {           //不是本人的
                return true;
            }
        }
        return false;  //To change body of created methods use File | Settings | File Templates.
    }

}