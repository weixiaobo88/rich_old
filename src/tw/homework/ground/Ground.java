package tw.homework.ground;

public class Ground {
//   groundNumber为0~69
    int groundCode;
//    int groundHospitalCode = 14;
//    int groundToolHouseCode = 28;
//    int groundGiftHouseCode = 35;
//    int groundPrisonCode = 49;
//    int groundMagicHouseCode = 63;

//   groundType:S T G M H P $ 0 
    String groundType; 
//    所属玩家       ---对应玩家编号1`4
    String groundOwner = null;
//    地的价格
    int groundPrice =  0;
//    地的级别： 0 1 2 3
    int groundLever = 0;
//    地的颜色：红 黄 蓝 绿
    String groundColor = null;
//    是否路障炸弹
    boolean groundRoadBlock = false;
    boolean groundBomb = false;
//  路障炸弹所属玩家的编号,玩家编号是1，2，3，4；默认值为null，表示不属于任何玩家
    String blockOfPlayer = null;
    String bombOfPlayer = null;


    public int getGroundLever() {
        return groundLever;
    }

    public void setGroundLever(int groundLever) {
        this.groundLever = groundLever;
    }

    public String getGroundColor() {
        return groundColor;
    }

    public void setGroundColor(String groundColor) {
        this.groundColor = groundColor;
    }

    public int getGroundCode() {
        return groundCode;
    }

    public void setGroundCode(int groundCode) {
        this.groundCode = groundCode;
    }

    public String getGroundType() {
        return groundType;
    }

    public void setGroundType(String groundType) {
        this.groundType = groundType;
    }

    public String getGroundOwner() {
        return groundOwner;
    }

    public void setGroundOwner(String groundOwner) {
        this.groundOwner = groundOwner;
    }

    public int getGroundPrice() {
        return groundPrice;
    }

    public void setGroundPrice(int groundPrice) {
        this.groundPrice = groundPrice;
    }

    public boolean isGroundBomb() {
        return groundBomb;
    }

    public void setGroundBomb(boolean groundBomb) {
        this.groundBomb = groundBomb;
    }

    public boolean isGroundRoadBlock() {
        return groundRoadBlock;
    }

    public void setGroundRoadBlock(boolean groundRoadBlock) {
        this.groundRoadBlock = groundRoadBlock;
    }

    public String getBlockOfPlayer() {
        return blockOfPlayer;
    }

    public void setBlockOfPlayer(String blockOfPlayer) {
        this.blockOfPlayer = blockOfPlayer;
    }

    public String getBombOfPlayer() {
        return bombOfPlayer;
    }

    public void setBombOfPlayer(String bombOfPlayer) {
        this.bombOfPlayer = bombOfPlayer;
    }

//    public Ground (int groundNumber){
//        this.groundCode = groundNumber;
//    }


}
