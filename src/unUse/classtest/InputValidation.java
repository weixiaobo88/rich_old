package unUse.classtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *   输入的有效性验证
 */
public class InputValidation {
//    玩家编号输入验证
    public ArrayList<String> testPlayer() throws IOException
    {
        ArrayList<String> playerList = new	ArrayList<String>();
        boolean flag = true;
        while(flag)
        {
            System.out.println("请输入玩家编号...");

            BufferedReader buffer = new BufferedReader(new InputStreamReader(
                    System.in));
            String inputStr = buffer.readLine();
            int inputNum = inputStr.length();
            boolean [] playerExist = new boolean[4];
            char [] playerNum ;
            Pattern numCompare = Pattern.compile("[1-4]*");

            if (!numCompare.matcher(inputStr).matches()) {
                System.out.println("您输入的玩家编号有非法字符，请输入正确的玩家编号！");
                continue;
            }

            if (inputNum < 2 || inputNum > 4) {
                System.out.println("您输入的玩家数目不对，请选择2位到4位玩家！");
                continue;
            }

            playerNum = inputStr.toCharArray();
            for(int i=0; i<playerNum.length; i++)
            {
                if(playerNum[i]=='1')
                {
                    if(playerExist[0])//说明已存在
                    {
                        System.out.println("您输入的玩家编号中有重复的\"1\",请重新输入...");
                        playerExist = new boolean[4];
                        break;
                    }
                    else
                        playerExist[0] = true;
                }
                else if(playerNum[i]=='2')
                {
                    if(playerExist[1])//说明已存在
                    {
                        System.out.println("您输入的玩家编号中有重复的\"2\",请重新输入...");
                        playerExist = new boolean[4];
                        break;
                    }
                    else
                    {
                        playerExist[1] = true;
                    }
                }

                else if(playerNum[i]=='3')
                {
                    if(playerExist[2])//说明已存在
                    {
                        System.out.println("您输入的玩家编号中有重复的\"3\",请重新输入...");
                        playerExist = new boolean[4];
                        break;
                    }
                    else
                        playerExist[2] = true;
                }

                else if(playerNum[i]=='4')
                {
                    if(playerExist[3])//说明已存在
                    {
                        System.out.println("您输入的玩家编号中有重复的\"4\",请重新输入...");
                        playerExist = new boolean[4];
                        break;
                    }
                    else
                        playerExist[3] = true;
                }

            }
            if(!playerExist[0] && !playerExist[1] && !playerExist[2] && !playerExist[3])
                continue;
            else
            {
                System.out.println("您输入的玩家编号是：");
                for(int j=0; j<playerNum.length; j++)
                {
                    System.out.print(playerNum[j]+" ");
                    playerList.add(String.valueOf(playerNum[j]));
                }
                flag = false;
            }
        }
        return playerList;
    }

//    玩家初始资金输入验证
    public int testMoney() throws IOException
    {
        boolean flag = true;
        int inputNumInt = 0;
        while(flag)
        {
            System.out.println("请输入玩家初始资金...");

            BufferedReader buffer = new BufferedReader(new InputStreamReader(
                    System.in));
            String inputStr = buffer.readLine();
            int inputNum = inputStr.length();

            Pattern moneyCompare = Pattern.compile("[0-9]*");

            if(inputNum != 0){
                if (!moneyCompare.matcher(inputStr).matches()) {
                    System.out.println("您输入的初始资金有非法字符，请输入正确的初始资金！");
                    continue;
                }
                else {
                    inputNumInt = Integer.parseInt(inputStr);
                }

                if (inputNumInt < 1000 || inputNumInt > 50000) {
                    System.out.println("您输入的初始资金超出范围，请输入1000~50000的数字！");
                    continue;
                }
            }
            else {
                inputNumInt = 10000;
            }
            System.out.println("您设置的初始资金是：" + inputNumInt);
            flag = false;
        }
        return inputNumInt;
    }

//    输入命令验证
    public void testOrder(String inputStr, String orderStr) throws IOException {
        boolean flag = true;
        while(flag)
        {
            int inputNum = inputStr.length();
            if(inputNum != 0){
                if (!inputStr.equalsIgnoreCase(orderStr)) {
                    System.out.println("输入错误，请输入命令：" + orderStr);
                    BufferedReader buffer = new BufferedReader(new InputStreamReader(
                            System.in));
                    inputStr = buffer.readLine();
                    continue;
                }
                else {
//                    System.out.println("输入成功");
//                    输入命令，进行相应操作
//                    OrderOperation orderOperation = new OrderOperation();
//                    orderOperation.orderOperationMethod(orderStr);
                    break;
                }
            }
            else {
                System.out.println("请输入命令：" + orderStr);
                BufferedReader buffer = new BufferedReader(new InputStreamReader(
                        System.in));
                inputStr = buffer.readLine();
                continue;
            }

        }
    }


}
