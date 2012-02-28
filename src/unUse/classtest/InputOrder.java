package tw.homework.classtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//将验证方法都写在同一个类中（合并）
public class InputOrder {
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
                    System.out.println("输入成功");
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

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(
                System.in));
        String inputStr = buffer.readLine();
        InputOrder io = new InputOrder();
        io.testOrder(inputStr, "roll");
    }

}
