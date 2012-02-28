package tw.homework.classtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class InputPlayerMoney {
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
    public static void main(String[] args) throws IOException {
        InputPlayerMoney tm = new InputPlayerMoney();
        tm.testMoney();
    }
}
