package tw.homework.classtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class testDup {

	/**
	 * @param args
	 * @throws java.io.IOException
	 * 
	 */
	
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
				System.out.println("您输入的玩家编号中是：");
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
			
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		testDup tt = new testDup();
		tt.testPlayer();
	}

}
