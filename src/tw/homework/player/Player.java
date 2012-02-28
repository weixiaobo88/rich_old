package tw.homework.player;

import tw.homework.playerMagic.PlayerMagic;

public class Player {
//    玩家编号
    String playerCode;
//    玩家姓名
    String playerName;
//    玩家符号
    String playerSymbol;
//    玩家颜色
    String playerColor;
//    玩家当前位置
    int playerLocation = 0;
//    玩家资金
    int playerMoney;
//    玩家点数 :购买道具
    int playerPoints;
//    ----玩家固定资产:空地数量
    int assetsOpenSpaceNum = 0;
//   ----玩家固定资产:茅屋数量
    int assetsHutNum = 0;
    //   ----玩家固定资产:洋房数量
    int assetsForeignHouseNum = 0;
//   ----玩家固定资产:摩天楼数量
    int assetsSkyscraperNum = 0;
//
//    ---tool---玩家路障个数
    int toolRoadBlockNum = 0;
//    ---tool---玩家炸弹个数
    int toolBombNum = 0;
//    ---tool---机器娃娃个数
    int toolRobotNum = 0;
//    ---gift---玩家礼品奖金
    int giftBonusNum = 0;
//    ---gift---玩家礼品点数卡
    int giftPointsCardNum = 0;
//    ---gift---玩家礼品福神
    int giftFortuneNum = 0;

//    玩家魔法
    int magicNumber = 0;
    PlayerMagic[] playerMagic = new PlayerMagic[magicNumber];

    public String getPlayerCode() {
        return playerCode;
    }

    public void setPlayerCode(String playerCode) {
        this.playerCode = playerCode;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerSymbol() {
        return playerSymbol;
    }

    public void setPlayerSymbol(String playerSymbol) {
        this.playerSymbol = playerSymbol;
    }

    public String getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(String playerColor) {
        this.playerColor = playerColor;
    }

    public int getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(int playerLocation) {
        this.playerLocation = playerLocation;
    }

    public int getPlayerMoney() {
        return playerMoney;
    }

    public void setPlayerMoney(int playerMoney) {
        this.playerMoney = playerMoney;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerPoints(int playerPoints) {
        this.playerPoints = playerPoints;
    }

    public int getAssetsOpenSpaceNum() {
        return assetsOpenSpaceNum;
    }

    public void setAssetsOpenSpaceNum(int assetsOpenSpaceNum) {
        this.assetsOpenSpaceNum = assetsOpenSpaceNum;
    }

    public int getAssetsHutNum() {
        return assetsHutNum;
    }

    public void setAssetsHutNum(int assetsHutNum) {
        this.assetsHutNum = assetsHutNum;
    }

    public int getAssetsForeignHouseNum() {
        return assetsForeignHouseNum;
    }

    public void setAssetsForeignHouseNum(int assetsForeignHouseNum) {
        this.assetsForeignHouseNum = assetsForeignHouseNum;
    }

    public int getAssetsSkyscraperNum() {
        return assetsSkyscraperNum;
    }

    public void setAssetsSkyscraperNum(int assetsSkyscraperNum) {
        this.assetsSkyscraperNum = assetsSkyscraperNum;
    }

    public int getToolRoadBlockNum() {
        return toolRoadBlockNum;
    }

    public void setToolRoadBlockNum(int toolRoadBlockNum) {
        this.toolRoadBlockNum = toolRoadBlockNum;
    }

    public int getToolBombNum() {
        return toolBombNum;
    }

    public void setToolBombNum(int toolBombNum) {
        this.toolBombNum = toolBombNum;
    }

    public int getToolRobotNum() {
        return toolRobotNum;
    }

    public void setToolRobotNum(int toolRobotNum) {
        this.toolRobotNum = toolRobotNum;
    }

    public int getGiftBonusNum() {
        return giftBonusNum;
    }

    public void setGiftBonusNum(int giftBonusNum) {
        this.giftBonusNum = giftBonusNum;
    }

    public int getGiftPointsCardNum() {
        return giftPointsCardNum;
    }

    public void setGiftPointsCardNum(int giftPointsCardNum) {
        this.giftPointsCardNum = giftPointsCardNum;
    }

    public int getGiftFortuneNum() {
        return giftFortuneNum;
    }

    public void setGiftFortuneNum(int giftFortuneNum) {
        this.giftFortuneNum = giftFortuneNum;
    }

    public int getMagicNumber() {
        return magicNumber;
    }

    public void setMagicNumber(int magicNumber) {
        this.magicNumber = magicNumber;
    }

 //住院
    public void goToHospital(Player player) {
        //To change body of created methods use File | Settings | File Templates.
    }
//进入道具屋
    public void goToToolHouse(Player player) {

    }

    public void goToGiftHouse(Player player) {
        //To change body of created methods use File | Settings | File Templates.
    }

    public void goToPrison(Player player) {
        //To change body of created methods use File | Settings | File Templates.
    }

    public void goToMagicHouse(Player player) {
        //To change body of created methods use File | Settings | File Templates.
    }

    public void goToAreaMine(Player player) {
        //To change body of created methods use File | Settings | File Templates.
    }

    public void goToArea12(Player player) {
        //To change body of created methods use File | Settings | File Templates.
    }

    public void goToArea3(Player player) {
        //To change body of created methods use File | Settings | File Templates.
    }

    public void goToArea45(Player player) {
        //To change body of created methods use File | Settings | File Templates.
    }
}
