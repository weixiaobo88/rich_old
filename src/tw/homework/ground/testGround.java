package tw.homework.ground;

import org.junit.Test;

import javax.swing.*;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class testGround {
    @Test
    public void testNumberAndType(){
        int i;
        ArrayList arrayList = new ArrayList();
        //String[] type = {"S", "H", "T", "G", "P", "M"};
        //int[] number = {0, 14, 28, 35, 49, 63};
        Ground[] ground = new Ground[70];
        //ground[0] = new Ground(0, "S");
        for( i = 0; i <= 69; i++){
            ground[i] = new Ground(i);
            if( i == 0){
                ground[i].groundType = "S";
            }
            else if ( i == 14) {
                ground[i].groundType = "H";
            }
            else if (i == 28){
                ground[i] .groundType = "T";
            }
            else if (i == 35){
                ground[i] .groundType = "G";
            }
            else if (i == 49){
                ground[i] .groundType = "P";
            }
            else if (i == 63){
                ground[i] .groundType = "M";
            }
            else if( i > 63 && i < 70 ){
                ground[i] .groundType = "$";
            }
            else {
                ground[i].groundType = "0";
                if( (i >= 1 && i <= 13) || (i>= 15 && i<= 27)){
                    ground[i].groundPrice = 200; 
                }
                else if( i >= 29 && i <= 34){
                    ground[i].groundPrice = 500;
                }
                else if( (i >= 36 && i <= 48) || (i>= 50 && i<= 62)){
                    ground[i].groundPrice = 300;
                }
            }
        }
        assertEquals("S", ground[0].groundType);
        assertEquals("H", ground[14].groundType);
        assertEquals("T", ground[28].groundType);
        assertEquals("G", ground[35].groundType);
        assertEquals("P", ground[49].groundType);
        assertEquals("M", ground[63].groundType);
        assertEquals("$", ground[64].groundType);
        assertEquals("0", ground[1].groundType);

        printMap(ground);
        System.out.println("\u001B[31m" + "test" + "\u001b[m");
    }
    //二维数组记录 打印
    private void printMap(Ground[] ground) {
        int int1 = 8;
        int int2 = 29;
        String[][] array = new String[int1][int2];
        int i = 0;
        int j = 0;
        // 从左到右横的开始
        for ( ; j < int2; j++) {
            array[i][j] = ground [j].groundType;
        }
        // 从上到下纵
        for (int k = 1; k < int1; k++) {
            array[k][int2 - 1] = ground[j++].groundType;
        }
        // 从右到左横
        for (int l = int2 - 2; l >= i; l--) {
            array[int1 - 1][l] = ground[j++].groundType;
        }
        // 从下到上纵
        for (int m = int1 - 2; m > 0; m--) {
            array[m][0] = ground[j++].groundType;
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
}
